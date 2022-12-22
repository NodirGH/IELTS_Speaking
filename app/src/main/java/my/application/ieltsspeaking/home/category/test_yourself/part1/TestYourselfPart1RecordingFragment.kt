package my.application.ieltsspeaking.home.category.test_yourself.part1

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.media.MediaPlayer
import android.media.MediaRecorder
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import my.application.ieltsspeaking.databinding.FragmentTestYourselfPart1RecordingBinding
import my.application.ieltsspeaking.home.category.test_yourself.local.RecordingViewModel
import my.application.ieltsspeaking.home.category.test_yourself.model.TestYourselfModel
import my.application.ieltsspeaking.home.category.test_yourself.timer.Timer
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

const val REQUEST_CODES = 201
private const val QUESTION = "question"
private const val ANSWER = "answer"

class TestYourselfPart1RecordingFragment : Fragment(), Timer.OnTimeTickListener {

    private lateinit var binding: FragmentTestYourselfPart1RecordingBinding
    private var permissions = arrayOf(Manifest.permission.RECORD_AUDIO)
    private var permissionGranted = false
    private lateinit var recordingLocation: String
    private lateinit var recorder: MediaRecorder
    private var dirPath = ""
    var filename = ""
    private var isRecording = false
    private var isPaused = false
    private lateinit var timer: Timer
    private lateinit var vibrator: Vibrator
    private var isExpandableOpen: Boolean = false
    private var question: String? = null
    private var answer: String? = null
    private val viewModel: RecordingViewModel by viewModels()
    private var testYourselfModel: TestYourselfModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            question = it.getString(QUESTION)
            answer = it.getString(ANSWER)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestYourselfPart1RecordingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vibrator = activity?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        binding.tvPart1Question.text = this.question
        binding.tvSampleAnswer.text = this.answer
        timer = Timer(this)

        permissionRequest()

        binding.btnRecord.setOnClickListener { activateBtnRecord() }
        binding.btnStop.setOnClickListener { activateBtnStop() }
        binding.btnPlay.setOnClickListener { playRecording() }
        binding.btnSampleAnswer.setOnClickListener { activateBtnSampleAnswer() }

    }

    private fun permissionRequest() {
        permissionGranted = ContextCompat.checkSelfPermission(
            requireContext(),
            permissions[0]
        ) == PackageManager.PERMISSION_GRANTED

        if (!permissionGranted) {
            requestPermissions(permissions, REQUEST_CODES)
        }
    }

    private fun activateBtnRecord() {
        when {
            isPaused -> resumeRecording()
            isRecording -> pauseRecording()
            else -> startRecording()
        }
        vibrator.vibrate(
            VibrationEffect.createOneShot(
                50,
                VibrationEffect.DEFAULT_AMPLITUDE
            )
        )
    }

    private fun activateBtnStop() {
        stopRecording()
        vibrator.vibrate(
            VibrationEffect.createOneShot(
                50,
                VibrationEffect.DEFAULT_AMPLITUDE
            )
        )
    }

    private fun playRecording() {
        if (dirPath == "" && filename == "") {
            Toast.makeText(requireContext(), "Haven't recorded yet", Toast.LENGTH_SHORT).show()
        } else {

            val mediaPlayer = MediaPlayer()

            try {
                mediaPlayer.setDataSource(recordingLocation)
            } catch (e: IOException) {
                Toast.makeText(
                    requireContext(),
                    "recordingLocation isn't initialized",
                    Toast.LENGTH_SHORT
                ).show()
            }

            try {
                mediaPlayer.prepare()
            } catch (e: IOException) {
                Toast.makeText(requireContext(), "Press stop button first", Toast.LENGTH_SHORT)
                    .show()
            }
            mediaPlayer.start()
        }
        binding.laRecordingDone.visibility = View.GONE
        binding.laPlayingRecording.visibility = View.VISIBLE
        binding.laPlayingRecording.playAnimation()

    }

    private fun activateBtnSampleAnswer() {
        if (isExpandableOpen) {
            binding.tvSampleAnswer.visibility = View.GONE
        } else {
            binding.tvSampleAnswer.visibility = View.VISIBLE
        }
    }

    private fun startRecording() {
        if (!permissionGranted) {
            requestPermissions(permissions, REQUEST_CODES)
            return
        }
        recorder = MediaRecorder()
        dirPath = "${activity?.externalCacheDir?.absolutePath}"

        val simpleDateFormat = SimpleDateFormat("yyyy.MM.DD_hh.mm_ss")
        val date = simpleDateFormat.format(Date())
        filename = "audio_record_$date"
        recordingLocation = "$dirPath$filename.mp3"

        recorder.apply {
            setAudioSource(MediaRecorder.AudioSource.MIC)
            setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
            setOutputFile(recordingLocation)

            try {
                recorder.prepare()
            } catch (e: IOException) {
                Toast.makeText(
                    requireContext(),
                    "prepare() function isn't working",
                    Toast.LENGTH_SHORT
                ).show()
            }
            start()

        }
//            viewModel.insertingRecording(roomRecording)
//        testYourselfModel?.record = roomRecording
        isRecording = true
        isPaused = false

        binding.btnPlay.visibility = View.GONE
        binding.btnStop.visibility = View.GONE
        binding.btnShare.visibility = View.GONE
        binding.btnDelete.visibility = View.GONE
        binding.laRecordingDone.visibility = View.GONE
        binding.laPlayingRecording.visibility = View.GONE
        binding.btnRecord.visibility = View.INVISIBLE
        binding.laRecordingProcess.playAnimation()

        timer.start()

    }

    private fun pauseRecording() {
        recorder.pause()
        isPaused = true
        binding.btnStop.visibility = View.VISIBLE

        timer.pause()
    }

    private fun resumeRecording() {
        recorder.resume()
        isPaused = false

        timer.start()
    }

    private fun stopRecording() {
        if (dirPath == "" && filename == "") {
            Toast.makeText(requireContext(), "Haven't recorded yet", Toast.LENGTH_SHORT).show()
        } else {
            recorder.stop()
            timer.stop()
            binding.laRecordingDone.playAnimation()
            binding.waveformView.visibility = View.GONE
            binding.laRecordingDone.visibility = View.VISIBLE

            binding.btnPlay.visibility = View.VISIBLE
            binding.btnStop.visibility = View.VISIBLE
            binding.btnShare.visibility = View.VISIBLE
            binding.btnDelete.visibility = View.VISIBLE
            binding.laPlayingRecording.visibility = View.GONE
            binding.btnRecord.visibility = View.VISIBLE
            binding.laRecordingProcess.visibility = View.GONE
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == REQUEST_CODES)
            permissionGranted = grantResults[0] == PackageManager.PERMISSION_GRANTED
    }

    override fun onTimeTick(duration: String) {
        binding.tvTimer.text = duration
        binding.waveformView.addAmplitude(recorder.maxAmplitude.toFloat())
    }

    companion object {
        @JvmStatic
        fun newInstance(question: String, answer: String) =
            TestYourselfPart1RecordingFragment().apply {
                arguments = Bundle().apply {
                    putString(QUESTION, question)
                    putString(ANSWER, answer)

                }
            }
    }

}