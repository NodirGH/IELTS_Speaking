package my.application.ieltsspeaking.home.category.part1Topic.questions.data

import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions


class Part1QuestionsStudyData {
    companion object{
        fun getWorkQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What do you do?", false),
                ModelPartsQuestions(2, "What are your responsibilities?", false),
                ModelPartsQuestions(3, "Why did you choose to do that type of work (or, that job)?", false),
                ModelPartsQuestions(4, "Is there some other kind of work you would rather do?", false),
                ModelPartsQuestions(5, "Describe the company or organization you work for.", false),
                ModelPartsQuestions(6, "Do you enjoy your work?", false),
                ModelPartsQuestions(7, "What do you like (or dislike) about your job?", false),
                ModelPartsQuestions(8, "Do you miss being a student?", false)
            )
        }

        fun getStudyQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Do you work or study?", false),
                ModelPartsQuestions(2, "Where do you study?", false),
                ModelPartsQuestions(3, "What is the name of your college (or university)?", false),
                ModelPartsQuestions(4, "What subject are you studying?", false),
                ModelPartsQuestions(5, "Which part of the course do you enjoy most?", false),
                ModelPartsQuestions(6, "Why did you choose to study that?", false),
                ModelPartsQuestions(7, "Is it a difficult subject to study?", false),
                ModelPartsQuestions(8, "What is your favourite subject?", false),
                ModelPartsQuestions(9, "What kind of school did you go to?", false),
                ModelPartsQuestions(10, "What was your favourite subject at school?", false),
                ModelPartsQuestions(11, "What is the best thing about your university/school?", false),
                ModelPartsQuestions(12, "What part of university life do you like best?", false),
                ModelPartsQuestions(13, "What is the educational system like in your country?", false),
                ModelPartsQuestions(14, "What are your future study plans?", false),
                ModelPartsQuestions(15, "What kind of job would you prefer after graduation?", false),
                ModelPartsQuestions(16, "What is your career plan after you graduate?", false),
                ModelPartsQuestions(17, "Why are you taking the IELTS test?", false)
            )
        }

        fun getHometownQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What’s (the name of) your hometown and where is it?", false),
                ModelPartsQuestions(2, "Is that a big city or a small place?", false),
                ModelPartsQuestions(3, "Please describe your hometown a little?", false),
                ModelPartsQuestions(4, "How long have you been living there?", false),
                ModelPartsQuestions(5, "Do you like your hometown? If yes, what do you like (most) about your hometown?", false),
                ModelPartsQuestions(6, "Is there anything you dislike about it?", false),
                ModelPartsQuestions(7, "Do you often visit your hometown?", false),
                ModelPartsQuestions(8, "Do you think you will continue living there for a long time?", false),
                ModelPartsQuestions(9, "Has your hometown changed much since you were a child?", false),
                ModelPartsQuestions(10, "Are there any changes you would like to make in your hometown?", false)
            )
        }

        fun getHomeQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What kind of housing/accommodation do you live in?", false),
                ModelPartsQuestions(2, "What do you usually do in your house/flat/room?", false),
                ModelPartsQuestions(3, "Who do you live with?", false),
                ModelPartsQuestions(4, "How long have you lived there?", false),
                ModelPartsQuestions(5, "Do you plan to live there for a long time?", false),
                ModelPartsQuestions(6, "What’s the difference between where you are living now and where you have lived in the past?", false),
                ModelPartsQuestions(7, "Can you describe the place where you live?/ Please describe the room you live in", false),
                ModelPartsQuestions(8, "Which part of your home do you like the most?", false)
            )
        }

        fun getArtQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Do you like art?", false),
                ModelPartsQuestions(2, "Do you think art classes are necessary? (Why?)/ How do you think art classes affect children’s development?", false),
                ModelPartsQuestions(3, "Are you good at art?", false),
                ModelPartsQuestions(4, "What kind of paintings do people like?", false),
                ModelPartsQuestions(5, "What benefits can you get from painting as a hobby?", false),
                ModelPartsQuestions(6, "How often do you visit art galleries?", false),
                ModelPartsQuestions(7, "What kinds of things do you like to draw?", false),
                ModelPartsQuestions(8, "Is it easy to learn how to draw?", false)
            )
        }

        fun getBirthdayQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "How do children celebrate birthdays in your country?", false),
                ModelPartsQuestions(2, "How did you celebrate your last birthday?", false),
                ModelPartsQuestions(3, "What kinds of birthday gifts do you like to receive?", false),
                ModelPartsQuestions(4, "Is there a difference between the way you celebrate your birthday in the past and in the present?", false),
                ModelPartsQuestions(5, "How do you usually celebrate your birthday?", false),
                ModelPartsQuestions(6, "Are there any birthdays that are special in your culture?", false),
                ModelPartsQuestions(7, "Can you remember a birthday you had as a child?", false)
            )
        }

        fun getChildhoodQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Did you enjoy your childhood?", false),
                ModelPartsQuestions(2, "What is your first memory of your childhood?", false),
                ModelPartsQuestions(3, "Did you have a lot of friends when you were a child?", false),
                ModelPartsQuestions(4, "What did you enjoy doing as a child?", false),
                ModelPartsQuestions(5, "Do you think it is better for children to grow up in the city or in the countryside?", false),
                ModelPartsQuestions(6, "What was the best thing about your childhood?", false),
                ModelPartsQuestions(7, "What do you miss most about being a child?", false),
                ModelPartsQuestions(8, "Do you think that children these days have a better or worse childhood than your generation? Why?", false),
                ModelPartsQuestions(9, "What do you think is most important for a happy childhood?", false),
                ModelPartsQuestions(10, "What about your childhood do you wish you could change?", false),
                ModelPartsQuestions(11, "Where did you grow up? How did that affect your childhood?", false),
                ModelPartsQuestions(12, "What were some of your favorite activities when you were a child?", false),
                ModelPartsQuestions(13, "Who, besides your parents, had the biggest impact on your childhood?", false),
                ModelPartsQuestions(14, "What do you want to provide your children that you didn’t have when you were growing up?", false),
                ModelPartsQuestions(15, "Who were you really jealous of when you were a child? Why were you jealous?", false)
            )
        }

        fun getClothesQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What colour clothes do you like to wear?", false),
                ModelPartsQuestions(2, "Do people in your country like to wear bright colours?", false),
                ModelPartsQuestions(3, "What are the differences between men’s and women’s preferences in colour?", false),
                ModelPartsQuestions(4, "What kind of clothes do you like to wear?", false),
                ModelPartsQuestions(5, "What kind of clothes do you never wear?", false),
                ModelPartsQuestions(6, "Do you wear the same style of clothes on the weekend and on the weekdays?", false),
                ModelPartsQuestions(7, "Do you wear the same clothes at school/work?", false),
                ModelPartsQuestions(8, "Did you have any special clothes when you were a child?", false)
            )
        }

        fun getDailyRoutineQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "When do you wake up?", false),
                ModelPartsQuestions(2, "What is your daily routine?", false),
                ModelPartsQuestions(3, "What part of the day do you like most?", false),
                ModelPartsQuestions(4, "Do you think it is important to have a daily routine?", false),
                ModelPartsQuestions(5, "What’s the difference in routine between you and your teenage times?", false),
                ModelPartsQuestions(6, "What is the busiest part of the day for you?", false),
                ModelPartsQuestions(7, "Do you usually have the same routine every day? (or) Do you usually do the same things at the same time each day?", false),
                ModelPartsQuestions(8, "Have you ever changed your routine?", false),
                ModelPartsQuestions(9, "What would you like to change in your daily routine?", false),
                ModelPartsQuestions(10, "Do you like to plan what you will do each day?", false),
                ModelPartsQuestions(11, "What do you usually do at this time of day?", false),
                ModelPartsQuestions(12, "How do you organize your study time?", false)
            )
        }

        fun getFoodQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What kind of food do you like to eat?", false),
                ModelPartsQuestions(2, "What kind of new food would you like to try? Why?", false),
                ModelPartsQuestions(3, "Do you like cooking? Why/ Why not?", false),
                ModelPartsQuestions(4, "What was the last meal you cooked?", false),
                ModelPartsQuestions(5, "Do you prefer home-cooked food or food from restaurants? Why?", false),
                ModelPartsQuestions(6, "What are some kinds of food you never eat? Why?", false),
                ModelPartsQuestions(7, "What are some reasons that people eat at a restaurant?", false),
                ModelPartsQuestions(8, "Describe a popular food in your country? Why do people like this food?", false),
                ModelPartsQuestions(9, "What kinds of food do you particularly like?", false),
                ModelPartsQuestions(10, "Is there any food you don’t like?", false),
                ModelPartsQuestions(11, "What kinds of food are most popular in your country?", false),
                ModelPartsQuestions(12, "Do you like cooking? (Why?/ Why not?)", false)
            )
        }

        fun getHobbiesQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Do you have any hobbies?", false),
                ModelPartsQuestions(2, "Is it important to have a hobby?", false),
                ModelPartsQuestions(3, "Is it harmful to spend too much time on a hobby?", false),
                ModelPartsQuestions(4, "What free-time activities would you like to try in the future?", false),
                ModelPartsQuestions(5, "Do you have a hobby?", false),
                ModelPartsQuestions(6, "What equipment do you need for it?", false),
                ModelPartsQuestions(7, "Do you think hobbies should be shared with other people?", false),
                ModelPartsQuestions(8, "Did you have a hobby as a child?", false),
                ModelPartsQuestions(9, "What hobbies are popular in your country?", false),
                ModelPartsQuestions(10, "Why do you think people have hobbies?", false)
            )
        }

        fun getInternetQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "How important is the internet to you?", false),
                ModelPartsQuestions(2, "How often do you use the internet?", false),
                ModelPartsQuestions(3, "What are your favourite websites?", false),
                ModelPartsQuestions(4, "Do you use apps?", false),
                ModelPartsQuestions(5, "Do you think you use the internet too much?", false),
                ModelPartsQuestions(6, "How will the internet develop in the future?", false),
                ModelPartsQuestions(7, "Are there any negative things about the internet?", false),
                ModelPartsQuestions(8, "How important is Internet to you?", false),
                ModelPartsQuestions(9, "Do you use the Internet more for work or in your free time?", false),
                ModelPartsQuestions(10, "Do you think you use Internet too much?", false),
                ModelPartsQuestions(11, "How will Internet develop in the future?", false)
            )
        }

        fun getLeisureTimeQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What do you do in your spare time?", false),
                ModelPartsQuestions(2, "What do you do to relax?", false),
                ModelPartsQuestions(3, "How do you usually spend your weekends?", false),
                ModelPartsQuestions(4, "What do you usually do after work or classes?", false),
                ModelPartsQuestions(5, "How much time do you have each week for doing these things?", false),
                ModelPartsQuestions(6, "Why do you like doing these activities?", false),
                ModelPartsQuestions(7, "How did you start doing this activity at first?", false),
                ModelPartsQuestions(8, "Is there some other hobby or sport you would like to try? Why?", false),
                ModelPartsQuestions(9, "How do you spend your time in the evening?", false),
                ModelPartsQuestions(10, "Do you prefer staying at home or going out during evenings?", false),
                ModelPartsQuestions(11, "Do you do this every evening?", false),
                ModelPartsQuestions(12, "What do you like to do on the weekends?", false),
                ModelPartsQuestions(13, "Is there any difference in your life now from when you were a child?", false),
                ModelPartsQuestions(14, "Do you think modern lifestyles give people enough time for leisure?", false),
                ModelPartsQuestions(15, "Do you think people today have more time to relax compared to the past?", false),
                ModelPartsQuestions(16, "What do you think is the importance of leisure time in life?", false),
                ModelPartsQuestions(17, "Do you think old and young people spend their leisure time in the same way?", false),
                ModelPartsQuestions(18, "Do you like to travel in holidays?", false),
                ModelPartsQuestions(19, "If you had a child, what leisure places would you go with your child?", false)
            )
        }

        fun getMusicQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Do you often listen to music?", false),
                ModelPartsQuestions(2, "When do you listen to music?", false),
                ModelPartsQuestions(3, "How much time do you spend listening to music every day?", false),
                ModelPartsQuestions(4, "What kinds of music do you like to listen to?", false),
                ModelPartsQuestions(5, "Have you ever been to a concert before?", false),
                ModelPartsQuestions(6, "Do you like to listen to live music?", false),
                ModelPartsQuestions(7, "When did you start listening to this type of music?", false),
                ModelPartsQuestions(8, "Where do you listen to it?", false),
                ModelPartsQuestions(9, "How do you feel when you listen to this music?", false),
                ModelPartsQuestions(10, "Have you ever learned to play a musical instrument?", false),
                ModelPartsQuestions(11, "Is music an important subject at school in your country?", false),
                ModelPartsQuestions(12, "Did you often listen to music when you were a child?", false),
                ModelPartsQuestions(13, "What kinds of music are (most) popular in your country?", false),
                ModelPartsQuestions(14, "Do you like traditional songs?", false)
            )
        }

        fun getShoppingQuestions(): List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Do you like shopping?", false),
                ModelPartsQuestions(2, "What’s your favourite shop?", false),
                ModelPartsQuestions(3, "Do you prefer shopping alone or with others?", false),
                ModelPartsQuestions(4, "What kinds of shops are there where you live?", false),
                ModelPartsQuestions(5, "Have you ever bought anything online?", false),
                ModelPartsQuestions(6, "Do you think men and women have different opinions about shopping?", false),
                ModelPartsQuestions(7, "Do you enjoy shopping?", false),
                ModelPartsQuestions(8, "What are your favorite stores?", false),
                ModelPartsQuestions(9, "Have you bought anything online?", false)
            )
        }


    }
}