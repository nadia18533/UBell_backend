package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Teacher;
import lombok.Data;


@Data
public class TeacherNamesDTO {

  private Long id;

  private String fullName;

  public TeacherNamesDTO() {
  }

  public TeacherNamesDTO(Teacher teacher) {
    this.id = teacher.getId();
    this.fullName = teacher.getFirstName() + teacher.getLastName() + teacher.getMiddleName();
  }

}
