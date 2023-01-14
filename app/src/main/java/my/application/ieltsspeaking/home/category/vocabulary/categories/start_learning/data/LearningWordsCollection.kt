package my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.data

import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.model.ModelStartLearning

object LearningWordsCollection {

    fun getWorkWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "to get involve in",
            "to become a part of (an organization)",
            "Richie never got involved in cooking"
        )
        val word2 = ModelStartLearning(
            2,
            "to fit in",
            "to become suitable or appropriate",
            "Tom tried to fit in with his friends"
        )
        val word3 = ModelStartLearning(
            3,
            "job flexibility",
            "gives employees flexibility on how long, where, and when they work",
            "Job flexibility plays an important role in retaining employees"
        )
        val word4 = ModelStartLearning(
            4,
            "nine-to-five work",
            "the normal work schedule for most jobs",
            "George joined a nine-to-five work and was happy with it"
        )
        val word5 = ModelStartLearning(
            5,
            "to dedicate",
            "devote (time or effort) to a particular task or purpose",
            "John dedicated his evenings to his daughter"
        )
        val word6 = ModelStartLearning(
            6,
            "world-class",
            "of or among the best in the world",
            "Tom built a new hotel with world-class facilities"
        )
        val word7 = ModelStartLearning(
            7,
            "perk",
            "an advantage or something extra that you are given because of your job",
            "The new job offer contained a lot of perks"
        )
        val word8 = ModelStartLearning(
            8,
            "overloaded",
            "to give excessive work, responsibility, or information to",
            "The boss always overloaded his employees with work"
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)

        return wordlist
    }

    fun getTravelWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "roam",
            "move about aimlessly or without any destination",
            "The chickens are able to roam around freely in the farmyard"
        )
        val word2 = ModelStartLearning(
            2,
            "step",
            "the act of changing location by raising the foot and setting it down",
            "The baby took her first steps today"
        )
        val word3 = ModelStartLearning(
            3,
            "fly",
            "travel through the air; be airborne",
            "The planes flew through the clouds"
        )
        val word4 = ModelStartLearning(
            4,
            "journey",
            "the act of traveling from one place to another",
            "She was the first woman to journey into space"
        )
        val word5 = ModelStartLearning(
            5,
            "voyage",
            "a journey to some distant place (related to water)",
            "The Titanic sank on her maiden voyage"
        )
        val word6 = ModelStartLearning(
            6,
            "tour",
            "a route all the way around a particular place or area",
            "We went on a guided tour of the museum"
        )
        val word7 = ModelStartLearning(
            7,
            "trek",
            "any long and difficult trip",
            "This year we're going trekking in Nepal"
        )
        val word8 = ModelStartLearning(
            8,
            "guide",
            "someone employed to conduct others",
            "He guided us around the city"
        )
        val word9 = ModelStartLearning(
            9,
            "destination",
            "the place designated as the end, as of a race or journey",
            "We arrived at our destination tired and hungry"
        )
        val word10 = ModelStartLearning(
            10,
            "globetrotter",
            "someone who travels widely and often",
            "She became something of a globetrotter, attending conferences all over the world"
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)

        return wordlist
    }

    fun getTechnologyWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "technology",
            "the application of scientific discoveries for practical purposes, especially in industry",
            "Technology is advancing at such a rate that it’s difficult to imagine what our lives will be like in 20 years time."
        )
        val word2 = ModelStartLearning(
            2,
            "technological",
            "relating to or involving technology.",
            "Recent technological advances in computing and telecommunications mean that some of our staff work mainly from home and don’t need to travel into the office every day."
        )
        val word3 = ModelStartLearning(
            3,
            "technophile",
            "a person who is enthusiastic about new technology.",
            "My brother is a true technophile and can tell you about every new gadget on the market."
        )
        val word4 = ModelStartLearning(
            4,
            "a techie",
            "a person who knows a lot about technology, especially computers or other electronic equipment.",
            "I’m not surprised Sue Lin is working for a top computer agency as she was always a real techie at school."
        )
        val word5 = ModelStartLearning(
            5,
            "tech-savvy",
            "well informed about or proficient in the use of modern technology, especially computers.",
            "My kids are far more tech-savvy than I am, having grown up with computer technology."
        )
        val word6 = ModelStartLearning(
            6,
            "technophobe",
            "a person who fears or dislikes new technology, especially computers, and does not want to use it.",
            "I keep telling him how easy it is to send an email but he’s an ardent technophobe and refuses to even have a go."
        )
        val word7 = ModelStartLearning(
            7,
            "progress",
            "to develop towards an improved or more advanced state.",
            "The pace of technological progress over the past 20 years has been astonishing."
        )
        val word8 = ModelStartLearning(
            8,
            "innovation",
            "the development and use of a new idea or method.",
            "Further innovation is needed in the farming industry if we are to be able to feed ourselves in the future."
        )
        val word9 = ModelStartLearning(
            9,
            "innovative",
            "the adjective form of innovation.",
            "Guti was a much-valued member of the team as he often came up with innovative solutions to a problem."
        )
        val word10 = ModelStartLearning(
            10,
            "an advance",
            "a development or improvement.",
            "Scientists have made major advances in recent years in their search for a cure for Alzheimer’s."
        )
        val word11 = ModelStartLearning(
            11,
            "develop",
            "to change into a stronger or more advanced form.",
            "I can confidently predict that computers will continue to develop at a rapid rate."
        )
        val word12 = ModelStartLearning(
            12,
            "development",
            "the process of developing something.",
            "Future developments in space travel may mean that our ancestors live on other planets."
        )
        val word13 = ModelStartLearning(
            13,
            "revolutionary",
            "involving or causing a complete or dramatic change and improvement.",
            "The development of personal computers has proved revolutionary for business owners"
        )
        val word14 = ModelStartLearning(
            14,
            "revolutionise",
            "to radically change something so it is much better.",
            "There’s no doubt that computers have revolutionised our lives."
        )
        val word15 = ModelStartLearning(
            15,
            "breakthrough",
            "important development or discovery",
            "Some people argue that the invention of the internal combustion engine was the most important technological breakthrough of all time"
        )
        val word16 = ModelStartLearning(
            16,
            "modern",
            "of the present time; using recent ideas and methods.",
            "Modern science is transforming the way we understand our world"
        )
        val word17 = ModelStartLearning(
            17,
            "modify",
            "to change something in order to make it better",
            "Being disabled, I need a car that can be modified to meet my specific needs."
        )
        val word18 = ModelStartLearning(
            18,
            "cutting-edge",
            "very modern",
            "Our new mobile phone is still in development but it is at the cutting-edge of technology"
        )
        val word19 = ModelStartLearning(
            19,
            "state-of-the-art",
            "the latest stage of development of a product, using the most recent ideas and method and including the latest features",
            "The new aircraft design was state-of-the-art and was expected to revolutionise passenger’s experience of flying"
        )
        val word20 = ModelStartLearning(
            20,
            "advanced",
            "modern and well developed",
            "simple technologies such the mechanical water pump are often more practical solutions to everyday problems than the advanced computer technologies of the western world"
        )
        val word21 = ModelStartLearning(
            21,
            "high tech",
            "using or involving advanced technology",
            "Some high tech solutions are less reliable than the basic technology they replace"
        )
        val word22 = ModelStartLearning(
            22,
            "indispensable",
            "something you could not manage without; absolutely necessary",
            "For many people, their mobile phone is indispensable"
        )
        val word23 = ModelStartLearning(
            23,
            "outdated",
            "out of date; old-fashioned",
            "Jared didn’t want to buy a new iPhone but his mobile looked so outdated compared to those of his friends that he felt pressured into updating it"
        )
        val word24 = ModelStartLearning(
            24,
            "obsolete",
            "not in use any more, having been replaced by something better",
            "Jerry had to close down his small printing business as his old printer had become obsolete and he couldn’t afford to replace it with the latest state-of-the-art equipment"
        )
        val word25 = ModelStartLearning(
            25,
            "impact",
            "the effect of something",
            "Modern technology has had a massive impact on the way we communicate with each other"
        )
        val word26 = ModelStartLearning(
            26,
            "to transform",
            " to markedly or dramatically change",
            "There can be no denying that computers have transformed the way we work and study"
        )
        val word27 = ModelStartLearning(
            27,
            "game changer",
            " a new idea or factor that significantly changes an existing situation or way of doing something",
            "The professor’s new theory was a game changer and if proved correct, brought the possibility of time travel one step closer"
        )
        val word28 = ModelStartLearning(
            28,
            "affect",
            "to influence or cause a change in something",
            "Social media has radically affected both how we communicate and who we communicate with"
        )
        val word29 = ModelStartLearning(
            29,
            "influence",
            "the power to have an effect on the character, development or behaviour of someone or something",
            "The influence of modern technology is evident in almost every aspect of our daily lives from how we shop to how we spend our leisure time"
        )
        val word30 = ModelStartLearning(
            30,
            "computer literate",
            "to have sufficient knowledge and understanding to be able to use a computer effectively",
            "The application form specified that candidates must be computer literate to be considered for the job"
        )
        val word31 = ModelStartLearning(
            31,
            "computer buff",
            "someone who knows a lot about computers and might be considered an expert",
            "Although I have a good understanding of the software I use at work, I certainly wouldn’t call myself a computer buff"
        )
        val word32 = ModelStartLearning(
            32,
            "laptop",
            "portable computer",
            "With a laptop, I can work almost anywhere as long as I have an internet connection"
        )
        val word33 = ModelStartLearning(
            33,
            "PC",
            "personal computer; not usually portable like a laptop",
            "I have a PC in my office at work but prefer a laptop for home so that I can use it in different locations around the house"
        )
        val word34 = ModelStartLearning(
            34,
            "to boot up",
            "to start a computer",
            "Of course I’ll show you how to send an email. You boot up the computer and I’ll be with you in a minute"
        )
        val word35 = ModelStartLearning(
            35,
            "word processing",
            "the process of producing, editing and storing text on a computer",
            "I have to write a lot of reports for my job so word processing is what I use my computer for more than anything else"
        )
        val word36 = ModelStartLearning(
            36,
            "to upgrade",
            "to obtain a more powerful or feature-rich computer, electronic device or piece of software",
            "My mobile phone company is always trying to persuade me to upgrade to the latest model"
        )
        val word37 = ModelStartLearning(
            37,
            "software",
            "the programmes and other operating information used by a computer and related devices",
            "Bella was able to create some amazing photographic effects after installing the new software on her computer"
        )
        val word38 = ModelStartLearning(
            38,
            "hardware",
            "the physical parts of a computer and related devices",
            "Computer hardware includes the monitor, keyboard, disk drive, mouse and wiring"
        )
        val word39 = ModelStartLearning(
            39,
            "to crash",
            "to suddenly stop working",
            "Guti was in the middle of his online English lesson when his computer crashed"
        )
        val word40 = ModelStartLearning(
            40,
            "internet",
            "the extensive global system of connected computers that allows people to share information and communicate with each other",
            " I love the fact that I can get free English lessons on the internet"
        )
        val word41 = ModelStartLearning(
            41,
            "to surf the internet",
            "to look at a series of websites one after the other",
            "I spent hours surfing the internet searching for the best holiday deals"
        )
        val word42 = ModelStartLearning(
            42,
            "online",
            "connected to the internet",
            "Most of my friends do their grocery shopping online but I prefer to go to the supermarket and choose my food items myself"
        )
        val word43 = ModelStartLearning(
            43,
            "website",
            "a set of pages of information on the internet about a particular subject, published by a single person or organization",
            "I found an excellent website about how to train puppies the other day"
        )
        val word44 = ModelStartLearning(
            44,
            "to browse",
            "to look for and look at information on the internet",
            "I often browse the internet for gift ideas when a friend has a birthday coming up"
        )
        val word45 = ModelStartLearning(
            45,
            "wifi",
            "using radio or microwaves rather than wires to connect to the internet",
            "Having a wifi connection gives me so much more freedom in the way I work as I’m no longer tied to my desk"
        )
        val word46 = ModelStartLearning(
            46,
            "wifi hotspot",
            "an area with an accessible wireless network, often a public place",
            "Whenever the ship was in port, the crew flocked to the nearest wifi hotspot to connect with their families back home"
        )
        val word47 = ModelStartLearning(
            47,
            "internet connection",
            "the link between a computer and the internet",
            "There is such a poor internet connection where I live that I have to go to the library when I want to get online"
        )
        val word48 = ModelStartLearning(
            48,
            "social media",
            "websites and computer programmes such as Facebook or Twitter that allow people to connect and share content online",
            "I have to admit that I connect with my friends on social media more often than I see them face-to-face"
        )
        val word49 = ModelStartLearning(
            49,
            "viral",
            "an image, video or piece of information that becomes very popular very quickly on the internet",
            "The video of her cat riding on a giant tortoise went viral and achieve nearly a million views"
        )
        val word50 = ModelStartLearning(
            50,
            "e-commerce",
            "commercial transactions conducted electronically on the internet",
            "Their business really took off when they built an e-commerce website and started selling their products online"
        )
        val word51 = ModelStartLearning(
            51,
            "e-book",
            "a book published in digital form and read on a computer or other dedicated electronic device",
            "The best thing about e-books is that you can download them instantly and start reading them immediately"
        )
        val word52 = ModelStartLearning(
            52,
            "hacker",
            "a person who illegally gains access to a computer system to steal information or tamper with the system",
            "Computer hackers cause huge disruption within the organisations they target and could even pose a threat to our country’s security"
        )
        val word53 = ModelStartLearning(
            53,
            "computer virus",
            " a piece of code which is capable of copying itself and typically has a detrimental effect, such as corrupting the system or destroying data",
            "Timor's computer was infected with a computer virus and many of his files were damaged"
        )
        val word54 = ModelStartLearning(
            54,
            "cyber",
            "involving, using, or relating to computers, especially the internet",
            "Many business owners live in fear of a cyber attack, especially infection of their computer network with a virus"
        )
        val word55 = ModelStartLearning(
            55,
            "labour-saving device",
            "a device or piece of equipment that reduces the effort needed to do something",
            "The labour-saving device I’m most grateful for is my washing machine"
        )
        val word56 = ModelStartLearning(
            56,
            "user-friendly",
            "simple to understand and easy to use",
            "I didn’t find my new mobile phone user-friendly at first but my grandson was able to show me how to use it and now I understand what to do"
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)
        wordlist.add(word14)
        wordlist.add(word15)
        wordlist.add(word16)
        wordlist.add(word17)
        wordlist.add(word18)
        wordlist.add(word19)
        wordlist.add(word20)
        wordlist.add(word21)
        wordlist.add(word22)
        wordlist.add(word23)
        wordlist.add(word24)
        wordlist.add(word25)
        wordlist.add(word26)
        wordlist.add(word27)
        wordlist.add(word28)
        wordlist.add(word29)
        wordlist.add(word30)
        wordlist.add(word31)
        wordlist.add(word32)
        wordlist.add(word33)
        wordlist.add(word34)
        wordlist.add(word35)
        wordlist.add(word36)
        wordlist.add(word37)
        wordlist.add(word38)
        wordlist.add(word39)
        wordlist.add(word40)
        wordlist.add(word41)
        wordlist.add(word42)
        wordlist.add(word43)
        wordlist.add(word44)
        wordlist.add(word45)
        wordlist.add(word46)
        wordlist.add(word47)
        wordlist.add(word48)
        wordlist.add(word49)
        wordlist.add(word50)
        wordlist.add(word51)
        wordlist.add(word52)
        wordlist.add(word53)
        wordlist.add(word54)
        wordlist.add(word55)
        wordlist.add(word56)

        return wordlist
    }

    fun getSportWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "arena",
            "a level area for holding sports events, surrounded by seats for spectators",
            "The arena was full of excited spectators cheering on their team"
        )
        val word2 = ModelStartLearning(
            2,
            "amateur",
            "engaged in something, like playing sports, without payment; non-professional",
            "The Olympic Games were originally for amateur athletes only"
        )
        val word3 = ModelStartLearning(
            3,
            "athlete",
            "a person who trains for and competes in a sport",
            "Most professional athletes spend hours every day in training"
        )
        val word4 = ModelStartLearning(
            4,
            "athletics",
            "'track and field' events of running, jumping, throwing, etc.",
            "There are some very good runners on our athletics team"
        )
        val word5 = ModelStartLearning(
            5,
            "award",
            "to give someone something as a reward for high achievement",
            "All the members of the winning team were awarded a gold medal"
        )
        val word6 = ModelStartLearning(
            6,
            "beat",
            "to defeat someone in a game or a competition",
            "Italy beat France to win the 2006 FIFA World Cup"
        )
        val word7 = ModelStartLearning(
            7,
            "captain",
            "the leader of a team",
            "The captain usually leads his or her team onto the field"
        )
        val word8 = ModelStartLearning(
            8,
            "catch",
            "to grab and hold something that has been thrown",
            "A wicketkeeper in cricket must be very good at catching the ball"
        )
        val word9 = ModelStartLearning(
            9,
            "champion",
            "a top-rated, highly successful player",
            "The boxer Muhammad Ali was World Heavyweight Champion three times"
        )
        val word10 = ModelStartLearning(
            10,
            "cheer",
            "to shout encouragement to a team or a player",
            "The fans made a lot of noise cheering on their team"
        )
        val word11 = ModelStartLearning(
            11,
            "coach",
            "a person who trains and directs an athlete or a sports team",
            "Players should carry out their coach's instructions during a game"
        )
        val word12 = ModelStartLearning(
            12,
            "compete",
            "to take part in a contest or a competition",
            "Over 10,000 athletes will compete in the Olympic Games"
        )
        val word13 = ModelStartLearning(
            13,
            "competition",
            "an organized event in which people compete to win",
            "The English Premiership League is one of the world's top football competitions"
        )
        val word14 = ModelStartLearning(
            14,
            "competitor",
            "a person who takes part in a competition or a sporting contest",
            "Each competitor in a golf tournament must record his or her own score"
        )
        val word15 = ModelStartLearning(
            15,
            "contest",
            "a game or event in which people compete to win",
            "Do you know who won this year's figure skating contest?"
        )
        val word16 = ModelStartLearning(
            16,
            "court",
            "a quadrangular area on which ball games are played, such as tennis or basketball",
            "The tennis courts at Wimbledon in London have a grass surface"
        )
        val word17 = ModelStartLearning(
            17,
            "course",
            "an area of land prepared for racing, golf, or other sports",
            "A golf course usually has eighteen holes"
        )
        val word18 = ModelStartLearning(
            18,
            "cup",
            "a cup-shaped trophy, awarded as a prize in a contest",
            "After they won the final game, the winners were awarded the Championship Cup"
        )
        val word19 = ModelStartLearning(
            19,
            "defeat",
            "to win a victory over opponents in a game or contest; to beat",
            "Our players were very happy after they defeated their opponents in the final game"
        )
        val word20 = ModelStartLearning(
            20,
            "defend",
            "to protect one's goal rather than attempt to score against one's opponents",
            "The team attacked and scored two goals, then spent the rest of the game defending the lead"
        )
        val word21 = ModelStartLearning(
            21,
            "draw",
            "to finish a contest or game with an even score; tie",
            "The score was 1-0, but the losing team got a late goal and the game ended in a 1-1 draw"
        )
        val word22 = ModelStartLearning(
            22,
            "event",
            "a particular contest in a sporting programme",
            "The 100 metres run is one of the most exciting events in athletics"
        )
        val word23 = ModelStartLearning(
            23,
            "fan",
            "a person who supports a particular sport, team or player",
            "Sometimes the umpire of a tennis match has to tell noisy fans to be quiet"
        )
        val word24 = ModelStartLearning(
            24,
            "field",
            "a piece of land marked out for a sports contest e.g. hockey field",
            "How many players are allowed on the field during a baseball game?"
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)
        wordlist.add(word14)
        wordlist.add(word15)
        wordlist.add(word16)
        wordlist.add(word17)
        wordlist.add(word18)
        wordlist.add(word19)
        wordlist.add(word20)
        wordlist.add(word21)
        wordlist.add(word22)
        wordlist.add(word23)
        wordlist.add(word24)

        return wordlist
    }

    fun getScienceWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "Placebo",
            "A drug which has no physical effects, used in pharmaceutical tests to compare the physical effects of taking a real drug from its psychological effects",
            "She was given a placebo, not the real drug, but she said she felt much better"
        )
        val word2 = ModelStartLearning(
            2,
            "Placebo Effect",
            "The placebo effect is when someone's condition improves because they think they are taking medicine",
            "She was given a placebo, not the real drug, but she said she felt much better- that's the placebo effect."
        )
        val word3 = ModelStartLearning(
            3,
            "A side effect",
            "An extra, usually bad, occurrence caused by taking a drug.",
            "Much of today's modern medicine has side effects. I prefer alternative therapies."
        )
        val word4 = ModelStartLearning(
            4,
            "Proof",
            "To show a particular result after a period of time.",
            "We now have proof that climate change is caused by human activity."
        )
        val word5 = ModelStartLearning(
            5,
            "Experiment",
            "A test done in order to learn something or to find out whether something works or is true",
            "Scientists are conducting experiments to test the effectiveness of the new drug."
        )
        val word6 = ModelStartLearning(
            6,
            "Gene",
            "A part of the DNA in a cell which contains information in a special pattern received by each animal or plant from its parents, and which controls its physical development, behaviour, etc",
            "Genes are an important factor in personaility development."
        )
        val word7 = ModelStartLearning(
            7,
            "Genetic engineering /modification",
            "Changing the structure of the genes of a living thing in order to make it healthier or stronger or more useful to humans.",
            "There is evidence that genetically modified food is harmful to humans."
        )
        val word8 = ModelStartLearning(
            8,
            "Genetically Modified Organisms (GMOs)",
            "Plants, animals or micro organisms that have changed through genetic engineering.",
            "Most commercialised GMO crop plants are insect resistant and/or herbicide tolerant."
        )
        val word9 = ModelStartLearning(
            9,
            "Clone",
            "A plant or animal which has the same genes as the original from which it was produced",
            "I believe that cloning humans is unethical."
        )
        val word10 = ModelStartLearning(
            10,
            "Geoengineering",
            "The deliberate large-scale intervention in the Earth’s climate system, in order to try and control global warming",
            "Some scientists believe geoengineering is the only way to reduce the warming of the climate."
        )
        val word11 = ModelStartLearning(
            11,
            "Cyber",
            "A prefix for things related to computers, especially the internet.",
            "Cyberbulling via social media such as Facebook has become a major problem."
        )
        val word12 = ModelStartLearning(
            12,
            "High-Tech/Hi-Tech",
            "Using the most advanced and developed machines and methods.",
            "Japan is a very high-tech country. Everyone has all the latest electronic gadgets."
        )
        val word13 = ModelStartLearning(
            13,
            "Theory",
            "A formal statement of the rules on which a subject of study is based or of ideas which are suggested to explain a fact or event or, more generally, an opinion or explanation",
            "There are two opposing theories on the causes of climate change - one says it is caused by humans, the other believe it is a natural cycle."
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)

        return wordlist
    }

    fun getRelationshipWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "to break up",
            "to end a romantic relationship",
            "I was consoling Liz on having broken up with her boyfriend"
        )
        val word2 = ModelStartLearning(
            2,
            "to drift apart",
            "to become less close to someone",
            "As children we were very close, but as we grew up we just drifted apart"
        )
        val word3 = ModelStartLearning(
            3,
            "to enjoy someone’s company",
            "to like spending time with someone",
            "He enjoys our company and we enjoy his company"
        )
        val word4 = ModelStartLearning(
            4,
            "to fall for",
            "to fall in love",
            "She always falls for older men"
        )
        val word5 = ModelStartLearning(
            5,
            "to fall head over heels in love",
            "to start to love someone a lot",
            "Laura fell head over heels in love with Chris."
        )
        val word6 = ModelStartLearning(
            6,
            "to fall out with",
            "to have a disagreement and stop being friends",
            "He left home after falling out with his parents"
        )
        val word7 = ModelStartLearning(
            7,
            "to get on like a house on fire",
            "to like someone’s company very much indeed",
            "I was worried that they wouldn't like each other but in fact they're getting on like a house on fire."
        )
        val word8 = ModelStartLearning(
            8,
            "to get on well with",
            "to understand someone and enjoy similar interests",
            "She's never really got on with her sister."
        )
        val word9 = ModelStartLearning(
            9,
            "to get to know",
            "to begin to know someone",
            "It took me a while to get to know my in-laws and understanding their lifestyle"
        )
        val word10 = ModelStartLearning(
            10,
            "to go back years",
            "to have known someone for a long time",
            "Our association with him goes back four years"
        )
        val word11 = ModelStartLearning(
            11,
            "to have a lot in common",
            " to share similar interests",
            "You're a musician too? I guess we have a lot in common"
        )
        val word12 = ModelStartLearning(
            12,
            "to have ups and downs",
            "to have good and bad times",
            "Even the best marriages have their ups and downs"
        )
        val word13 = ModelStartLearning(
            13,
            "a healthy relationship",
            "a good, positive relationship",
            "If things get tricky further down the line, a healthy relationship can keep the sale on track"
        )
        val word14 = ModelStartLearning(
            14,
            "to hit it off",
            "to quickly become good friends with",
            "We had similar ideas about the show, and the two of us hit it off right away"
        )
        val word15 = ModelStartLearning(
            15,
            "to be in a relationship",
            "to be romantically involved with someone",
            "I have quite a good relationship with my parents."
        )
        val word16 = ModelStartLearning(
            16,
            "to be just good friends",
            "to not be romantically involved",
            "I keep telling my mother that Peter and I are just friends but she doesn't seem to believe me"
        )
        val word17 = ModelStartLearning(
            17,
            "to keep in touch with",
            "to keep in contact with",
            "I keep in touch with my parents by emails"
        )
        val word18 = ModelStartLearning(
            18,
            "to lose touch with",
            "to not see or hear from someone any longer",
            "She lost touch with her college roommate after graduation"
        )
        val word19 = ModelStartLearning(
            19,
            "love at first sight",
            "to fall in love immediately you meet someone",
            "For Sarah and Samuel, it was love at first sight, and they have now decided to get married"
        )
        val word20 = ModelStartLearning(
            20,
            "to pop the question",
            "to ask someone to marry you",
            "Stuart got serious quickly and popped the question six months later."
        )
        val word21 = ModelStartLearning(
            21,
            "to see eye to eye",
            "to agree on a subject",
            "My sisters don't see eye to eye with me about the arrangements"
        )
        val word22 = ModelStartLearning(
            22,
            "to settle down",
            "to give up the single life and start a family",
            "They swore they would never settle down and get married"
        )
        val word23 = ModelStartLearning(
            23,
            "to strike up a relationship",
            "to begin a friendship",
            "She struck up a relationship with an artist soon after she arrived in Paris."
        )
        val word24 = ModelStartLearning(
            24,
            "to tie the knot",
            "to get married",
            "Christina and Bill are about to tie the knot. The wedding is on Saturday!"
        )
        val word25 = ModelStartLearning(
            25,
            "to be well matched",
            " to be similar to",
            "At the start of the competition the three teams looked extremely well matched"
        )
        val word26 = ModelStartLearning(
            26,
            "to work at a relationship",
            "to try to maintain a positive relationship with someone",
            "I've developed some great working relationships with contractors who do some of my more time-consuming work for me"
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)
        wordlist.add(word14)
        wordlist.add(word15)
        wordlist.add(word16)
        wordlist.add(word17)
        wordlist.add(word18)
        wordlist.add(word19)
        wordlist.add(word20)
        wordlist.add(word21)
        wordlist.add(word22)
        wordlist.add(word23)
        wordlist.add(word24)
        wordlist.add(word25)
        wordlist.add(word26)

        return wordlist
    }

    fun getAccommodationWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "To leave home",
            "to move out, often when you become an adult",
            "The children did not understand the magnitude of the fires, so an adult had to explain how important it was to be prepared to leave home quickly."
        )
        val word2 = ModelStartLearning(
            2,
            "To feel homesick",
            "miss home",
            "He was homesick when he went to college"
        )
        val word3 = ModelStartLearning(
            3,
            "To feel at home",
            "to feel comfortable",
            "By the end of the week she was beginning to feel at home in her new job"
        )
        val word4 = ModelStartLearning(
            4,
            "To make yourself at home",
            "make yourself comfortable",
            "When we arrived at my apartment, I showed my guests the sofa and said, \"Make yourself at home.\" Bill certainly knows how to make himself at home"
        )
        val word5 = ModelStartLearning(
            5,
            "To buy a second home",
            "house used only for weekends/holidays",
            "Twenty-five per cent of homes in the town are second homes or holiday lets"
        )
        val word6 = ModelStartLearning(
            6,
            "To take out a mortgage",
            "to get a loan from the bank to buy a house",
            "He will have to take out a mortgage in order to buy the house"
        )
        val word7 = ModelStartLearning(
            7,
            "To completely refurbish",
            "to renovate and decorate a house/flat",
            "It was completely refurbished a few months ago"
        )
        val word8 = ModelStartLearning(
            8,
            "To do up an old house",
            "repair/ repaint / decorate",
            "He does up old houses and sells them at a profit."
        )
        val word9 = ModelStartLearning(
            9,
            "a semi-detached",
            "usually two houses together",
            "She has seven children and lives in a three-bedroom semi-detached house"
        )
        val word10 = ModelStartLearning(
            10,
            "A terraced house",
            "one house connected to many others in the same row/street",
            "I wander over to the rows of nearby terraced houses and within two or three streets come to a mosque"
        )
        val word11 = ModelStartLearning(
            11,
            "A bungalow",
            "a house with only one level",
            "She had spent her savings and sold her two-bedroom bungalow to get by"
        )
        val word12 = ModelStartLearning(
            12,
            "A squat",
            "empty building where people start living without the owner’s permission",
            "Eight families are squatting in the house"
        )
        val word13 = ModelStartLearning(
            13,
            "A hovel",
            "very small, dirty house or flat in a bad or run-down condition",
            "They lived in a squalid hovel for the next five years."
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)

        return wordlist
    }

    fun getEducationWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "formal education",
            "education normally delivered by trained teachers in a systematic way in a school, college or university",
            "In Norway, formal education starts when children reach the age of six"
        )
        val word2 = ModelStartLearning(
            2,
            "compulsory education",
            "the legally-required period of time that children are expected to attend school. In the western world, these laws generally require that children attend school from the ages of 5 to 16 or 18",
            "One day, a formal education will hopefully be compulsory for all children"
        )
        val word3 = ModelStartLearning(
            3,
            "preschool",
            "a school for children who are too young to begin their formal education",
            "Most children in the UK go to a preschool but it isn’t compulsory"
        )
        val word4 = ModelStartLearning(
            4,
            "nursery school (UK)/kindergarten (US)",
            "preschool education",
            "In the UK, most children begin nursery school at the age of four"
        )
        val word5 = ModelStartLearning(
            5,
            "primary school (UK)/elementary school (US)",
            "the type of school for children ages 5-11",
            "Bindi was so excited about starting primary school when the new term started in September"
        )
        val word6 = ModelStartLearning(
            6,
            "primary education",
            "the education of 5-11 year olds",
            "In an ideal world, primary education would be compulsory in every country"
        )
        val word7 = ModelStartLearning(
            7,
            "secondary school (UK)/high school (US)",
            "the type of school for children age 11 to 16, sometimes 18",
            "I want to teach in a secondary school when I finish my teacher training as I really enjoy working with older pupils"
        )
        val word8 = ModelStartLearning(
            8,
            "co-educational/mixed",
            "a school where girls and boys are taught together",
            "These days, most schools in the UK are co-educational"
        )
        val word9 = ModelStartLearning(
            9,
            "single-sex school",
            "a school for either male or female students but not both",
            "Both my parents went to single-sex schools but it’s more normal these days to go to a mixed school"
        )
        val word10 = ModelStartLearning(
            10,
            "state school ",
            "a school that is funded and controlled by the government and for which no fees are charged",
            "The government is facing growing criticism for the underfunding of state schools"
        )
        val word11 = ModelStartLearning(
            11,
            "comprehensive school",
            "a state school that accepts pupils regardless of their level of academic ability or achievement",
            "There is an ongoing debate as to whether all young people should attend comprehensive schools or if schools that select pupils on academic ability are still relevant"
        )
        val word12 = ModelStartLearning(
            12,
            "grammar school",
            "state secondary school that selects their pupils by means of an examination taken by children at age 11",
            "Although many people are against selective education where some school places go to the most academically able pupils, grammar schools are still popular"
        )
        val word13 = ModelStartLearning(
            13,
            "private school",
            "a school that is not supported by government money, where education must be paid for by the children’s parents",
            "Jonah’s parents decided to pay for him to go to a private school because most classes only had 20 pupils in"
        )
        val word14 = ModelStartLearning(
            14,
            "private education",
            "education parents have to pay for",
            "Only a small percentage of parents can afford to give their children a private education"
        )
        val word15 = ModelStartLearning(
            15,
            "public school (UK)",
            "an exclusive, expensive school, run independently",
            "-"
        )
        val word16 = ModelStartLearning(
            16,
            "public school (US)",
            "a school which is free and paid for by the government",
            "-"
        )
        val word17 = ModelStartLearning(
            17,
            "higher education (also called tertiary education)",
            "education beyond the age at which it is compulsory, usually in a college or university",
            "Most of Vijay’s friends wanted to leave school and get a job as soon as possible but he was determined to go on to higher education to improve his career prospects"
        )
        val word18 = ModelStartLearning(
            18,
            "boarding school",
            "a school where students live and study during the school term",
            "Yu Yang hated boarding school as she missed her family and felt very homesick"
        )
        val word19 = ModelStartLearning(
            19,
            "undergraduate",
            "studying for a degree but having not yet achieved it",
            "-"
        )
        val word20 = ModelStartLearning(
            20,
            "postgraduate",
            "having achieved a degree and now studying for a higher qualification, possibly a professions qualification",
            "-"
        )
        val word21 = ModelStartLearning(
            21,
            "vocational",
            "education or training directed at a particular occupation and its skills, often requiring practical skills",
            "-"
        )
        val word22 = ModelStartLearning(
            22,
            "intensive",
            " fast-paced courses which give a lot of information quickly and in a short time",
            "-"
        )
        val word23 = ModelStartLearning(
            23,
            "qualification",
            "an official record showing that you have achieved a certain level of education or skill in a particular subject or skill area",
            "Riya was determined to leave school with good qualifications so she could get a well-paid job to support her family"
        )
        val word24 = ModelStartLearning(
            24,
            "diploma",
            "issued for a higher education course that is shorter than a degree",
            "Greg did so well in his two-year engineering diploma that his tutor persuaded him to study for another year to qualify for a degree"
        )
        val word25 = ModelStartLearning(
            25,
            "bachelor’s degree/or just degree (BA/BSc etc)",
            "qualification issued by a university or college at the end of three or four years of study",
            "I’m studying for a bachelor’s degree in marine biology"
        )
        val word26 = ModelStartLearning(
            26,
            "master’s degree/or just master’s (MA/MSc etc)",
            "qualification issued by a university when the student has completed further study beyond a degree, often in a more specialisn'ted field than a bachelor’s degree",
            "Alonso wanted to stay on at university an extra year to study for his master’s but his parents couldn't afford the fees"
        )
        val word27 = ModelStartLearning(
            27,
            "doctorate (PhD)",
            "the highest level of degree qualification issued by a university",
            "I’m so proud of my sister for achieving a PhD in biochemistry"
        )
        val word28 = ModelStartLearning(
            28,
            "fellowship",
            "a teaching or research post given to a person studying for an advanced degree",
            "Being awarded a research fellowship at my university is a dream come true as it enables me to stay on and study for my doctorate"
        )
        val word29 = ModelStartLearning(
            29,
            "headteacher/principal",
            "the person in charge of a school",
            "Our headteacher had been principal for 12 years when he retired"
        )
        val word30 = ModelStartLearning(
            30,
            "an academic",
            "a person who teaches in a college or university and continues to research and increase knowledge about their specialist subject",
            "She was such a bookworm at school and always in the library researching some topic or other, so it’s no surprise that she became an academic"
        )
        val word31 = ModelStartLearning(
            31,
            "mature student",
            "an adult student who attends college or university some years after leaving school",
            "Jose was so grateful for the chance to study for a degree as a mature student having left school with very few qualifications"
        )
        val word32 = ModelStartLearning(
            32,
            "a graduate",
            "a person who has finished their college or university education",
            "University graduates can usually get higher paid jobs than people with vocational skills"
        )
        val word33 = ModelStartLearning(
            33,
            "peer",
            "a person who is in the same class, age group or social group as someone else",
            "Pupils these days are under a lot of pressure to dress and behave like their peers"
        )
        val word34 = ModelStartLearning(
            34,
            "curriculum",
            "the subjects comprising a course of study in a school or college",
            "Her parents chose the school because it offered a broad curriculum including drama and dance which were her favourite subjects"
        )
        val word35 = ModelStartLearning(
            35,
            "syllabus",
            "an outline or summary of the subjects to be covered in a course",
            "The new syllabus included environmental science which was becoming more popular as a school subject"
        )
        val word36 = ModelStartLearning(
            36,
            "the three R's",
            "the basic educational skills of reading, writing and arithmetic (maths)",
            "Most schools put a high priority on teaching the three R's"
        )
        val word37 = ModelStartLearning(
            37,
            "humanities",
            "studies about human culture, such as literature, languages, philosophy, and history",
            "Tuma couldn’t decide whether to study history or philosophy at university so opted for a degree in humanities"
        )
        val word38 = ModelStartLearning(
            38,
            "science",
            "the study of the structure and behaviour of the physical world, divided into subjects such as physics, biology and chemistry",
            "-"
        )
        val word39 = ModelStartLearning(
            39,
            "physics",
            "the branch of science concerned with the nature and properties of matter and energy",
            "-"
        )
        val word40 = ModelStartLearning(
            40,
            "biology",
            "the study of living organisms",
            "-"
        )
        val word41 = ModelStartLearning(
            41,
            "chemistry",
            "the branch of science concerned with the substances of which matter is composed",
            "-"
        )
        val word42 = ModelStartLearning(
            42,
            "geography",
            "the study of the physical features of the earth and its atmosphere, and of human activity as it affects and is affected by these",
            "-"
        )
        val word43 = ModelStartLearning(
            43,
            "religious studies",
            "the study of religion and belief systems",
            "-"
        )
        val word44 = ModelStartLearning(
            44,
            "history",
            "the study of past events, particularly in human affairs",
            "-"
        )
        val word45 = ModelStartLearning(
            45,
            "information technology (IT or ICT)",
            "the study of the development, maintenance, and use of computer systems, software, and networks for the processing and distribution of data",
            "-"
        )
        val word46 = ModelStartLearning(
            46,
            "physical education (PE)",
            "instruction in physical exercise and games, especially in schools",
            "-"
        )
        val word47 = ModelStartLearning(
            47,
            "art",
            "the study of artistic techniques such as drawing, painting, sculpture, etc. or the appreciation of works of art",
            "-"
        )
        val word48 = ModelStartLearning(
            48,
            "music",
            "the study of how to play a musical instrument or sing, how to read music, how to compose music, etc",
            "-"
        )
        val word49 = ModelStartLearning(
            49,
            "drama",
            "the study of acting and theatrical performance",
            "-"
        )
        val word50 = ModelStartLearning(
            50,
            "home economics",
            "cooking and other aspects of household management, especially as taught at school",
            "-"
        )
        val word51 = ModelStartLearning(
            51,
            "to play truant",
            "to be absent without permission from parents or teachers",
            "Helios was always playing truant from school which he regretted when he failed his exams and struggled to find a good job"
        )
        val word52 = ModelStartLearning(
            52,
            "to skip classes",
            "to be absent from lessons you are supposed to attend",
            "I was never brave enough to skip classes as my parents would have been furious if they’d found out"
        )
        val word53 = ModelStartLearning(
            53,
            "bookworm",
            "a person who loves reading and/or studying",
            "My best friend is a real bookworm but is a great person to have on your quiz team because his general knowledge is excellent"
        )
        val word54 = ModelStartLearning(
            54,
            "rote learning",
            "a teaching style based on learning by memorisation through repetition",
            "My parents’ education was based on rote learning but there was more emphasis on learning by investigation by the time I went to school"
        )
        val word55 = ModelStartLearning(
            55,
            "literacy",
            "the ability to read and write, sometimes use as a subject title for reading and writing",
            "Afghanistan has one of the lowest literacy rates in the world with just 28% of people able to read and write"
        )
        val word56 = ModelStartLearning(
            56,
            "literate",
            "to be able to read and write",
            "In the past 20 years, the proportion of adults in the world who are literate has increased from 75% to 84% which is a great improvement"
        )
        val word57 = ModelStartLearning(
            57,
            "illiterate",
            "to be unable to read and write",
            "There are many children in the poorest countries of the world who have little or no access to education and are illiterate"
        )
        val word58 = ModelStartLearning(
            58,
            "remedial",
            "involving pupils who need extra help with a particular area of study or subject",
            "Pupils who got poor grades use to be put in a remedial class but now they are given extra support from a learning assistant"
        )
        val word59 = ModelStartLearning(
            59,
            "additional needs/special needs",
            "related to students who need special help due to a learning or physical difficulty",
            "Shona spend the later part of her teaching career working in a school for students with additional needs"
        )
        val word60 = ModelStartLearning(
            60,
            "extra-curricular activities",
            "activities or subjects offered in addition to the normal curriculum usually offered outside normal class hours, such as art, cooking or computer clubs and extra sporting activities",
            "The most popular extra-curricular activities at Westcroft School were pottery, badminton and computer programming"
        )
        val word61 = ModelStartLearning(
            61,
            "school uniform",
            "a particular set of clothes that has to be worn by pupils",
            "Do Hyan looked so smarting setting off for school on his first day wearing his new school uniform"
        )
        val word62 = ModelStartLearning(
            62,
            "discipline",
            "a set of rules governing conduct or behaviour",
            "Schools where a high level of discipline is maintained, generally have above average exam results"
        )
        val word63 = ModelStartLearning(
            63,
            "timetable",
            "a chart showing times of particular events, such as lesson times in the school day",
            "Ruby wasn’t very happy with her new timetable as she had double maths followed by double science on a Monday, both subjects she found hard"
        )
        val word64 = ModelStartLearning(
            64,
            "lecture theatre/hall",
            "a room or hall for lectures with seats in tiers",
            "There was excitement in the lecture theatre as the famous actor stood up to give the drama students a lecture on method acting"
        )
        val word65 = ModelStartLearning(
            65,
            "campus",
            "the buildings and grounds of a university or college",
            "It took me a long time to find my way around the campus when I first started at university"
        )
        val word66 = ModelStartLearning(
            66,
            "halls of residence",
            "a college or university building where students live",
            "In his first year at college, Somchai lived in a hall of residence, but in his second year, he rented a house with some other students"
        )
        val word67 = ModelStartLearning(
            67,
            "student accommodation",
            "living accommodation for college or university students",
            "The university offered a range of student accommodation including studio apartments, flats, halls of residence and shared houses"
        )
        val word68 = ModelStartLearning(
            68,
            "assignment",
            "a piece of work given to someone as part of their studies",
            "I have three more written assignments to complete this term"
        )
        val word69 = ModelStartLearning(
            69,
            "coursework",
            "written or practical work done by a student during a course of study, often assessed in order to count towards a final mark or grade",
            "Helga was really bad at exams so she chose a course where 50 per cent of the overall marks came from assessed coursework"
        )
        val word70 = ModelStartLearning(
            70,
            "dissertation",
            "is a long formal piece of writing on a particular subject, especially for a university degree",
            "It was hard getting my dissertation finished by the deadline and I handed it in on the very last day"
        )
        val word71 = ModelStartLearning(
            71,
            "thesis",
            "a long piece of writing on a particular subject, especially one that is done for a higher degree",
            "Adao wrote his PhD thesis on the effect of organic fertilizers on soil fertility in tropical climates"
        )
        val word72 = ModelStartLearning(
            72,
            "presentation",
            "a speech or talk given in front of an audience",
            "As part of their end of year assessment, the students had to give a presentation on the theories of learning for children under 3 years of age"
        )
        val word73 = ModelStartLearning(
            73,
            "tuition",
            "teaching or instruction, especially of individual pupils or small groups",
            "Dana was unable to get to lectures after breaking her leg but the college provided individual tuition for her until she recovered"
        )
        val word74 = ModelStartLearning(
            74,
            "tutorial",
            "a small group study session with a tutor often following a lecture",
            "He always found tutorials helpful as it was a chance to ask questions about what they’d heard in the lecture"
        )
        val word75 = ModelStartLearning(
            75,
            "seminar",
            "a class at university in which a specific topic is discussed by a teacher and a small group of students",
            "At university, I found seminars far more useful than lectures as I learn best in a small group"
        )
        val word76 = ModelStartLearning(
            76,
            "correspondence course",
            "a course of study in which student and tutors communicate by post",
            "Juan’s local college didn’t offer a course in accountancy but he found a good correspondence course to give him the qualification he needed"
        )
        val word77 = ModelStartLearning(
            77,
            "distance learning",
            "a way of studying in which lectures are broadcast or lessons are conducted by post or via the internet without the student needing to attend a school or college or have in-person teacher interaction",
            "I prefer to study by distance learning as I can work when I want and at the pace I want"
        )
        val word78 = ModelStartLearning(
            78,
            "online learning",
            "Similar to distance learning but done 100% via the internet and often involving in-person interaction with a teacher online",
            "I find online learning ideal for preparing for my IELTS exam and enjoy connecting with my teacher via Skype"
        )
        val word79 = ModelStartLearning(
            79,
            "to sit an exam",
            "to take an exam",
            "I want to carry on learning for the rest of my life but after I finish my training I hope I never have to sit an exam again"
        )
        val word80 = ModelStartLearning(
            80,
            "tuition fees",
            "the money paid for a course of study, especially at a private school or a college or university",
            "High tuition fees mean that many young people can’t afford to go to university"
        )
        val word81 = ModelStartLearning(
            81,
            "a grant",
            "money given by the government to support a student while studying",
            "Bernice was successful in her application for a grant which meant that she could attend her local university"
        )
        val word82 = ModelStartLearning(
            82,
            "a student loan",
            "money which a student can borrow while they are studying, but which has to be repaid",
            "Geraint took out student loans of £9000 a year to pay for his tuition of fees and left university heavily in debt"
        )
        val word83 = ModelStartLearning(
            83,
            "a scholarship",
            "money given to someone, often by the institution they are studying at, to help pay for their tuition",
            "He was overjoyed to receive a scholarship to Oxford University as his parents couldn’t afford to pay the fees"
        )
        val word84 = ModelStartLearning(
            84,
            "internship",
            "a period of work experience (often unpaid) offered by an employer to give students and graduates experience of working in an industry related to their field of study",
            "All students on the course were expected to secure an internship during the long vacation between the second and third years of their degree course"
        )
        val word85 = ModelStartLearning(
            85,
            "unconditional offer",
            "the offer of a place at an educational institution for which you already meet the entry requirements",
            "Mustafa was delighted to receive an unconditional offer from his first choice university and accepted immediately"
        )
        val word86 = ModelStartLearning(
            86,
            "conditional offer",
            "the offer of a place at an educational institution which requires you to meet certain entry requirements, usually specific exam grades",
            "She was fairly confident that she would get the exam grades she needed to take up the conditional offer at Bristol University"
        )
        val word87 = ModelStartLearning(
            87,
            "to major in",
            "to choose as your main subject",
            "I want to major in primary education with a specialism in science"
        )
        val word88 = ModelStartLearning(
            88,
            "faculty",
            "department in a university that specialises in a specific subject",
            "It was a proud day for the university when the faculty of science move into the new, state-of-the-art building"
        )
        val word89 = ModelStartLearning(
            89,
            "research",
            "a detailed study of a particular subject",
            "I’m really enjoying this research project on the migratory behaviour of the golden eagle"
        )
        val word90 = ModelStartLearning(
            90,
            "to work your way through university",
            "to have a paid job while studying to support yourself financially",
            "With the steep increase in tuition fees, many students are forced to work their way through university"
        )
        val word91 = ModelStartLearning(
            91,
            "to keep up with your studies",
            "to not fall behind with your work",
            "Giang would have to limit his time socializing with his friends if he was going to keep up with his studies"
        )
        val word92 = ModelStartLearning(
            92,
            "to fall behind with your studies",
            "to not get your coursework and assignments done in the time allowed",
            "She was a hard-working student but fell behind with her studies after catching pneumonia and having to spend time in hospital"
        )
        val word93 = ModelStartLearning(
            93,
            "to learn something by heart",
            "to memorise it",
            "By the end of his first week learning English, Elisha had learnt all the days of the weeks and months of the year by heart"
        )
        val word94 = ModelStartLearning(
            94,
            "gap year",
            "a period, typically an academic year, taken by a student as a break between school and university or college education",
            "Many students spend their gap year travelling to get more experience of life before they settle down to studying for a degree"
        )
        val word95 = ModelStartLearning(
            95,
            "to take a year out",
            "to take a gap year",
            "Before going to the university, I took a year out to travel and also earn some money"
        )
        val word96 = ModelStartLearning(
            96,
            "to enrol",
            "to officially register on a course at a college or university",
            "She didn’t know an old friend had enrolled on the same course until they met up on the first day"
        )
        val word97 = ModelStartLearning(
            97,
            "sign up for",
            "to commit to something for a specific period such as the duration of a course",
            "Having signed up for the photography course, she now had to ask her brother if she could borrow his camera"
        )
        val word98 = ModelStartLearning(
            98,
            "to drop out",
            "to leave a course before completing it",
            "Hiran was forced to drop out of university when his father became ill and he had to take over the family business to support his family"
        )
        val word99 = ModelStartLearning(
            99,
            "a dropout",
            "a student who fails to complete a course of study and leaves the educational institution with no qualifications",
            "Many famous and very wealthy entrepreneurs are college dropouts, which proves that you don’t need a degree to succeed in life"
        )
        val word100 = ModelStartLearning(
            100,
            "well-educated",
            "someone who has received a high level or good standard of education",
            "You could tell that he was well-educated by the way he spoke"
        )
        val word101 = ModelStartLearning(
            101,
            "to meet a deadline",
            "to complete a piece of work by the required date",
            "I didn’t think I’d get my essay written in time but I just met the deadline"
        )
        val word102 = ModelStartLearning(
            102,
            "note-taking",
            "to take notes in a lesson or lecture when the teacher is talking",
            "I find note-taking in a lecture really difficult as I miss much of what is being said while I’m writing"
        )
        val word103 = ModelStartLearning(
            103,
            "to revise",
            "study or read something again in order to remember it better, often before exams",
            "No matter how hard I revise, my mind goes blank as soon as I get into the exam room"
        )
        val word104 = ModelStartLearning(
            104,
            "to review",
            "to read over something again. Similar to revise, but generally done just after a lesson or lecture rather than in preparation for an exam",
            "Bella found that reviewing her notes just before going to sleep helped her to remember the key points"
        )
        val word105 = ModelStartLearning(
            105,
            "workload",
            "the amount of work that has to be done",
            "The course workload felt overwhelming at first but became more manageable once the students had covered the theory and moved on to the more practical part of the course"
        )
        val word106 = ModelStartLearning(
            106,
            "to pass with flying colours",
            "to pass an exam or test easily and with excellent result",
            "He was sure he was going to fail his maths exam but passed with flying colours"
        )
        val word107 = ModelStartLearning(
            107,
            "scrape through",
            "to just pass an exam",
            "She ran out of time in the exam and left many questions unanswered but just scraped through with a pass mark"
        )
        val word108 = ModelStartLearning(
            108,
            "to resit/retake an exam",
            "to take an exam again in order to get a better result",
            "Madee needed band 7 in her IELTS Speaking test but only got 6.5, so she had to retake the exam"
        )
        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)
        wordlist.add(word14)
        wordlist.add(word15)
        wordlist.add(word16)
        wordlist.add(word17)
        wordlist.add(word18)
        wordlist.add(word19)
        wordlist.add(word20)
        wordlist.add(word21)
        wordlist.add(word22)
        wordlist.add(word23)
        wordlist.add(word24)
        wordlist.add(word25)
        wordlist.add(word26)
        wordlist.add(word27)
        wordlist.add(word28)
        wordlist.add(word29)
        wordlist.add(word30)
        wordlist.add(word31)
        wordlist.add(word32)
        wordlist.add(word33)
        wordlist.add(word34)
        wordlist.add(word35)
        wordlist.add(word36)
        wordlist.add(word37)
        wordlist.add(word38)
        wordlist.add(word39)
        wordlist.add(word40)
        wordlist.add(word41)
        wordlist.add(word42)
        wordlist.add(word43)
        wordlist.add(word44)
        wordlist.add(word45)
        wordlist.add(word46)
        wordlist.add(word47)
        wordlist.add(word48)
        wordlist.add(word49)
        wordlist.add(word50)
        wordlist.add(word51)
        wordlist.add(word52)
        wordlist.add(word53)
        wordlist.add(word54)
        wordlist.add(word55)
        wordlist.add(word56)
        wordlist.add(word57)
        wordlist.add(word58)
        wordlist.add(word59)
        wordlist.add(word60)
        wordlist.add(word61)
        wordlist.add(word62)
        wordlist.add(word63)
        wordlist.add(word64)
        wordlist.add(word65)
        wordlist.add(word66)
        wordlist.add(word67)
        wordlist.add(word68)
        wordlist.add(word69)
        wordlist.add(word70)
        wordlist.add(word71)
        wordlist.add(word72)
        wordlist.add(word73)
        wordlist.add(word74)
        wordlist.add(word75)
        wordlist.add(word76)
        wordlist.add(word77)
        wordlist.add(word78)
        wordlist.add(word79)
        wordlist.add(word80)
        wordlist.add(word81)
        wordlist.add(word82)
        wordlist.add(word83)
        wordlist.add(word84)
        wordlist.add(word85)
        wordlist.add(word86)
        wordlist.add(word87)
        wordlist.add(word88)
        wordlist.add(word89)
        wordlist.add(word90)
        wordlist.add(word91)
        wordlist.add(word92)
        wordlist.add(word93)
        wordlist.add(word94)
        wordlist.add(word95)
        wordlist.add(word96)
        wordlist.add(word97)
        wordlist.add(word98)
        wordlist.add(word99)
        wordlist.add(word100)
        wordlist.add(word101)
        wordlist.add(word102)
        wordlist.add(word103)
        wordlist.add(word104)
        wordlist.add(word105)
        wordlist.add(word106)
        wordlist.add(word107)
        wordlist.add(word108)

        return wordlist
    }

    fun getHobbyWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "Acting",
            "The art or occupation of performing fictional roles in plays, films, or television",
            "Her acting career is part of her past"
        )
        val word2 = ModelStartLearning(
            2,
            "Archery",
            "Sport where we shooting with a arrows using a bow, especially at a target",
            "She excelled at archery and won an Olympic silver medal at the London Games in 1908"
        )
        val word3 = ModelStartLearning(
            3,
            "Astronomy",
            "It is the study of objects and matter outside the earth’s atmosphere and of their physical and chemical characteristics",
            "He is interested in cosmology and astronomy"
        )
        val word4 = ModelStartLearning(
            4,
            "Backpacking",
            "Solo trip you enjoy with backpack",
            "He took time out from his job as a production assistant to go backpacking around the world"
        )
        val word5 = ModelStartLearning(
            5,
            "Badminton",
            "Badminton is a sport in which light rackets are used to volley an object—called a shuttlecock, shuttle, birdie, or bird—back and forth over a high net",
            "We have in school the indoor badminton court"
        )
        val word6 = ModelStartLearning(
            6,
            "Baseball",
            "a ball game played between two teams of nine on a diamond-shaped circuit of four bases",
            "The baseball is very tough to play"
        )
        val word7 = ModelStartLearning(
            7,
            "Basketball",
            "A fast paced game played between two teams of five players in which goals are scored by throwing a ball through a netted hoop fixed at each end of the court",
            "He was also a good swimmer and very good at wheelchair basketball"
        )
        val word8 = ModelStartLearning(
            8,
            "Beekeeping",
            "The profession of owning and breeding bees for their honey",
            "Part of the garden was railed out for beekeeping"
        )
        val word9 = ModelStartLearning(
            9,
            "Birdwatching",
            "Observing birds in their natural environment for Pleasure",
            "At 10.00 AM it became already quite hot and we decided to relax and do some bird-watching from the lodge"
        )
        val word10 = ModelStartLearning(
            10,
            "Blogging",
            "add new material to or regularly update a blog",
            "Blog writing is very interesting as it keeps you occupied"
        )
        val word11 = ModelStartLearning(
            11,
            "Board Games",
            "Board games are tabletop games that typically use pieces",
            "We enjoy playing various board games"
        )
        val word12 = ModelStartLearning(
            12,
            "Boating",
            "Rowing or sailing in boats as a sport",
            "We used to go boating on that lake"
        )
        val word13 = ModelStartLearning(
            13,
            "Breakdancing",
            "an energetic style of dance typically performed to hip-hop music, characterized by stylized footwork and acrobatic or athletic movements",
            "You breakdance your way through stages, similar to a fighting game, in order to prove your prowess on the dance floor."
        )
        val word14 = ModelStartLearning(
            14,
            "Calligraphy",
            "The art of producing decorative handwriting or lettering with a pen or brush.",
            "There's some wonderful calligraphy in these old manuscripts"
        )
        val word15 = ModelStartLearning(
            15,
            "Candle Making",
            "This is an art of making candles",
            "Excellent wine is made, and flour-milling, leather-working, brick and candle making and soap-boiling are the chief industries"
        )
        val word16 = ModelStartLearning(
            16,
            "Canoeing",
            "The sport or activity of paddling a light, narrow boat in a river",
            "They were canoeing in the river"
        )
        val word17 = ModelStartLearning(
            17,
            "Car Racing",
            "the sport of racing automobiles in which drivers compete against each other on a course designed for racing or on closed public roads",
            "I enjoy watching car race"
        )
        val word18 = ModelStartLearning(
            18,
            "Card Games",
            "A game in which playing cards are used",
            "Jim staked his whole fortune on one card game"
        )
        val word19 = ModelStartLearning(
            19,
            "Carpentry",
            "the activity or occupation of making or repairing things in wood.",
            "There is a carpentry work which is pending since long"
        )
        val word20 = ModelStartLearning(
            20,
            "Caving",
            "The sport or pastime of exploring caves for adventure",
            "People had lost their roofs and their ceilings had caved in"
        )
        val word21 = ModelStartLearning(
            21,
            "Cheerleading",
            "a sport involving the performance of organized cheering, chanting, and dancing in support of a sports team at matches",
            "There are cheerleaders in every field sports"
        )
        val word22 = ModelStartLearning(
            22,
            "Chess",
            "a board game of strategic skill for two players, played on a chequered board on which each playing piece is moved according to precise rules",
            "We play chess during week ends"
        )
        val word23 = ModelStartLearning(
            23,
            "Climbing",
            "The sport or activity of climbing mountains or cliffs for thrill",
            "He fell behind when we were climbing the mountain"
        )
        val word24 = ModelStartLearning(
            24,
            "Collecting",
            "Bring or gather together",
            "The French had attacked the men collecting wood in the copse"
        )
        val word25 = ModelStartLearning(
            25,
            "Coloring",
            "Change the colour of (something) by painting, dyeing, or shading it",
            "She added some blue food coloring to the icing"
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)
        wordlist.add(word14)
        wordlist.add(word15)
        wordlist.add(word16)
        wordlist.add(word17)
        wordlist.add(word18)
        wordlist.add(word19)
        wordlist.add(word20)
        wordlist.add(word21)
        wordlist.add(word22)
        wordlist.add(word23)
        wordlist.add(word24)
        wordlist.add(word25)

        return wordlist
    }

    fun getMixedWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "Exacerbate",
            "to make something worse",
            "The problem of climate change is exacerbated by people flying too much and creating carbon emissions "
        )
        val word2 = ModelStartLearning(
            2,
            "Mitigate",
            "make less severe, less unpleasant",
            "We could mitigate the impact of climate change by flying less"
        )
        val word3 = ModelStartLearning(
            3,
            "Unsurmountable",
            "Impossible to solve",
            "Although climate change is a challenging problem, it’s not unsurmountable, we can solve it."
        )
        val word4 = ModelStartLearning(
            4,
            "An uphill struggle",
            "Difficult / challenging but possible",
            "Writing my new book has been an uphill struggle, so I will be thrilled when it’s finished."
        )
        val word5 = ModelStartLearning(
            5,
            "Apprehensive",
            "worried, nervous (about a bad result)",
            "Initially, I was really apprehensive about doing my driving test, but in the end, it turned out really well. "
        )
        val word6 = ModelStartLearning(
            6,
            "Bewildered",
            "confused ",
            "I was utterly bewildered by my friend’s decision to quit his high paid job"
        )
        val word7 = ModelStartLearning(
            7,
            "To do my utmost",
            "To try my best",
            "The government have produced a good economic plan, and I am sure they will do their utmost to implement it."
        )
        val word8 = ModelStartLearning(
            8,
            "Inept",
            "Not good at your job, showing a lack of skill",
            "My boss likes to design his own PowerPoints, but between you and me, he is rather inept at it."
        )
        val word9 = ModelStartLearning(
            9,
            "Impeccable",
            "Perfect, without fault ",
            "My friend has lived in America and she speaks impeccable English"
        )
        val word10 = ModelStartLearning(
            10,
            "Disgruntled",
            "unhappy and disappointed / dissatisfied ",
            "The customer service in the shop was terrible and I felt rather disgruntled"
        )
        val word11 = ModelStartLearning(
            11,
            "Ludicrous",
            "unreasonable, or out of place, so as to be funny",
            "Well, a person I admire a lot was the Queen of England, and I find it ludicrous some countries would prefer to be a republic, rather than have her as head of state"
        )
        val word12 = ModelStartLearning(
            12,
            "Pinnacle",
            "the most successful point",
            "A person I admire a lot would be Sir Lewis Hamilton, during his career he has been at the pinnacle of motorsport”"
        )
        val word13 = ModelStartLearning(
            13,
            "Proponent",
            "a person who advocates for something",
            "I think I am a big proponent for making the world a cleaner place, for example…”"
        )
        val word14 = ModelStartLearning(
            14,
            "Invigorating",
            "making one feel strong, healthy, and full of energy",
            "Well, to relax, I find a long hot bath with some candles and music, really invigorates me for next day"
        )
        val word15 = ModelStartLearning(
            15,
            "Indulge",
            "to enjoy the pleasure of something",
            "Well, to relax, I make a huge hot chocolate, loaded with marshmallows, then grab a pack of biscuits, and indulge my sweet tooth for an hour or two"
        )
        val word16 = ModelStartLearning(
            16,
            "Mere",
            "used to emphasize how insignificant someone or something is",
            "The mountain cannot be climbed by mere mortals"
        )


        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)
        wordlist.add(word14)
        wordlist.add(word15)
        wordlist.add(word16)

        return wordlist
    }














    fun getExampleWords(): ArrayList<ModelStartLearning> {
        val wordlist = ArrayList<ModelStartLearning>()

        val word1 = ModelStartLearning(
            1,
            "",
            "",
            ""
        )
        val word2 = ModelStartLearning(
            2,
            "",
            "",
            ""
        )
        val word3 = ModelStartLearning(
            3,
            "",
            "",
            ""
        )
        val word4 = ModelStartLearning(
            4,
            "",
            "",
            ""
        )
        val word5 = ModelStartLearning(
            5,
            "",
            "",
            ""
        )
        val word6 = ModelStartLearning(
            6,
            "",
            "",
            ""
        )
        val word7 = ModelStartLearning(
            7,
            "",
            "",
            ""
        )
        val word8 = ModelStartLearning(
            8,
            "",
            "",
            ""
        )
        val word9 = ModelStartLearning(
            9,
            "",
            "",
            ""
        )
        val word10 = ModelStartLearning(
            10,
            "",
            "",
            ""
        )
        val word11 = ModelStartLearning(
            11,
            "",
            "",
            ""
        )
        val word12 = ModelStartLearning(
            12,
            "",
            "",
            ""
        )
        val word13 = ModelStartLearning(
            13,
            "",
            "",
            ""
        )
        val word14 = ModelStartLearning(
            14,
            "",
            "",
            ""
        )
        val word15 = ModelStartLearning(
            15,
            "",
            "",
            ""
        )
        val word16 = ModelStartLearning(
            16,
            "",
            "",
            ""
        )
        val word17 = ModelStartLearning(
            17,
            "",
            "",
            ""
        )
        val word18 = ModelStartLearning(
            18,
            "",
            "",
            ""
        )
        val word19 = ModelStartLearning(
            19,
            "",
            "",
            ""
        )
        val word20 = ModelStartLearning(
            20,
            "",
            "",
            ""
        )
        val word21 = ModelStartLearning(
            21,
            "",
            "",
            ""
        )
        val word22 = ModelStartLearning(
            22,
            "",
            "",
            ""
        )
        val word23 = ModelStartLearning(
            23,
            "",
            "",
            ""
        )
        val word24 = ModelStartLearning(
            24,
            "",
            "",
            ""
        )

        wordlist.add(word1)
        wordlist.add(word2)
        wordlist.add(word3)
        wordlist.add(word4)
        wordlist.add(word5)
        wordlist.add(word6)
        wordlist.add(word7)
        wordlist.add(word8)
        wordlist.add(word9)
        wordlist.add(word10)
        wordlist.add(word11)
        wordlist.add(word12)
        wordlist.add(word13)
        wordlist.add(word14)
        wordlist.add(word15)
        wordlist.add(word16)
        wordlist.add(word17)
        wordlist.add(word18)
        wordlist.add(word19)
        wordlist.add(word20)
        wordlist.add(word21)
        wordlist.add(word22)
        wordlist.add(word23)
        wordlist.add(word24)

        return wordlist
    }
}