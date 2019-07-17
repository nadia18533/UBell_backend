package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.LessonType;
import com.UniversitySchedule_2_2.entity.Subject;
import com.UniversitySchedule_2_2.entity.Teacher;
import com.UniversitySchedule_2_2.entity.Timetable;
import java.util.Date;
import lombok.Data;

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
