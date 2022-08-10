package com.example.ieltsspeaking.home.part1.data

import com.example.ieltsspeaking.home.part1.model.ModelPart1

class Part1Data {
    companion object {
        fun getPart1Data(): List<ModelPart1> {
            return listOf(
                ModelPart1(1, 1, "Work", 10),
                ModelPart1(2, 2, "Study", 20),
                ModelPart1(3, 3, "Hometown", 70),
                ModelPart1(4, 4, "Home", 15),
                ModelPart1(5, 5, "Art", 12),
                ModelPart1(6, 6, "Birthday", 9),
                ModelPart1(7, 7, "Childhood", 14),
                ModelPart1(8, 8, "Clothes", 18),
                ModelPart1(9, 9, "Daily routine", 20),
                ModelPart1(10, 10, "Food", 10),
                ModelPart1(11, 11, "Hobbies", 12),
                ModelPart1(12, 12, "Internet", 9),
                ModelPart1(13, 13, "Leisure time", 5),
                ModelPart1(14, 14, "Music", 15),
                ModelPart1(15, 15, "Shopping", 17)
            )
        }
    }
}