package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Department;
import lombok.Data;

@Data
public class DepartmentDTO {

  private Long id;

  private String name;

  public DepartmentDTO() {
  }

  public DepartmentDTO(Department department) {
    this.id = department.getId();
    this.name = department.getName();
  }
}
