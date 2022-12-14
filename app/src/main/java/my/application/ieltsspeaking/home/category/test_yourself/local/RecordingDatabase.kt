package my.application.ieltsspeaking.home.category.test_yourself.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.internal.synchronized

@Database(entities = [RecordingEntity::class], version = 1, exportSchema = false)
abstract class RecordingDatabase: RoomDatabase() {

    abstract fun recordingDao(): RecordingDao


    companion object{
        lateinit var recordingDatabase: RecordingDatabase

        //I didn't add @Volatile annotation in this line
        private var INSTANCE: RecordingDatabase? = null

        fun getDatabase(context: Context): RecordingDatabase{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            kotlin.synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecordingDatabase::class.java,
                    "recording_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}