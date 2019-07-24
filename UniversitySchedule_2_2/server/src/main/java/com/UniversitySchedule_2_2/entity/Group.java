package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.GROUP;

import com.UniversitySchedule_2_2.dto.GroupDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
@Table(name = GROUP)
public class Group extends GroupDTO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", length = 30, nullable = false)
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "institute_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private Institute institute;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "specialty_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private Specialty specialty;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "curator_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private Teacher curator;

  // !

//  @ManyToOne(fetch = FetchType.LAZY, optional = true)
//  @JoinColumn(name = "captain_id", nullable = true)
//  @OnDelete(action = OnDeleteAction.CASCADE)
//  private Student captain;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "department_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private Department department;

  @Column(name = "course", nullable = false)
  private Integer course;

//  //    @ManyToMany(mappedBy = "groupList")
////    @ManyToMany(mappedBy = "groupList",fetch = FetchType.EAGER)
//  @JsonBackReference
//  @OneToMany(cascade = CascadeType.ALL,
//      fetch = FetchType.LAZY,
//      mappedBy = "group")
//  private List<Timetable> timetables = new ArrayList<>();

//  @ManyToMany(mappedBy = "groupList")
//  private List<Timetable> timetables = new ArrayList<>();

}

