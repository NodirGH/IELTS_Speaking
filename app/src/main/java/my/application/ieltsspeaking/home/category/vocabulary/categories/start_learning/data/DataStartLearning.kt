package my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.data

import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.model.ModelStartLearning


class DataStartLearning {
    companion object{

        fun getWorkWords():List<ModelStartLearning>{
            return listOf(
                ModelStartLearning(1, "to get involve in", "to become a part of (an organization)", "Richie never got involved in cooking"),
                ModelStartLearning(2, "to fit in", "to become suitable or appropriate", "Tom tried to fit in with his friends"),
                ModelStartLearning(3, "job flexibility", "gives employees flexibility on how long, where, and when they work", "Job flexibility plays an important role in retaining employees"),
                ModelStartLearning(4, "nine-to-five work", "the normal work schedule for most jobs", "George joined a nine-to-five work and was happy with it"),
                ModelStartLearning(5, "to dedicate", "devote (time or effort) to a particular task or purpose", "John dedicated his evenings to his daughter"),
                ModelStartLearning(6, "world-class", "of or among the best in the world", "Tom built a new hotel with world-class facilities"),
                ModelStartLearning(7, "perk", "an advantage or something extra that you are given because of your job", "The new job offer contained a lot of perks"),
                ModelStartLearning(8, "overloaded", "to give excessive work, responsibility, or information to", "The boss always overloaded his employees with work")
            )
        }
    }
}