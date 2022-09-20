package com.example.ieltsspeaking.home.category.part1Topic.questions.data

import com.example.ieltsspeaking.home.category.part1Topic.questions.model.ModelPart1Questions

class Part1QuestionsStudyData {
    companion object{
        fun getWorkQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "What do you do?", false),
                ModelPart1Questions(2, "What are your responsibilities?", false),
                ModelPart1Questions(3, "Why did you choose to do that type of work (or, that job)?", false),
                ModelPart1Questions(4, "Is there some other kind of work you would rather do?", false),
                ModelPart1Questions(5, "Describe the company or organization you work for.", false),
                ModelPart1Questions(6, "Do you enjoy your work?", false),
                ModelPart1Questions(7, "What do you like/dislike about your job?", false),
                ModelPart1Questions(8, "Do you miss being a student?", false)
            )
        }

        fun getStudyQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "Do you work or study?", false),
                ModelPart1Questions(2, "Where do you study?", false),
                ModelPart1Questions(3, "What is the name of your college/ university?", false),
                ModelPart1Questions(4, "What subject are you studying?", false),
                ModelPart1Questions(5, "Which part of the course do you enjoy most?", false),
                ModelPart1Questions(6, "Why did you choose to study that?", false),
                ModelPart1Questions(7, "Is it a difficult subject to study?", false),
                ModelPart1Questions(8, "What is your favourite subject?", false),
                ModelPart1Questions(9, "What kind of school did you go to?", false),
                ModelPart1Questions(10, "What was your favourite subject at school?", false),
                ModelPart1Questions(11, "What is the best thing about your university/school?", false),
                ModelPart1Questions(12, "What part of university life do you like best?", false),
                ModelPart1Questions(13, "What is the educational system like in your country?", false),
                ModelPart1Questions(14, "What are your future study plans?", false),
                ModelPart1Questions(15, "What kind of job would you prefer after graduation?", false),
                ModelPart1Questions(16, "What is your career plan after you graduate?", false),
                ModelPart1Questions(17, "What clothes do you wear", false),
                ModelPart1Questions(18, "Why are you taking the IELTS test?", false)
            )
        }

        fun getHometownQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "What’s (the name of) your hometown and where is it?", false),
                ModelPart1Questions(2, "Is that a big city or a small place?", false),
                ModelPart1Questions(3, "Please describe your hometown a little?", false),
                ModelPart1Questions(4, "How long have you been living there?", false),
                ModelPart1Questions(5, "Do you like your hometown? If yes, what do you like (most) about your hometown?", false),
                ModelPart1Questions(6, "Is there anything you dislike about it?", false),
                ModelPart1Questions(7, "Do you often visit your hometown?", false),
                ModelPart1Questions(8, "Do you think you will continue living there for a long time?", false),
                ModelPart1Questions(9, "Has your hometown changed much since you were a child?", false),
                ModelPart1Questions(10, "Are there any changes you would like to make in your hometown?", false)
            )
        }

        fun getHomeQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "What kind of housing/accommodation do you live in?", false),
                ModelPart1Questions(2, "What do you usually do in your house/flat/room?", false),
                ModelPart1Questions(3, "Who do you live with?", false),
                ModelPart1Questions(4, "How long have you lived there?", false),
                ModelPart1Questions(5, "Do you plan to live there for a long time?", false),
                ModelPart1Questions(6, "What’s the difference between where you are living now and where you have lived in the past?", false),
                ModelPart1Questions(7, "Can you describe the place where you live?/ Please describe the room you live in", false),
                ModelPart1Questions(8, "Which part of your home do you like the most?", false)
            )
        }

        fun getArtQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "Do you like art?", false),
                ModelPart1Questions(2, "Do you think art classes are necessary? (Why?)/ How do you think art classes affect children’s development?", false),
                ModelPart1Questions(3, "Are you good at art?", false),
                ModelPart1Questions(4, "What kind of paintings do people like?", false),
                ModelPart1Questions(5, "What benefits can you get from painting as a hobby?", false),
                ModelPart1Questions(6, "How often do you visit art galleries?", false),
                ModelPart1Questions(7, "What kinds of things do you like to draw?", false),
                ModelPart1Questions(8, "Is it easy to learn how to draw?", false)
            )
        }

        fun getBirthdayQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "How do children celebrate birthdays in your country?", false),
                ModelPart1Questions(2, "How did you celebrate your last birthday?", false),
                ModelPart1Questions(3, "What kinds of birthday gifts do you like to receive?", false),
                ModelPart1Questions(4, "Is there a difference between the way you celebrate your birthday in the past and in the present?", false),
                ModelPart1Questions(5, "How do you usually celebrate your birthday?", false),
                ModelPart1Questions(6, "Are there any birthdays that are special in your culture?", false),
                ModelPart1Questions(7, "Can you remember a birthday you had as a child?", false)
            )
        }

        fun getChildhoodQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "Did you enjoy your childhood?", false),
                ModelPart1Questions(2, "What is your first memory of your childhood?", false),
                ModelPart1Questions(3, "Did you have a lot of friends when you were a child?", false),
                ModelPart1Questions(4, "What did you enjoy doing as a child?", false),
                ModelPart1Questions(5, "Do you think it is better for children to grow up in the city or in the countryside?", false),
                ModelPart1Questions(6, "What was the best thing about your childhood?", false),
                ModelPart1Questions(7, "What do you miss most about being a child?", false),
                ModelPart1Questions(8, "Do you think that children these days have a better or worse childhood than your generation? Why?", false),
                ModelPart1Questions(9, "What do you think is most important for a happy childhood?", false),
                ModelPart1Questions(10, "What about your childhood do you wish you could change?", false),
                ModelPart1Questions(11, "Where did you grow up? How did that affect your childhood?", false),
                ModelPart1Questions(12, "What were some of your favorite activities when you were a child?", false),
                ModelPart1Questions(13, "Who, besides your parents, had the biggest impact on your childhood?", false),
                ModelPart1Questions(14, "What do you want to provide your children that you didn’t have when you were growing up?", false),
                ModelPart1Questions(15, "Who were you really jealous of when you were a child? Why were you jealous?", false)
            )
        }

        fun getClothesQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "What colour clothes do you like to wear?", false),
                ModelPart1Questions(2, "Do people in your country like to wear bright colours?", false),
                ModelPart1Questions(3, "What are the differences between men’s and women’s preferences in colour?", false),
                ModelPart1Questions(4, "What kind of clothes do you like to wear?", false),
                ModelPart1Questions(5, "What kind of clothes do you never wear?", false),
                ModelPart1Questions(6, "Do you wear the same style of clothes on the weekend and on the weekdays?", false),
                ModelPart1Questions(7, "Do you wear the same clothes at school/work?", false),
                ModelPart1Questions(8, "Did you have any special clothes when you were a child?", false)
            )
        }

        fun getDailyRoutineQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "When do you wake up?", false),
                ModelPart1Questions(2, "What is your daily routine?", false),
                ModelPart1Questions(3, "What part of the day do you like most?", false),
                ModelPart1Questions(4, "Do you think it is important to have a daily routine?", false),
                ModelPart1Questions(5, "What’s the difference in routine between you and your teenage times?", false),
                ModelPart1Questions(6, "What is the busiest part of the day for you?", false),
                ModelPart1Questions(7, "Do you usually have the same routine every day? (or) Do you usually do the same things at the same time each day?", false),
                ModelPart1Questions(8, "Have you ever changed your routine?", false),
                ModelPart1Questions(9, "What would you like to change in your daily routine?", false),
                ModelPart1Questions(10, "Do you like to plan what you will do each day?", false),
                ModelPart1Questions(11, "What do you usually do at this time of day?", false),
                ModelPart1Questions(12, "How do you organize your study time?", false)
            )
        }

        fun getFoodQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "What kind of food do you like to eat?", false),
                ModelPart1Questions(2, "What kind of new food would you like to try? Why?", false),
                ModelPart1Questions(3, "Do you like cooking? Why/ Why not?", false),
                ModelPart1Questions(4, "What was the last meal you cooked?", false),
                ModelPart1Questions(5, "Do you prefer home-cooked food or food from restaurants? Why?", false),
                ModelPart1Questions(6, "What are some kinds of food you never eat? Why?", false),
                ModelPart1Questions(7, "What are some reasons that people eat at a restaurant?", false),
                ModelPart1Questions(8, "Describe a popular food in your country? Why do people like this food? ", false),
                ModelPart1Questions(9, "What kinds of food do you particularly like?", false),
                ModelPart1Questions(10, "Is there any food you don’t like?", false),
                ModelPart1Questions(11, "What kinds of food are most popular in your country?", false),
                ModelPart1Questions(12, "Do you like cooking? (Why?/ Why not?)", false)
            )
        }

        fun getHobbiesQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "Do you have any hobbies?", false),
                ModelPart1Questions(2, "Is it important to have a hobby?", false),
                ModelPart1Questions(3, "Is it harmful to spend too much time on a hobby?", false),
                ModelPart1Questions(4, "What free-time activities would you like to try in the future?", false),
                ModelPart1Questions(5, "Do you have a hobby?", false),
                ModelPart1Questions(6, "What equipment do you need for it?", false),
                ModelPart1Questions(7, "Do you think hobbies should be shared with other people?", false),
                ModelPart1Questions(8, "Did you have a hobby as a child?", false),
                ModelPart1Questions(9, "What hobbies are popular in your country?", false),
                ModelPart1Questions(10, "Why do you think people have hobbies?", false)
            )
        }

        fun getInternetQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "How important is the internet to you?", false),
                ModelPart1Questions(2, "How often do you use the internet?", false),
                ModelPart1Questions(3, "What are your favourite websites?", false),
                ModelPart1Questions(4, "Do you use apps? ", false),
                ModelPart1Questions(5, "Do you think you use the internet too much? ", false),
                ModelPart1Questions(6, "How will the internet develop in the future?", false),
                ModelPart1Questions(7, "Are there any negative things about the internet?", false),
                ModelPart1Questions(8, "How important is the Internet to you?", false),
                ModelPart1Questions(9, "Do you use the Internet more for work or in your free time?", false),
                ModelPart1Questions(10, "Do you think you use the Internet too much?", false),
                ModelPart1Questions(11, "How will the Internet develop in the future?", false),
                ModelPart1Questions(12, "Are there any negative things about the Internet?", false)
            )
        }

        fun getLeisureTimeQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "What do you do in your spare time?", false),
                ModelPart1Questions(2, "What do you do to relax?", false),
                ModelPart1Questions(3, "How do you usually spend your weekends?", false),
                ModelPart1Questions(4, "What do you usually do after work or classes?", false),
                ModelPart1Questions(5, "How much time do you have each week for doing these things?", false),
                ModelPart1Questions(6, "Why do you like doing these activities?", false),
                ModelPart1Questions(7, "How did you start doing this activity at first?", false),
                ModelPart1Questions(8, "Is there some other hobby or sport you would like to try? Why?", false),
                ModelPart1Questions(9, "How do you spend your time in the evening?", false),
                ModelPart1Questions(10, "Do you prefer staying at home or going out during evenings?", false),
                ModelPart1Questions(11, "Do you do this every evening?", false),
                ModelPart1Questions(12, "What do you like to do on the weekends?", false),
                ModelPart1Questions(13, "Is there any difference in your life now from when you were a child?", false),
                ModelPart1Questions(14, "Do you think modern lifestyles give people enough time for leisure?", false),
                ModelPart1Questions(15, "Do you think people today have more time to relax compared to the past?", false),
                ModelPart1Questions(16, "What do you think is the importance of leisure time in life?", false),
                ModelPart1Questions(17, "Do you think old and young people spend their leisure time in the same way?", false),
                ModelPart1Questions(18, "Do you like to travel in holidays?", false),
                ModelPart1Questions(18, "If you had a child, what leisure places would you go with your child?", false)
            )
        }

        fun getMusicQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "", false),
                ModelPart1Questions(2, "", false),
                ModelPart1Questions(3, "", false),
                ModelPart1Questions(4, "", false),
                ModelPart1Questions(5, "", false),
                ModelPart1Questions(6, "", false),
                ModelPart1Questions(7, "", false),
                ModelPart1Questions(8, "", false),
                ModelPart1Questions(9, "", false),
                ModelPart1Questions(10, "", false),
                ModelPart1Questions(11, "", false),
                ModelPart1Questions(12, "", false),
                ModelPart1Questions(13, "", false),
                ModelPart1Questions(14, "", false),
                ModelPart1Questions(15, "", false),
                ModelPart1Questions(16, "", false),
                ModelPart1Questions(17, "", false),
                ModelPart1Questions(18, "", false)
            )
        }

        fun getShoppingQuestions(): List<ModelPart1Questions>{
            return listOf(
                ModelPart1Questions(1, "", false),
                ModelPart1Questions(2, "", false),
                ModelPart1Questions(3, "", false),
                ModelPart1Questions(4, "", false),
                ModelPart1Questions(5, "", false),
                ModelPart1Questions(6, "", false),
                ModelPart1Questions(7, "", false),
                ModelPart1Questions(8, "", false),
                ModelPart1Questions(9, "", false),
                ModelPart1Questions(10, "", false),
                ModelPart1Questions(11, "", false),
                ModelPart1Questions(12, "", false),
                ModelPart1Questions(13, "", false),
                ModelPart1Questions(14, "", false),
                ModelPart1Questions(15, "", false),
                ModelPart1Questions(16, "", false),
                ModelPart1Questions(17, "", false),
                ModelPart1Questions(18, "", false)
            )
        }


    }
}