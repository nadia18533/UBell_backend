package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Timetable;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.Data;

@Data
public class TimetableTeacherDTO {

  private Long id;

  private Integer numberOfLessonInDay;

  private String subjectName;

  private String audience;

  private String teacherFName;

  private String teacherLName;

  private String teacherMName;

  private String lessonType;

  private String lessonTypeAbbreviated;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z", timezone = "GMT+02")
  private Date lessonDate;

  private String group;

  public TimetableTeacherDTO() {
  }

  public TimetableTeacherDTO(Timetable timetable) {
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
    timetable.getGroupList().forEach(item -> this.group += ", " + item.getName());

  }

}
