package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.REGISTERED_STUDENT;

import com.UniversitySchedule_2_2.dto.RegisteredStudentDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = REGISTERED_STUDENT)
public class RegisteredStudent extends RegisteredStudentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "user_f_name", length = 30, nullable = false)
    private String userFName;

    @Column(name = "user_l_name", length = 30, nullable = false)
    private String userLName;

    @Column(name = "institute", length = 30, nullable = false)
    private String institute;

    @Column(name = "course", length = 30, nullable = false)
    private String course;

    @Column(name = "group_name", length = 30, nullable = false)
    private String group;

    @Column(name = "os_version", length = 300)
    private String osVersion;

    @Column(name = "version_sdk", length = 300)
    private String versionSDK;

    @Column(name = "build_device", length = 300)
    private String buildDevice;

    @Column(name = "model_name", length = 300)
    private String model;

    @Column(name = "brand", length = 300)
    private String brand;

    @Column(name = "manufacturer", length = 300)
    private String manufacturer;

    @Column(name = "network_operator_name", length = 300)
    private String networkOperatorName;

    @Column(name = "sim_operator_name", length = 300)
    private String simOperatorName;

}
