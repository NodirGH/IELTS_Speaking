package com.example.ieltsspeaking.home.part1Topic.data

import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.home.part1Topic.model.ModelPart1Topic

class Part1TopicData {
    companion object {
        fun getPart1Data(): List<ModelPart1Topic> {
            return listOf(
                ModelPart1Topic(1, 1, "Work", 10, R.drawable.bg_part1_1),
                ModelPart1Topic(2, 2, "Study", 20, R.drawable.bg_part1_2),
                ModelPart1Topic(3, 3, "Hometown", 70, R.drawable.bg_part1_3),
                ModelPart1Topic(4, 4, "Home", 15, R.drawable.bg_part1_4),
                ModelPart1Topic(5, 5, "Art", 12, R.drawable.bg_part1_5),
                ModelPart1Topic(6, 6, "Birthday", 9, R.drawable.bg_part1_6),
                ModelPart1Topic(7, 7, "Childhood", 14, R.drawable.bg_part1_7),
                ModelPart1Topic(8, 8, "Clothes", 18, R.drawable.bg_part1_8),
                ModelPart1Topic(9, 9, "Daily routine", 20, R.drawable.bg_part1_9),
                ModelPart1Topic(10, 10, "Food", 10, R.drawable.bg_part1_10),
                ModelPart1Topic(11, 11, "Hobbies", 12, R.drawable.bg_part1_1),
                ModelPart1Topic(12, 12, "Internet", 9, R.drawable.bg_part1_2),
                ModelPart1Topic(13, 13, "Leisure time", 5, R.drawable.bg_part1_3),
                ModelPart1Topic(14, 14, "Music", 15, R.drawable.bg_part1_4),
                ModelPart1Topic(15, 15, "Shopping", 17, R.drawable.bg_part1_5)
            )
        }
    }
}