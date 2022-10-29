package com.example.ieltsspeaking.home.category.vocabulary.categories.work.data

import com.example.ieltsspeaking.home.category.vocabulary.categories.model.ModelVocabularyWordlist

class DataVocabulary {
    companion object{
        fun getWorkWords():List<ModelVocabularyWordlist>{
            return listOf(
            ModelVocabularyWordlist(1, "work1"),
            ModelVocabularyWordlist(2, "work2"),
            ModelVocabularyWordlist(3, "work3"),
            ModelVocabularyWordlist(4, "work4"),
            ModelVocabularyWordlist(5, "work5"),
            ModelVocabularyWordlist(6, "work6"),
            ModelVocabularyWordlist(7, "work7"),
            ModelVocabularyWordlist(8, "work8"),
            ModelVocabularyWordlist(9, "work9"),
            ModelVocabularyWordlist(10, "work10")
            )
        }
    }
}