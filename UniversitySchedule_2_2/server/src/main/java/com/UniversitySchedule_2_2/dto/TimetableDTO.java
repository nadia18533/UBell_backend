package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.LessonType;
import com.UniversitySchedule_2_2.entity.Subject;
import com.UniversitySchedule_2_2.entity.Teacher;
import com.UniversitySchedule_2_2.entity.Timetable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
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
//    String bug_audience = timetable.getAudience().getName();
//    String bug_subject = timetable.getSubject().getName();
//    String bug_lessonType = timetable.getLessonType().getName();
//    String bug_teacher = timetable.getTeacher().getFirstName();
//    String bug_group = timetable.getGroupList().get(0).getName();

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

//    this.groupList = timetable.getGroupList().get(1).getName();
//    this.nameOfGroups = Collections.singletonList(new Gson().toJson(timetable.getGroupList().stream()
//        .map(GroupDTO::new)
//        .collect(Collectors.toList())));
//    this.nameOfGroups.add(timetable.getGroup().toString());

//    this.nameOfGroups = new ArrayList<>(timetable.getGroupList().size());
//    for (Group object : timetable.getGroupList()) {
//      this.nameOfGroups.add(timetable.getGroupList().toString());

//        List<String> strings = new ArrayList<>(list.size());
//    for (Object object : list) {
//      strings.add(Objects.toString(object, null));



//    this.nameOfGroups = timetable.getGroupList().toString();
//    this.nameOfGroups = timetable.getGroupList().stream()
//        .map( Group::toString )
//        .collect( Collectors.toList() );



  }

}
