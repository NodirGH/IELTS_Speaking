package my.application.ieltsspeaking.home.category.test_yourself.local

import my.application.ieltsspeaking.home.category.test_yourself.model.TestYourselfModel

class RecordingMapper {
    companion object {
        private fun mapEntityToDto(recordingEntity: RecordingEntity): TestYourselfModel {
            return TestYourselfModel(
                record = recordingEntity.record ?: ""
            )
        }
    }
}