package my.application.ieltsspeaking.home.category.test_yourself.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import my.application.ieltsspeaking.home.category.test_yourself.local.RecordingEntity

@Parcelize
data class TestYourselfModel(
    var id: Int = 0,
    var record: String = "",
    var pause: Boolean = false,
    var stop: Boolean = false,
    var delete: Boolean = false,
    var share: Boolean = false,
    var orderNumber: Int = 0,
    var question: String = "",
    var sampleAnswerButton: Boolean = false,
    var answer: String = "",
    var playAnswer: String = ""
): Parcelable{
    fun mapToEntity(): RecordingEntity {
        return RecordingEntity(
            id = id,
            record = playAnswer,
            play = playAnswer,
            orderNumber = orderNumber,
            pause = pause,
            stop = stop,
            delete = delete,
            share = share,
            question = question,
            sampleAnswer = answer,
            sampleAnswerButton = sampleAnswerButton
        )
    }
}