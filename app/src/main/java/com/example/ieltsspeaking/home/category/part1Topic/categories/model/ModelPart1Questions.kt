package com.example.ieltsspeaking.home.category.part1Topic.categories.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelPart1Questions(
    val id: Int,
    val question: String,
    val isLearned: Boolean
): Parcelable