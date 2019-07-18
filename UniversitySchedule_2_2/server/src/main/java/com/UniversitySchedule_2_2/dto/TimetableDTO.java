package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.LessonType;
import com.UniversitySchedule_2_2.entity.Subject;
import com.UniversitySchedule_2_2.entity.Teacher;
import com.UniversitySchedule_2_2.entity.Timetable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

//@JsonInclude(Include.NON_NULL)
@Data
public class TimetableDTO {

  private Long id;

  private Date lessonDate;

  private Audience audience;

  private Subject subject;

  private LessonType lessonType;

  private Integer numberOfLessonInDay;

  private Teacher teacher;

  private Group group;

  public TimetableDTO() {
  }

  public TimetableDTO(Timetable timetable) {

    //TODO Fix it
    /**
     * It's magic bug. If didn't wrote this local variables, these objects will be null
     * I will fix it in future !!!
     */
    String bug_audience = timetable.getAudience().getName();
    String bug_subject = timetable.getSubject().getName();
    String bug_lessonType = timetable.getLessonType().getName();
    String bug_teacher = timetable.getTeacher().getFirstName();
    String bug_group = timetable.getGroup().getName();

    this.id = timetable.getId();
    this.lessonDate = timetable.getLessonDate();
    this.audience = timetable.getAudience();
    this.subject = timetable.getSubject();
    this.lessonType = timetable.getLessonType();
    this.numberOfLessonInDay = timetable.getNumberOfLessonInDay();
    this.teacher = timetable.getTeacher();
    this.group = timetable.getGroup();
  }
}
