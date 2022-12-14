package my.application.ieltsspeaking.home.category.test_yourself.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recording_table")
data class RecordingEntity(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = "orderNumber") val orderNumber: Int? = null,
    @ColumnInfo(name = "record") val record : String?,
    @ColumnInfo(name = "play") val play : String?,
    @ColumnInfo(name = "pause") val pause : Boolean?,
    @ColumnInfo(name = "stop") val stop : Boolean?,
    @ColumnInfo(name = "delete") val delete : Boolean?,
    @ColumnInfo(name = "share") val share : Boolean?,
    @ColumnInfo(name = "question") val question : String?,
    @ColumnInfo(name = "sampleAnswerButton") val sampleAnswerButton : Boolean?,
    @ColumnInfo(name = "sampleAnswer") val sampleAnswer : String?
)