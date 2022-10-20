package com.example.ieltsspeaking.home.category.part3Topic.question.data

import com.example.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions

class Part3QuestionsData {
    companion object{

        fun getWeatherQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Weather01", false),
                ModelPartsQuestions(2, "Weather02", false),
                ModelPartsQuestions(3, "Weather03", false),
                ModelPartsQuestions(4, "Weather04", false),
                ModelPartsQuestions(5, "Weather05", false),
                ModelPartsQuestions(6, "Weather06", false),
                ModelPartsQuestions(7, "Weather07", false),
                ModelPartsQuestions(8, "Weather08", false),
                ModelPartsQuestions(9, "Weather09", false),
                ModelPartsQuestions(10, "Weather10", false)
            )
        }

        fun getWrongError():List<ModelPartsQuestions>{
            return listOf(
            ModelPartsQuestions(1, "Weather01", false),
            ModelPartsQuestions(2, "Weather02", false),
            ModelPartsQuestions(3, "Weather03", false),
            ModelPartsQuestions(4, "Weather04", false),
            ModelPartsQuestions(5, "Weather05", false),
            ModelPartsQuestions(6, "Weather06", false),
            ModelPartsQuestions(7, "Weather07", false),
            ModelPartsQuestions(8, "Weather08", false),
            ModelPartsQuestions(9, "Weather09", false),
            ModelPartsQuestions(10, "Weather10", false)
            )
        }
    }
}