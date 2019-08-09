package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Department;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.Institute;
import com.UniversitySchedule_2_2.entity.Specialty;
import com.UniversitySchedule_2_2.entity.Student;
import com.UniversitySchedule_2_2.entity.Teacher;
import lombok.Data;

@Data
public class GroupNamesDTO {

  private Long id;

  private String name;

  private String department;

  private String institute;

    public GroupNamesDTO() {
  }

  public GroupNamesDTO(Group group) {

    //TODO Fix it
    /**
     * It's magic bug. If didn't wrote this local variables, these objects will be null
     * I will fix it in future !!!
     */
    String bug_institute = group.getInstitute().toString();
    String bug_cathedra = group.getDepartment().toString();

    this.id = group.getId();
    this.name = group.getName();
    this.department = group.getDepartment().getName();
    this.institute = group.getInstitute().getName();
  }
}
