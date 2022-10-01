package com.example.ieltsspeaking.home.category.part2Topic.data

import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic

class Part2TopicData {
    companion object {
        fun getPart2Data(): List<ModelPartsTopic> {
            return listOf(
                ModelPartsTopic(1, 1, "Activity", 10, R.drawable.bg_part1_1),
                ModelPartsTopic(2, 2, "Advertisements", 20, R.drawable.bg_part1_2),
                ModelPartsTopic(3, 3, "Animal", 70, R.drawable.bg_part1_3),
                ModelPartsTopic(4, 4, "Clothes", 15, R.drawable.bg_part1_4),
                ModelPartsTopic(5, 5, "Colors", 12, R.drawable.bg_part1_5),
                ModelPartsTopic(6, 6, "Competition & Prizes", 9, R.drawable.bg_part1_6),
                ModelPartsTopic(7, 7, "Education", 14, R.drawable.bg_part1_7),
                ModelPartsTopic(8, 8, "Food & Health", 18, R.drawable.bg_part1_8),
                ModelPartsTopic(9, 9, "Music", 20, R.drawable.bg_part1_9),
                ModelPartsTopic(10, 10, "Money", 10, R.drawable.bg_part1_10),
                ModelPartsTopic(11, 11, "Plans", 12, R.drawable.bg_part1_1),
                ModelPartsTopic(12, 12, "Pollution", 9, R.drawable.bg_part1_2),
                ModelPartsTopic(13, 13, "Service", 5, R.drawable.bg_part1_3),
                ModelPartsTopic(14, 14, "Weather", 15, R.drawable.bg_part1_4),
                ModelPartsTopic(15, 15, "Technology & Devices", 17, R.drawable.bg_part1_5)
            )
        }
    }
}