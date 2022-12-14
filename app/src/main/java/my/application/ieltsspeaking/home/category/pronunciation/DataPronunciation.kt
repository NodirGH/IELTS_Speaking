package my.application.ieltsspeaking.home.category.pronunciation

class DataPronunciation {
    companion object{
        fun getPronunciationData(): List<ModelPronunciation>{
            return listOf(
                ModelPronunciation(1, "Pronunciation"),
                ModelPronunciation(2, "Ben Franklin Method"),
                ModelPronunciation(3, "Idioms"),
                ModelPronunciation(4, "Slang"),
                ModelPronunciation(5, "Phrasal verbs"),
                ModelPronunciation(6, "Homophones"),
                ModelPronunciation(7, "Useful tips")
            )
        }
    }
}