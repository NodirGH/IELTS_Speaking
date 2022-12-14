package my.application.ieltsspeaking.home.category.test_yourself.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RecordingDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addRecord(recordingEntity: RecordingEntity)

    @Query("SELECT COUNT(id) FROM recording_table")
    suspend fun getQuestionCount(): Int

    @Insert
    fun addAllQuestions(question: List<RecordingEntity>)

//    @Insert
//    suspend fun insertRecording(recording: String)

}