package com.example.ieltsspeaking.home.data

import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.home.model.ModelHome

class HomeData {

    companion object {
        fun getHomeData(): List<ModelHome> {
            return listOf(
                ModelHome(1, "Test yourself", R.drawable.ic_menu, R.drawable.bg_test_yourself),
                ModelHome(2, "Cue Cards", R.drawable.ic_card, R.drawable.bg_card),
                ModelHome(3,"Part 1 Topic", R.drawable.ic_part1,    R.drawable.bg_part1),
                ModelHome(4,"Part 2 & 3 Topics", R.drawable.ic_part2_3, R.drawable.bg_part2_3),
                ModelHome(5,"Vocabulary", R.drawable.ic_vocabulary, R.drawable.bg_vocabulary),
                ModelHome(6,"Tips", R.drawable.ic_tips, R.drawable.bg_tips),
                ModelHome(7,"Video answer", R.drawable.ic_video_answer,R.drawable.bg_video_answer),
                ModelHome( 8,"Band calculation", R.drawable.ic_band_calc, R.drawable.bg_calc),
                ModelHome( 9,"Info", R.drawable.ic_info, R.drawable.bg_info),
                ModelHome( 10,"About", R.drawable.ic_about, R.drawable.bg_about)
            )
        }
    }
}