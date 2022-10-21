package com.example.ieltsspeaking.home.category.part3Topic.question.data

import com.example.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions

class Part3QuestionsData {
    companion object{

        fun getWeatherQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Does air pollution affect the weather?", false),
                ModelPartsQuestions(2, "Do you think that weather affects people's behaviour?", false),
                ModelPartsQuestions(3, "How do the different seasons affect the lifestyle of people in your country?", false),
                ModelPartsQuestions(4, "How do different seasons affect the way people feel?", false),
                ModelPartsQuestions(5, "How does the climate of a place affect the kind of buildings that are built there?", false),
                ModelPartsQuestions(6, "Do you think fighting global climate change is a governmental responsibility or the responsibility of individuals?", false),
                ModelPartsQuestions(7, "Do you think people who live in cold places have different personalities to people who live in warm or hot places?", false),
                ModelPartsQuestions(8, "Do you think there are any problems with the world's climate now?", false)
            )
        }

        fun getTravelQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Do people in your country like to travel?", false),
                ModelPartsQuestions(2, "How has travelling changed, compared to several decades ago?", false),
                ModelPartsQuestions(3, "When do people travel (as tourists), whom do they usually go with?", false),
                ModelPartsQuestions(4, "Do you think travel can change people's ways of thinking?", false),
                ModelPartsQuestions(5, "What are the disadvantages of not travelling?", false),
                ModelPartsQuestions(6, "How do most people in your country travel to work?", false),
                ModelPartsQuestions(7, "People in cities used to like living downtown but now they prefer to live in the suburbs. Can you explain why?", false),
                ModelPartsQuestions(8, "What is the impact of vehicles on people's lives?</string>", false),
                ModelPartsQuestions(9, "Do people in your country prefer to walk or take a car for short trips?", false),
                ModelPartsQuestions(10, "How can big cities deal with the problem of having many people crowded in the same place?", false),
                ModelPartsQuestions(11, "Are there any connections between transportation and the environment?", false),
                ModelPartsQuestions(12, "Does your hometown have problems connected to transportation?", false),
                ModelPartsQuestions(13, "How could these problems be solved?", false),
                ModelPartsQuestions(14, "Is cycling very popular in your city?", false),
                ModelPartsQuestions(15, "What are the differences between travelling by car and travelling by bicycle in a city?", false)
            )
        }

        fun getTechnologyQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What are the advantages of modern technology?", false),
                ModelPartsQuestions(2, "Do you think there are any disadvantages to technology?", false),
                ModelPartsQuestions(3, "Could you make a prediction regarding the future of technology?", false),
                ModelPartsQuestions(4, "In your opinion, is technology making people’s lives easier? Why or why not?", false),
                ModelPartsQuestions(5, "What are some important technological developments for the future?", false),
                ModelPartsQuestions(6, "What kinds of modern technology do people rely on in their daily life?", false),
                ModelPartsQuestions(7, "Do you think people rely too much on technology today?", false),
                ModelPartsQuestions(8, "What are some great inventions you know about?", false),
                ModelPartsQuestions(9, "Do you think that the advance of technology has improved standards of education in schools?", false)
            )
        }

        fun getSleepQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What are some advantages of getting enough sleep?", false),
                ModelPartsQuestions(2, "How do people in your country keep track of their sleep?", false),
                ModelPartsQuestions(3, "How do you avoid falling asleep when you are at a meeting?", false),
                ModelPartsQuestions(4, "Do you suffer from nightmares? Can you remember any specific nightmare?", false),
                ModelPartsQuestions(5, "Do you believe that it’s possible to interpret dreams? Have you ever tried to interpret your own dreams?", false),
                ModelPartsQuestions(6, "Have you ever walked in your sleep? Do you know anyone who does?", false),
                ModelPartsQuestions(7, "How many of hours sleep do you generally need per night?", false),
                ModelPartsQuestions(8, "What time do you usually go to bed?", false),
                ModelPartsQuestions(9, "Do you manage to sleep as much as you need? If not, why not?", false),
                ModelPartsQuestions(10, "Have you ever suffered from insomnia?", false),
                ModelPartsQuestions(11, "Are you a light sleeper or a heavy sleeper?", false),
                ModelPartsQuestions(12, "What keeps you awake at night?", false)
            )
        }

        fun getShoppingQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Do all people enjoy shopping for clothes?", false),
                ModelPartsQuestions(2, "Why women like to go shopping?", false),
                ModelPartsQuestions(3, "Why some women buy cheaper clothes and expensive ones at the same time?", false),
                ModelPartsQuestions(4, "Do you think it is good for people buy expensive clothes? Why?", false),
                ModelPartsQuestions(5, "Why do some people like shopping with friends?", false),
                ModelPartsQuestions(6, "Why people like shopping for clothes online?", false),
                ModelPartsQuestions(7, "What risks would take when shopping online? Why?", false),
                ModelPartsQuestions(8, "What special clothes do people in your country wear on official or formal occasions?", false),
                ModelPartsQuestions(9, "What is the different dress style between boys and girls?", false),
                ModelPartsQuestions(10, "Do you like jewels?", false),
                ModelPartsQuestions(11, "Do you wear many jewels?", false),
                ModelPartsQuestions(12, "Why some people wear a jewel for a long time?", false)
            )
        }

        fun getServiceQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What do you think it might be like to work in a customer service job?", false),
                ModelPartsQuestions(2, "Do you agree that customers are more likely to complain nowadays?", false),
                ModelPartsQuestions(3, "What are important points to pay attention to for salespeople when dealing with customers?", false),
                ModelPartsQuestions(4, "What behaviors should be avoided by professional customer agents?", false),
                ModelPartsQuestions(5, "Which products and services may require an extra high level of customer service?", false),
                ModelPartsQuestions(6, "What can happen to businesses in these industries that do not provide a positive buyer experience?", false)
            )
        }

        fun getPollutionQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What should be done about plastic in the ocean?", false),
                ModelPartsQuestions(2, "What might some solutions be to reduce this situation?", false),
                ModelPartsQuestions(3, "What would you say to children who are faced with this problem for the future?", false),
                ModelPartsQuestions(4, "Is water pollution a problem in your country?", false),
                ModelPartsQuestions(5, "What are some of the causes of water pollution?", false),
                ModelPartsQuestions(6, "What can individuals do to try and ensure water is kept clean?", false),
                ModelPartsQuestions(7, "Do you think problems with the cleanliness of water will improve in the future?", false),
                ModelPartsQuestions(8, "What causes environmental problems?", false),
                ModelPartsQuestions(9, "What should the government do to protect the environment?", false),
                ModelPartsQuestions(10, "Why is it important to protect the natural environment?", false),
                ModelPartsQuestions(11, "What environmental problems are common in your country?", false),
                ModelPartsQuestions(12, "What can the government in your country do to deal with those problems?", false),
                ModelPartsQuestions(13, "What technological innovations should the world develop to protect the environment?", false),
                ModelPartsQuestions(14, "Do you think the youth these days care about the environment? Why do you think so?", false),
                ModelPartsQuestions(15, "Environmental problems are too big to be dealt at the individual level? Do you agree? Why/Why not?", false)
            )
        }

        fun getPolitenessQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "What’s the standard of being polite?", false),
                ModelPartsQuestions(2, "What behaviors will be regarded as impolite?", false),
                ModelPartsQuestions(3, "Who is more polite, people from cities or those from the countryside?", false),
                ModelPartsQuestions(4, "What according to you is politeness?", false),
                ModelPartsQuestions(5, "Who taught you to be polite when you were a child?", false),
                ModelPartsQuestions(6, "Why is it important to be polite to people?", false),
                ModelPartsQuestions(7, "Do you think people have become less or more polite since the time you were a child?", false),
                ModelPartsQuestions(8, "In your country’s culture, how do you show that you are being polite?", false),
                ModelPartsQuestions(9, "Are we less polite with members of our families than with people we don’t know?", false)
            )
        }

        fun getPlansQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Do old people often change plans?", false),
                ModelPartsQuestions(2, "Do young people like to change plans?", false),
                ModelPartsQuestions(3, "What are the common reasons when people need to change plans?", false),
                ModelPartsQuestions(4, "How would you tell your friends when you must change your plan?", false),
                ModelPartsQuestions(5, "What kinds of plans are practical?", false),
                ModelPartsQuestions(6, "Which do you prefer? Having plans or having no plans?", false),
                ModelPartsQuestions(7, "In general, do you think planning is important?", false),
                ModelPartsQuestions(8, "Why do people make plans?", false)
            )
        }

        fun getPeopleQuestions():List<ModelPartsQuestions>{
            return listOf(
                ModelPartsQuestions(1, "Which are more important to you: your family or your friends?", false),
                ModelPartsQuestions(2, "What conflicts can arise between a person’s family and a person’s friends?", false),
                ModelPartsQuestions(3, "Is it better to get advice from a friend or from a family member?", false),
                ModelPartsQuestions(4, "What would you say are the characteristics of a good adviser?", false),
                ModelPartsQuestions(5, "Should people make their own work and career decisions, or is it a good idea to ask for advice about this?", false),
                ModelPartsQuestions(6, "Do you have a large family or small family?", false),
                ModelPartsQuestions(7, "Tell me something about your family.", false),
                ModelPartsQuestions(8, "How much time do you manage to spend with members of your family?", false),
                ModelPartsQuestions(9, "In what way is your family important to you?", false),
                ModelPartsQuestions(10, "What sorts of things do you like to do together?", false),
                ModelPartsQuestions(11, "Did/Do you get well with your family? Why?", false),
                ModelPartsQuestions(12, "Who are you close to in your family?", false),
                ModelPartsQuestions(13, "Should we rely heavily on our families or is it better to try to be independent?", false),
                ModelPartsQuestions(14, "Do you get along well with your family?", false),
                ModelPartsQuestions(15, "What is your special moment with your family?", false),
                ModelPartsQuestions(16, "Are people in your country generally close to their families?", false),
                ModelPartsQuestions(17, "Are your friends mostly your age or different age? Why?", false),
                ModelPartsQuestions(18, "Do you prefer one or two close friends or many friends?", false),
                ModelPartsQuestions(19, "Do you usually see your friends during weekdays or on weekends? Why?", false),
                ModelPartsQuestions(20, "Do you prefer to stay alone or with your friends?", false),
                ModelPartsQuestions(21, "The last time you saw your friends, what did you do together?", false),
                ModelPartsQuestions(22, "In what ways are your friends important to you?", false),
                ModelPartsQuestions(23, "What do you prefer: going out with your friends or spending your spare time staying at home?", false),
                ModelPartsQuestions(24, "Do you have many friends? Why? Why not?", false),
                ModelPartsQuestions(25, "What do you usually do with your friends?", false),
                ModelPartsQuestions(26, "Are friends as important to you as your family?", false),
                ModelPartsQuestions(27, "Do you think friendships change as we get older? How?", false),
                ModelPartsQuestions(28, "What do you expect from a good friend?", false)
            )
        }

        fun getWrongError():List<ModelPartsQuestions>{
            return listOf(
            ModelPartsQuestions(1, "Error", false),
            ModelPartsQuestions(2, "Error", false),
            ModelPartsQuestions(3, "Error", false),
            ModelPartsQuestions(4, "Error", false),
            ModelPartsQuestions(5, "Error", false),
            ModelPartsQuestions(6, "Error", false),
            ModelPartsQuestions(7, "Error", false),
            ModelPartsQuestions(8, "Error", false),
            ModelPartsQuestions(9, "Error", false),
            ModelPartsQuestions(10, "Error", false)
            )
        }
    }
}