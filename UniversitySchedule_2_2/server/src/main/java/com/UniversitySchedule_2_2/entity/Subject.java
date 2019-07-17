package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.SUBJECT;

import com.UniversitySchedule_2_2.dto.AudienceDTO;
import com.UniversitySchedule_2_2.dto.SubjectDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = SUBJECT)
public class Subject extends SubjectDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

//  @JsonBackReference
//  @OneToMany(cascade = CascadeType.ALL,
//      fetch = FetchType.LAZY,
//      mappedBy = "objectDescription")
//  private Set<Timetable> timetableSet = new HashSet<>();

}
