//package com.UniversitySchedule_2_2.entity.test;
//
//import com.UniversitySchedule_2_2.dto.test.ObjectDescriptionDTO;
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
//@Table(name = "test_object_description")
//public class ObjectDescription extends ObjectDescriptionDTO {
//
//    @Id
////    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name", length = 30, nullable = false)
//    private String name;
//
//    @Column(name = "name_qr", length = 255, nullable = false)
//    private String nameQr;
//
//    @Column(name ="description", length = 3000, nullable = false)
//    private String description;
//
//
////  @JsonBackReference
////  @OneToMany(cascade = CascadeType.ALL,
////      fetch = FetchType.LAZY,
////      mappedBy = "objectDescription")
////  private Set<Timetable> timetableSet = new HashSet<>();
//
//}
