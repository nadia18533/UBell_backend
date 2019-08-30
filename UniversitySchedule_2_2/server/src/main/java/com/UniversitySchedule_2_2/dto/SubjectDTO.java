package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Subject;
import lombok.Data;

@Data
public class SubjectDTO {

  private Long id;

  private String name;

  public SubjectDTO() {
  }

  public SubjectDTO(Subject subject) {
    this.id = subject.getId();
    this.name = subject.getName();
  }
}
