package my.application.ieltsspeaking.utils

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    var questionsSize = MutableLiveData<Int>()
     val correctAnswer = MutableLiveData<Int>()
     val incorrectAnswer = MutableLiveData<Int>()


    fun sendAnswers(allQuestion:Int, correct:Int, incorrect: Int){
        questionsSize.value = allQuestion
        correctAnswer.value = correct
        incorrectAnswer.value = incorrect
        }

}