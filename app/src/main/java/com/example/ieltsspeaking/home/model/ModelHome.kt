package com.example.ieltsspeaking.home.model

import android.graphics.drawable.Icon
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelHome(
    val id: Int,
    val title: String,
    val icon: Int,
    var backgroundColor: Int
): Parcelable