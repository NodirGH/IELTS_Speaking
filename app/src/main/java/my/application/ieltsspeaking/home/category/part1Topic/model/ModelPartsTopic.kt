package my.application.ieltsspeaking.home.category.part1Topic.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ModelPartsTopic(
    val id: Int = 0,
    val orderNumber: Int = 0,
    val heading: String = "",
    val questionCount: Int = 0,
//    val background: Int
): Parcelable