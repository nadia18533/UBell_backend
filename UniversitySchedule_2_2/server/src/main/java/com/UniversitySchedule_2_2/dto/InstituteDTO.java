package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Institute;
import lombok.Data;

@Data
public class InstituteDTO {

  private Long id;

  private String name;

  public InstituteDTO() {
  }

  public InstituteDTO(Institute institute) {
    this.id = institute.getId();
    this.name = institute.getName();
  }
}
