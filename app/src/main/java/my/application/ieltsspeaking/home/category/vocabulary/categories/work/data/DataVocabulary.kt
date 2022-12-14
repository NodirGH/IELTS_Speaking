package my.application.ieltsspeaking.home.category.vocabulary.categories.work.data

import my.application.ieltsspeaking.home.category.vocabulary.categories.model.ModelVocabularyWordlist


class DataVocabulary {
    companion object{
        fun getWorkWords():List<ModelVocabularyWordlist>{
            return listOf(
            ModelVocabularyWordlist(1, "to get involve in"),
            ModelVocabularyWordlist(2, "to fit in"),
            ModelVocabularyWordlist(3, "job flexibility"),
            ModelVocabularyWordlist(4, "nine-to-five work"),
            ModelVocabularyWordlist(5, "to dedicate"),
            ModelVocabularyWordlist(6, "world-class"),
            ModelVocabularyWordlist(7, "perk"),
            ModelVocabularyWordlist(8, "overloaded")
            )
        }
    }
}