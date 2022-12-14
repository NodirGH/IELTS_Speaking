package my.application.ieltsspeaking.home.category.test_yourself.waveform

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class WaveformView(context: Context?, attrs: AttributeSet?): View(context, attrs) {

    private var paint = Paint()
    private var amplitudes = ArrayList<Float>()
    private var spikes = ArrayList<RectF>()

    private var radius = 6f
    private var w = 9f
    private var d = 6f

    private var screenWeight = 0f
    private var screenHeight = 400f

    private var maxSpikes = 0

    init {
        paint.color = Color.rgb(244, 81, 30)

        screenWeight = resources.displayMetrics.widthPixels.toFloat()

        maxSpikes = (screenWeight / (w+d)).toInt()
    }

    fun addAmplitude(amp: Float){

        val norm = (amp.toInt() / 7).coerceAtMost(400).toFloat()  // changed here
        amplitudes.add(norm)


        spikes.clear()
        val amps = amplitudes.takeLast(maxSpikes)
        for (i in amps.indices) {
            val left = screenWeight - i*(w+d)
            val top = screenHeight/2 - amps[i]/2
            val right = left + w
            val bottom = top + amps[i]

            spikes.add(RectF(left, top, right, bottom))
        }

        invalidate()
    }

    override fun draw(canvas: Canvas?) {
        super.draw(canvas)
        spikes.forEach {
            canvas?.drawRoundRect(it, radius, radius,paint)
        }
    }

}