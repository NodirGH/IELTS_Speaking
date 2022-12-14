package my.application.ieltsspeaking.home.category.vocabulary.model

data class VocabularyModel(
    val id: Int,
    val heading: String,
    val wordCount: Int,
    val learnedPercent: Int,
    val backgroundColor: Int,
    val backgroundPicture: Int
)