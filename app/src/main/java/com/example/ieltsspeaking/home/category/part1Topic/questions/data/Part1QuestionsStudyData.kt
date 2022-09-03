package com.example.ieltsspeaking.home.category.part1Topic.questions.data

import com.example.ieltsspeaking.home.category.part1Topic.questions.model.ModelPart1Questions

class Part1QuestionsStudyData {
    companion object{
        fun getStudyQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "What is your name", false),
                ModelPart1Questions(2, "Where du you live", false),
                ModelPart1Questions(3, "Describe your city", false),
                ModelPart1Questions(4, "What do people do in their free time", false),
                ModelPart1Questions(5, "What is your hobby", false),
                ModelPart1Questions(6, "What is the weather like in your country", false),
                ModelPart1Questions(7, "What clothes do you wear", false),
                ModelPart1Questions(8, "What kind of food do you eat", false),
                ModelPart1Questions(9, "Do you like listening to music", false),
                ModelPart1Questions(10, "Do you work or study", false),
                ModelPart1Questions(11, "What is your name", false),
                ModelPart1Questions(12, "Where du you live", false),
                ModelPart1Questions(13, "Describe your city", false),
                ModelPart1Questions(14, "What do people do in their free time", false),
                ModelPart1Questions(15, "What is your hobby", false),
                ModelPart1Questions(16, "What is the weather like in your country", false),
                ModelPart1Questions(17, "What clothes do you wear", false),
                ModelPart1Questions(18, "What kind of food do you eat", false),
                ModelPart1Questions(19, "Do you like listening to music", false),
                ModelPart1Questions(20, "Do you work or study", false)

            )
        }

        fun getWorkQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "11111Do you work or study", false),
                ModelPart1Questions(2, "Where du you live", false),
                ModelPart1Questions(3, "Describe your city", false),
                ModelPart1Questions(4, "What do people do in their free time", false),
                ModelPart1Questions(5, "What is your hobby", false),
                ModelPart1Questions(6, "What is the weather like in your country", false),
                ModelPart1Questions(7, "What clothes do you wear", false),
                ModelPart1Questions(8, "What kind of food do you eat", false),
                ModelPart1Questions(9, "Do you like listening to music", false),
                ModelPart1Questions(10, "What is your name", false),
                ModelPart1Questions(11, "111111111", false)


            )
        }

    }
}