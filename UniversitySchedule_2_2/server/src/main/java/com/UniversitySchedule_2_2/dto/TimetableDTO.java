package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.LessonType;
import com.UniversitySchedule_2_2.entity.Subject;
import com.UniversitySchedule_2_2.entity.Teacher;
import com.UniversitySchedule_2_2.entity.Timetable;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;

@Data
public class TimetableDTO {

  private Long id;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+02")
  private Date lessonDate;

  private Audience audience;

  private Subject subject;

  private LessonType lessonType;

  private Integer numberOfLessonInDay;

  private Teacher teacher;

private List<Group> groupList;

  public TimetableDTO() {
  }

  public TimetableDTO(Timetable timetable) {

    //TODO Fix it
    /**
     * It's magic bug. If didn't wrote this local variables, these objects will be null
     * I will fix it in future !!!
     * In debug regime all works good
     */
    String bug_audience = timetable.getAudience().toString();
    String bug_subject = timetable.getSubject().toString();
    String bug_lessonType = timetable.getLessonType().toString();
    String bug_teacher = timetable.getTeacher().toString();
    String bug_group = timetable.getGroupList().toString();

    this.id = timetable.getId();
    this.lessonDate = timetable.getLessonDate();
    this.audience = timetable.getAudience();
    this.subject = timetable.getSubject();
    this.lessonType = timetable.getLessonType();
    this.numberOfLessonInDay = timetable.getNumberOfLessonInDay();
    this.teacher = timetable.getTeacher();
    this.groupList = timetable.getGroupList();

  }

}
