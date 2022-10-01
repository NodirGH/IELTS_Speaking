package com.example.ieltsspeaking.home.category.part1Topic.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ModelPartsTopic(
    val id: Int,
    val orderNumber: Int,
    val heading: String,
    val questionCount: Int,
    val background: Int
): Parcelable