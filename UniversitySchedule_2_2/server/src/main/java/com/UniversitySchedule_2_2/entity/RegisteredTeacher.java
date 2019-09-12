package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.REGISTERED_TEACHER;

import com.UniversitySchedule_2_2.dto.RegisteredTeacherDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = REGISTERED_TEACHER)
public class RegisteredTeacher extends RegisteredTeacherDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "user_full_name", length = 30, nullable = false)
    private String userFullName;

    @Column(name = "department", length = 30, nullable = false)
    private String department;

    @Column(name = "institute", length = 30, nullable = false)
    private String institute;

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
