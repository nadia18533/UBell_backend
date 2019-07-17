//package com.UniversitySchedule_2_2.dto.test;
//
//import com.UniversitySchedule_2_2.entity.test.GroupEnt;
//import com.UniversitySchedule_2_2.entity.test.ObjectDescription;
//import com.UniversitySchedule_2_2.entity.test.Timetable;
//import java.util.Date;
//import lombok.Data;
//
//@Data
//public class TimetableDTO {
//
//    private Long id;
//
//    private String teacher;
//
//    private String subject;
//
//    private String typeOfLesson;
//
//    private String group;
//
//    private String audience;
//
//    private Date scheduleDate;
//
//    private String description;
//
//    private ObjectDescription objectDescription;
//
//  private GroupEnt groupEnt;
//
//    public TimetableDTO() {}
//
//    public TimetableDTO(Timetable timetable) {
//        this.id = timetable.getId();
//        this.teacher = timetable.getTeacher();
//        this.subject = timetable.getSubject();
//        this.typeOfLesson = timetable.getTypeOfLesson();
//        this.group = timetable.getGroup();
//        this.audience = timetable.getAudience();
//        this.scheduleDate = timetable.getScheduleDate();
//        this.description = timetable.getDescription();
//
//        //TODO Fix it
//       String descriptionFromObject = timetable.getObjectDescription().getNameQr();
//       String groupEnt = timetable.getGroupEnt().getName();
//        this.objectDescription = timetable.getObjectDescription();
//        this.groupEnt = timetable.getGroupEnt();
//    }
//}
