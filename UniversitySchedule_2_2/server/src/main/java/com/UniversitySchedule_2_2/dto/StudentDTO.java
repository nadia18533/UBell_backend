package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Teacher;
import lombok.Data;

@Data
public class StudentDTO {

  private Long id;

  private String firstName;

  private String lastName;

  private String middleName;

//    private Group group;

  private String phoneNumber1;

  private String phoneNumber2;

  private String address;

  private String about;

  public StudentDTO() {
  }

  public StudentDTO(Teacher teacher) {
    this.id = teacher.getId();
    this.firstName = teacher.getFirstName();
    this.lastName = teacher.getLastName();
    this.middleName = teacher.getMiddleName();
    this.phoneNumber1 = teacher.getPhoneNumber1();
    this.phoneNumber2 = teacher.getPhoneNumber2();
    this.address = teacher.getAddress();
    this.about = teacher.getAbout();
    }

}
