package my.application.ieltsspeaking.home.category.test_yourself.local

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RecordingViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: RecordingRepository
    var errorMessage = MutableLiveData<String>()

    init {
        val recordingDao = RecordingDatabase.getDatabase(application).recordingDao()
        repository = RecordingRepository(recordingDao)
    }

    fun addRecording(recordingEntity: RecordingEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addRecord(recordingEntity)
        }
    }

//    fun insertingRecording(recording: String){
//        viewModelScope.launch(Dispatchers.IO) {
//            repository.addRecording(recording)
//        }
//    }

    fun insertInitialQuestions() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                repository.insertInitialQuestion()
            } catch (e: Exception) {
                Log.d(RecordingViewModel::class.java.name, e.message.toString())
                errorMessage.postValue(e.message)
            }
        }
    }

}