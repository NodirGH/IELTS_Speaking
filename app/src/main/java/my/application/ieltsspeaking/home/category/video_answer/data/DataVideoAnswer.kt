package my.application.ieltsspeaking.home.category.video_answer.data

import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.home.category.video_answer.model.ModelVideoAnswer

class DataVideoAnswer {
    companion object{
        fun videoAnswerBand6Data(): List<ModelVideoAnswer>{
            return listOf(
                ModelVideoAnswer(1, R.drawable.band6_thumbnail_1, "IELTS Speaking Band 6.0 Mock Test with Feedback", "Having a speaking test with wearing a mask can be another hurdle. Let's watch today's video and check how they did the test."),
                ModelVideoAnswer(2, R.drawable.band6_thumbnail_2, "IELTS Speaking Band 6 Sample", "English Mentor provides online and offline coaching for IELTS Exam in unique & easy way, our exam preparation is through modern methods that starts with confidence building & skill improvements"),
                ModelVideoAnswer(3, R.drawable.band6_thumbnail_3, "IELTS Speaking Interview | BAND 6.0 | Real Test!", "100% Free Practice IELTS Tests Links"),
                ModelVideoAnswer(4, R.drawable.band6_thumbnail_4, "IELTS Speaking Mock Test | Speaking: 6.0", "Бу сафарги сонда сиз  Асадбек Шукуровнинг speaking имтиҳонини қай тариқа топширганларига гувоҳ бўласиз!"),
                ModelVideoAnswer(5, R.drawable.band6_thumbnail_5, "IELTS SPEAKING TEST BAND SCORE 6.5 (2022)", "There are specific criteria used to calculate the IELTS speaking test scores. It is expected that you meet these criteria when you speak"),
                ModelVideoAnswer(6, R.drawable.band6_thumbnail_8, "IELTS Speaking Test band score 6.5 with feedback 2022", "In this video recorded at Ross IELTS Academy, we share the Mock test of Speaking of a candidate with a band score of 6.5. We have inserted the examiner's feedback at the end of the video.")
            )
        }
    }
}