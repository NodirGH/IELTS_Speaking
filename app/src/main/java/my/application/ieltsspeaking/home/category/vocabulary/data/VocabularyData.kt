package my.application.ieltsspeaking.home.category.vocabulary.data

import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.home.category.vocabulary.model.VocabularyModel


class VocabularyData{
    companion object{
        fun getVocabularyData(): List<VocabularyModel>{
            return listOf(
                VocabularyModel(1, "Work", 10, 0, R.drawable.bg_vocabulary_work, R.drawable.work),
                VocabularyModel(2, "Travel", 10, 0, R.drawable.bg_vocabulary_travel, R.drawable.travel),
                VocabularyModel(3, "Technology", 10, 0, R.drawable.bg_vocabulary_technology, R.drawable.technology),
                VocabularyModel(4, "Sport", 10, 0, R.drawable.bg_vocabulary_sport, R.drawable.sports),
                VocabularyModel(5, "Science", 10, 0, R.drawable.bg_vocabulary_science, R.drawable.science),
                VocabularyModel(6, "Relationship", 10, 0, R.drawable.bg_vocabulary_relationship, R.drawable.relationship),
                VocabularyModel(7, "Accommodation", 10, 0, R.drawable.bg_vocabulary_accomidation, R.drawable.accommodation),
                VocabularyModel(8, "Education", 10, 0, R.drawable.bg_vocabulary_education, R.drawable.education),
                VocabularyModel(9, "Hobby", 10, 0, R.drawable.bg_vocabulary_hobby, R.drawable.hobby),
                VocabularyModel(10, "Mixed", 10, 0, R.drawable.bg_vocabulary_mixed, R.drawable.mixed),
            )
        }
    }
}