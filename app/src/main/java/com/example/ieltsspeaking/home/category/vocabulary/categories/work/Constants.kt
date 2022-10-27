package com.example.ieltsspeaking.home.category.vocabulary.categories.work

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "1. work life balance",
            "manage both work and private life",
            "Work harder",
            "focus on study",
            "Carelessly do in both work and life",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "2. Accommodation",
            "work place",
            "home",
            "hotel",
            "city",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "Study",
            "listen to music",
            "enjoying life",
            "working hard",
            "Learn something new",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "Computer",
            "school",
            "technology",
            "brick",
            "tree",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "Knowledge",
            "playing smth",
            "Get something when we learn",
            "pen",
            "number",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "Goal",
            "telephone",
            "something which one wants to achieve",
            "action",
            "none",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "World",
            "the place where all people live",
            "the place where we study",
            "the place where go swim",
            "the place where we watch movies",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "Football",
            "game played with foot",
            "game played with hand",
            "game played with head",
            "Chess game",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "Light which shines and hot",
            "cloud",
            "moon",
            "sun",
            "sky",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "Last question",
            "initial question",
            "question pre last one",
            "middle question",
            "question which stands at the end",
            4
        )
        questionList.add(que10)



        return questionList
    }
}