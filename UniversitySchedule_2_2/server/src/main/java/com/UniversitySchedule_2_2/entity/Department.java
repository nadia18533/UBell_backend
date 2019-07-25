package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.AUDIENCE;
import static com.UniversitySchedule_2_2.constants.DBConstants.DEPARTMENT;

import com.UniversitySchedule_2_2.dto.AudienceDTO;
import com.UniversitySchedule_2_2.dto.DepartmentDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = DEPARTMENT)
public class Department extends DepartmentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

//    @JsonBackReference
//    @OneToMany(cascade = CascadeType.ALL,
//        fetch = FetchType.LAZY,
//        mappedBy = "department")
//    private Set<Group> groupList = new HashSet<>();

}
