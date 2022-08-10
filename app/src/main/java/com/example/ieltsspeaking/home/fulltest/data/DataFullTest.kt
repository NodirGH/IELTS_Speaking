package com.example.ieltsspeaking.home.fulltest.data

import com.example.ieltsspeaking.home.fulltest.model.FullTestModel

class DataFullTest {

    companion object {
        fun getData(): List<FullTestModel> {
            return listOf(
                FullTestModel(1, "Math", "Five"),
                FullTestModel(2, "English", "Five"),
                FullTestModel(3, "Mother Tongue", "Four"),
                FullTestModel(4, "Russian", "Three"),
                FullTestModel(5, "PL", "Five"),
                FullTestModel(6, "History", "Four"),
                FullTestModel(7, "Physics", "Three"),
                FullTestModel(8, "Picturing", "Four"),
                FullTestModel(9, "Business", "Five"),
                FullTestModel(11, "Math", "Five"),
                FullTestModel(12, "English", "Five"),
                FullTestModel(13, "Mother Tongue", "Four"),
                FullTestModel(14, "Russian", "Three"),
                FullTestModel(15, "PL", "Five"),
                FullTestModel(16, "History", "Four"),
                FullTestModel(17, "Physics", "Three"),
                FullTestModel(18, "Picturing", "Four"),
                FullTestModel(19, "Business", "Five"),
                FullTestModel(20, "Final work", "Five")
                )
        }
    }
}