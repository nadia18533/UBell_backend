//package com.UniversitySchedule_2_2.entity.test;
//
//import com.UniversitySchedule_2_2.dto.test.TimetableDTO;
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import lombok.Data;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//@Entity
//@Data
//@Table(name = "test_timetable")
////public class Timetable extends TimetableDTO {
//public class Timetable extends TimetableDTO implements Serializable {
//
//    @Id
////    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "teacher", length = 50, nullable = false)
//    private String teacher;
//
//    @Column(name = "subject", length = 50, nullable = false)
//    private String subject;
//
//    @Column(name = "type_of_lesson", length = 50, nullable = false)
//    private String typeOfLesson;
//
//    @Column(name = "group_name", length = 50, nullable = false)
//    private String group;
//
//    @Column(name = "audience", length = 50, nullable = false)
//    private String audience;
//
//    @Column(name = "schedule_date", nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date scheduleDate;
//
//    @Column(name = "description", length = 50, nullable = true)
//    private String description;
//
////    @JsonManagedReference
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "object_description_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
////    @JsonIgnore
////    @JsonBackReference
//    private ObjectDescription objectDescription;
//
//
////  @JsonManagedReference
//  @ManyToOne(fetch = FetchType.LAZY, optional = false)
//  @JoinColumn(name = "groupEnt_id", nullable = false)
//  @OnDelete(action = OnDeleteAction.CASCADE)
////    @JsonIgnore
////    @JsonBackReference
//  private GroupEnt groupEnt;
//
//}
