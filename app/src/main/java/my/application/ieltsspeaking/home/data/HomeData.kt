package my.application.ieltsspeaking.home.data

import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.home.model.ModelHome

class HomeData {

    companion object {
        fun getHomeData(): List<ModelHome> {
            return listOf(
                ModelHome(1, "Pronunciation", R.drawable.pronunciation, R.drawable.bg_second_column),
                ModelHome(2,"Part 1 Topic", R.drawable.part1,    R.drawable.bg_first_column),
                ModelHome(3,"Part 2 Topic", R.drawable.part2, R.drawable.bg_second_column),
                ModelHome(4,"Part 3 Topic", R.drawable.part3, R.drawable.bg_first_column),
                ModelHome(5,"Vocabulary", R.drawable.vocabulary, R.drawable.bg_second_column),
                ModelHome(6,"Video answer", R.drawable.youtube,R.drawable.bg_first_column),
                ModelHome(7,"Band calculation", R.drawable.calculator, R.drawable.bg_second_column),
                ModelHome(8,"Info", R.drawable.info, R.drawable.bg_first_column),
                ModelHome(9,"About", R.drawable.about, R.drawable.bg_second_column),
                ModelHome(10,"----------", R.drawable.ic_android, R.drawable.bg_first_column)
            )
        }
    }
}
