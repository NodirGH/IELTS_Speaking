package my.application.ieltsspeaking.home.category.part1Topic.data

import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic


class Part1TopicData {
    companion object {
        fun getPart1Data(): List<ModelPartsTopic> {
            return listOf(
                ModelPartsTopic(1, 1, "Work", 8, R.drawable.bg_part1_1),
                ModelPartsTopic(2, 2, "Study", 17, R.drawable.bg_part1_2),
                ModelPartsTopic(3, 3, "Hometown", 10, R.drawable.bg_part1_3),
                ModelPartsTopic(4, 4, "Home", 8, R.drawable.bg_part1_4),
                ModelPartsTopic(5, 5, "Art", 8, R.drawable.bg_part1_5),
                ModelPartsTopic(6, 6, "Birthday", 7, R.drawable.bg_part1_6),
                ModelPartsTopic(7, 7, "Childhood", 15, R.drawable.bg_part1_7),
                ModelPartsTopic(8, 8, "Clothes", 8, R.drawable.bg_part1_8),
                ModelPartsTopic(9, 9, "Daily routine", 12, R.drawable.bg_part1_9),
                ModelPartsTopic(10, 10, "Food", 12, R.drawable.bg_part1_10),
                ModelPartsTopic(11, 11, "Hobbies", 10, R.drawable.bg_part1_1),
                ModelPartsTopic(12, 12, "Internet", 11, R.drawable.bg_part1_2),
                ModelPartsTopic(13, 13, "Leisure time", 19, R.drawable.bg_part1_3),
                ModelPartsTopic(14, 14, "Music", 14, R.drawable.bg_part1_4),
                ModelPartsTopic(15, 15, "Shopping", 9, R.drawable.bg_part1_5)
            )
        }
    }
}