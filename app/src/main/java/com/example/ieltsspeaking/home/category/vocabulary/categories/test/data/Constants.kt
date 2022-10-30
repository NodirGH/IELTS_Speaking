package com.example.ieltsspeaking.home.category.vocabulary.categories.test.data

import com.example.ieltsspeaking.home.category.vocabulary.categories.test.model.Question

object Constants {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWorkQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "1. to get involve in",
            "to become a part of (an organization)",
            "devote (time or effort) to a particular task or purpose",
            "an advantage or something extra that you are given because of your job",
            "to give excessive work, responsibility, or information to",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "2. to fit in",
            "of or among the best in the world",
            "to become suitable or appropriate",
            "the normal work schedule for most jobs",
            "gives employees flexibility on how long, where, and when they work",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "job flexibility",
            "devote (time or effort) to a particular task or purpose",
            "to give excessive work, responsibility, or information to",
            "an advantage or something extra that you are given because of your job",
            "gives employees flexibility on how long, where, and when they work",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "nine-to-five work",
            "to become suitable or appropriate",
            "the normal work schedule for most jobs",
            "to become a part of (an organization)",
            "of or among the best in the world",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "to dedicate",
            "to give excessive work, responsibility, or information to",
            "devote (time or effort) to a particular task or purpose",
            "an advantage or something extra that you are given because of your job",
            "to become a part of (an organization)",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "world-class",
            "gives employees flexibility on how long, where, and when they work",
            "to become suitable or appropriate",
            "of or among the best in the world",
            "to give excessive work, responsibility, or information to",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "perk",
            "an advantage or something extra that you are given because of your job",
            "to become a part of (an organization)",
            "to become suitable or appropriate",
            "devote (time or effort) to a particular task or purpose",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "overloaded",
            "to give excessive work, responsibility, or information to",
            "the normal work schedule for most jobs",
            "of or among the best in the world",
            "an advantage or something extra that you are given because of your job",
            1
        )
        questionList.add(que8)

        return questionList
    }
}