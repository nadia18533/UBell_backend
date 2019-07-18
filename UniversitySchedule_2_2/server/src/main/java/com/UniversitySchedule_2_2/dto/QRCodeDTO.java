package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Timetable;
import java.util.Date;
import lombok.Data;

@Data
public class QRCodeDTO {

  private Long id;

  private Integer numberOfLessonInDay;

  private String subjectName;

  private String audience;

  private String teacherFName;

  private String teacherLName;

  private String teacherMName;

  private String lessonType;

  private String lessonTypeAbbreviated;

  private Date lessonDate;

  public QRCodeDTO() {
  }

  public QRCodeDTO(Timetable timetable) {
    this.id = timetable.getId();
    this.numberOfLessonInDay = timetable.getNumberOfLessonInDay();
    this.subjectName = timetable.getSubject().getName();
    this.audience = timetable.getAudience().getName();
    this.teacherFName = timetable.getTeacher().getFirstName();
    this.teacherLName = timetable.getTeacher().getLastName();
    this.teacherMName = timetable.getTeacher().getMiddleName();
    this.lessonType = timetable.getLessonType().getName();
    this.lessonTypeAbbreviated = timetable.getLessonType().getAbbreviated();
    this.lessonDate = timetable.getLessonDate();
  }
}
