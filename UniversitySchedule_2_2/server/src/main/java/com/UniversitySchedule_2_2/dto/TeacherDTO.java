package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Department;
import com.UniversitySchedule_2_2.entity.Rank;
import com.UniversitySchedule_2_2.entity.Teacher;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import lombok.Data;


@Data
public class TeacherDTO {

  private Long id;

  private String firstName;

  private String lastName;

  private String middleName;

  private Department department;

  private Rank rank;

  private String phoneNumber1;

  private String phoneNumber2;

  private String address;

  private String about;

  public TeacherDTO() {
  }

  public TeacherDTO(Teacher teacher) {

    //TODO Fix it
    /**
     * It's magic bug. If didn't wrote this local variables, these objects will be null
     * I will fix it in future !!!
     */
    String bug_cathedra = teacher.getDepartment().getName();
    String bug_rank = teacher.getRank().getName();

    this.id = teacher.getId();
    this.firstName = teacher.getFirstName();
    this.lastName = teacher.getLastName();
    this.middleName = teacher.getMiddleName();
    this.department = teacher.getDepartment();
    this.rank = teacher.getRank();
    this.phoneNumber1 = teacher.getPhoneNumber1();
    this.phoneNumber2 = teacher.getPhoneNumber2();
    this.address = teacher.getAddress();
    this.about = teacher.getAbout();
  }

}
