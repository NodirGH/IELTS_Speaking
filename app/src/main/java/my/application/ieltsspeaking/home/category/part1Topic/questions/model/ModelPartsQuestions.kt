package my.application.ieltsspeaking.home.category.part1Topic.questions.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelPartsQuestions(
    val id: Int,
    val question: String,
    val isLearned: Boolean
): Parcelable