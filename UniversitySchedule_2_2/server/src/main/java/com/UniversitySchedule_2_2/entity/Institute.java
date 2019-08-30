package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.INSTITUTE;

import com.UniversitySchedule_2_2.dto.InstituteDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@Table(name = INSTITUTE)
public class Institute extends InstituteDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

}
