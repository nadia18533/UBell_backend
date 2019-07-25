package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Department;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.Institute;
import com.UniversitySchedule_2_2.entity.Specialty;
import com.UniversitySchedule_2_2.entity.Student;
import com.UniversitySchedule_2_2.entity.Teacher;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import lombok.Data;

@Data
public class GroupDTO{

  private Long id;

  private String name;

  private Institute institute;

  private Specialty specialty;

  private Teacher curator;

  private Student captain;

  private Department cathedra;

  private Integer course;

  public GroupDTO() {
  }

  public GroupDTO(Group group) {

    //TODO Fix it
    /**
     * It's magic bug. If didn't wrote this local variables, these objects will be null
     * I will fix it in future !!!
     */
    String bug_institute = group.getInstitute().toString();
    String bug_specialty = group.getSpecialty().toString();
    String bug_curator = group.getCurator().toString();
    String bug_captain = group.getCaptain().toString();
    String bug_cathedra = group.getCathedra().toString();

    this.id = group.getId();
    this.name = group.getName();
    this.institute = group.getInstitute();
    this.specialty = group.getSpecialty();
    this.curator = group.getCurator();
    this.captain = group.getCaptain();
    this.cathedra = group.getCathedra();
    this.course = group.getCourse();
  }
}
