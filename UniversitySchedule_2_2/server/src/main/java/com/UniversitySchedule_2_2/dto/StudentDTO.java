package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.Student;
import com.UniversitySchedule_2_2.entity.Teacher;
import lombok.Data;

@Data
public class StudentDTO {

  private Long id;

  private String firstName;

  private String lastName;

  private String middleName;

  private Group group;

  private String phoneNumber1;

  private String phoneNumber2;

  private String address;

  private String about;

  public StudentDTO() {
  }

  public StudentDTO(Student student) {

    //TODO Fix it
    /**
     * It's magic bug. If didn't wrote this local variables, these objects will be null
     * I will fix it in future !!!
     */
    String bug_group = student.getGroup().getName();

    this.id = student.getId();
    this.firstName = student.getFirstName();
    this.lastName = student.getLastName();
    this.middleName = student.getMiddleName();
    this.group = student.getGroup();
    this.phoneNumber1 = student.getPhoneNumber1();
    this.phoneNumber2 = student.getPhoneNumber2();
    this.address = student.getAddress();
    this.about = student.getAbout();
  }

}
