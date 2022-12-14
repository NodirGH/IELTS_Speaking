package my.application.ieltsspeaking.home.category.test_yourself.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import my.application.ieltsspeaking.home.category.test_yourself.local.RecordingEntity

@Parcelize
data class TestYourselfModel(
    val id: Int = 0,
    val record: String = "",
    val pause: Boolean = false,
    val stop: Boolean = false,
    val delete: Boolean = false,
    val share: Boolean = false,
    val orderNumber: Int = 0,
    val question: String = "",
    val sampleAnswerButton: Boolean = false,
    val answer: String = "",
    val playAnswer: String = ""
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