package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.LessonType;
import com.UniversitySchedule_2_2.entity.Subject;
import lombok.Data;

@Data
public class LessonTypeDTO {

  private Long id;

  private String name;

  private String abbreviated;

  public LessonTypeDTO() {
  }

  public LessonTypeDTO(LessonType lessonType) {
    this.id = lessonType.getId();
    this.name = lessonType.getName();
  }
}
