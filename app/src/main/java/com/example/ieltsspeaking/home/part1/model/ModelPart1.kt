package com.example.ieltsspeaking.home.part1.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ModelPart1(
    val id: Int,
    val orderNumber: Int,
    val heading: String,
    val questionCount: Int
): Parcelable