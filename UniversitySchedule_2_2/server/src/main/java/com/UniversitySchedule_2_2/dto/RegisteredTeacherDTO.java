package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.RegisteredTeacher;
import lombok.Data;

@Data
public class RegisteredTeacherDTO {

  private Long id;

  private String userFullName;

  private String department;

  private String institute;

  private String osVersion;

  private String versionSDK;

  private String buildDevice;

  private String model;

  private String brand;

  private String manufacturer;

  private String networkOperatorName;

  private String simOperatorName;

  public RegisteredTeacherDTO() {
  }

  public RegisteredTeacherDTO(RegisteredTeacher registeredTeacher) {
    this.id = registeredTeacher.getId();
    this.userFullName = registeredTeacher.getUserFullName();
    this.department = registeredTeacher.getDepartment();
    this.institute = registeredTeacher.getInstitute();
    this.osVersion = registeredTeacher.getOsVersion();
    this.versionSDK = registeredTeacher.getVersionSDK();
    this.buildDevice = registeredTeacher.getBuildDevice();
    this.model = registeredTeacher.getModel();
    this.brand = registeredTeacher.getBrand();
    this.manufacturer = registeredTeacher.getManufacturer();
    this.networkOperatorName = registeredTeacher.getNetworkOperatorName();
    this.simOperatorName = registeredTeacher.getSimOperatorName();
  }

}
