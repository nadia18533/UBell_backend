package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.RegisteredStudent;
import java.util.Date;
import lombok.Data;

@Data
public class RegisteredStudentDTO {

  private Long id;

  private String userFName;

  private String userLName;

  private String institute;

  private String course;

  private String group;

  private Date registrationDate;

  private String applicationVersion;

  private String osVersion;

  private String versionSDK;

  private String buildDevice;

  private String model;

  private String brand;

  private String manufacturer;

  private String networkOperatorName;

  private String simOperatorName;

  public RegisteredStudentDTO() {
  }

  public RegisteredStudentDTO(RegisteredStudent registeredStudent) {
    this.id = registeredStudent.getId();
    this.userFName = registeredStudent.getUserFName();
    this.userLName = registeredStudent.getUserLName();
    this.institute = registeredStudent.getInstitute();
    this.course = registeredStudent.getCourse();
    this.group = registeredStudent.getGroup();
    this.registrationDate = registeredStudent.getRegistrationDate();
    this.applicationVersion = registeredStudent.getApplicationVersion();
    this.osVersion = registeredStudent.getOsVersion();
    this.versionSDK = registeredStudent.getVersionSDK();
    this.buildDevice = registeredStudent.getBuildDevice();
    this.model = registeredStudent.getModel();
    this.brand = registeredStudent.getBrand();
    this.manufacturer = registeredStudent.getManufacturer();
    this.networkOperatorName = registeredStudent.getNetworkOperatorName();
    this.simOperatorName = registeredStudent.getSimOperatorName();
  }

}
