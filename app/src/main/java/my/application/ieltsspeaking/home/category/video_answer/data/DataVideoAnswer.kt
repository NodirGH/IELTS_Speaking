package my.application.ieltsspeaking.home.category.video_answer.data

import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.home.category.video_answer.model.ModelVideoAnswer

class DataVideoAnswer {
    companion object{
        fun videoAnswerBand6Data(): List<ModelVideoAnswer>{
            return listOf(
                ModelVideoAnswer(1, R.drawable.thumbnail1, "Information #1", "Given details #1"),
                ModelVideoAnswer(2, R.drawable.thumbnail2, "Information #2", "Given details #2"),
                ModelVideoAnswer(3, R.drawable.thumbnail3, "Information #3", "Given details #3"),
                ModelVideoAnswer(4, R.drawable.thumbnail4, "Information #4", "Given details #4"),
                ModelVideoAnswer(5, R.drawable.thumbnail5, "Information #5", "Given details #5"),
                ModelVideoAnswer(6, R.drawable.thumbnail1, "Information #6", "Given details #6"),
                ModelVideoAnswer(7, R.drawable.thumbnail2, "Information #7", "Given details #7"),
                ModelVideoAnswer(8, R.drawable.thumbnail3, "Information #8", "Given details #8"),
                ModelVideoAnswer(9, R.drawable.thumbnail4, "Information #9", "Given details #9"),
                ModelVideoAnswer(10, R.drawable.thumbnail5, "Information #10", "Given details #10")
            )
        }
    }
}