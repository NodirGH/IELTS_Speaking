package my.application.ieltsspeaking.home.category.test_yourself.local

import my.application.ieltsspeaking.home.category.test_yourself.part1.data.TestYourselfPart1Data

class RecordingRepository(private val recordingDao: RecordingDao = RecordingDatabase.recordingDatabase.recordingDao()) {

//    val record = recordingDao.addRecord()

    suspend fun addRecord(recordingEntity: RecordingEntity) {
        recordingDao.addRecord(recordingEntity)
    }

        suspend fun insertInitialQuestion() {
        val dbItemCount =recordingDao.getQuestionCount()
            if (dbItemCount == 0){
            val initialQuestions = TestYourselfPart1Data.getTestYourselfPart1Data().map { it.mapToEntity() }
                recordingDao.addAllQuestions(initialQuestions)
            }
        }

//    suspend fun addRecording(recording: String){
//        recordingDao.insertRecording(recording)
//    }

    companion object{
        fun getInstance(): RecordingRepository{
            return RecordingRepository()
        }
    }


}