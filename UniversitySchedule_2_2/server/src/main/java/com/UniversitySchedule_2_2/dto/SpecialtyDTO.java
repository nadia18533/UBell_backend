package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Specialty;
import lombok.Data;

@Data
public class SpecialtyDTO {

  private Long id;

  private String name;

  public SpecialtyDTO() {
  }

  public SpecialtyDTO(Specialty specialty) {
    this.id = specialty.getId();
    this.name = specialty.getName();
  }
}
