package com.example.ieltsspeaking.home.category.vocabulary.data

import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.home.category.vocabulary.model.VocabularyModel

class VocabularyData{
    companion object{
        fun getVocabularyData(): List<VocabularyModel>{
            return listOf(
                VocabularyModel(1, "Work", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(2, "Travel", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(3, "Technology", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(4, "Sport", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(5, "Science", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(6, "Relationship", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(7, "Accommodation", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(8, "Education", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(9, "Hobby", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
                VocabularyModel(10, "Mixed", 10, 0, R.drawable.rounded_shape, R.drawable.phone_about),
            )
        }
    }
}
