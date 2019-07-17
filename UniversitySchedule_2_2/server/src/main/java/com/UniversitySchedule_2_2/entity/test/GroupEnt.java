//package com.UniversitySchedule_2_2.entity.test;
//
//import com.UniversitySchedule_2_2.dto.test.GroupDTO;
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import java.util.HashSet;
//import java.util.Set;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import lombok.Data;
//
//@Entity
//@Data
//@Table(name = "test_group_table")
//public class GroupEnt extends GroupDTO {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name", length = 30, nullable = false)
//    private String name;
//
////  @JsonBackReference
////  @OneToMany(cascade = CascadeType.ALL,
////      fetch = FetchType.LAZY,
////      mappedBy = "groupEnt")
////  private Set<Timetable> timetableSet = new HashSet<>();
//
//}
