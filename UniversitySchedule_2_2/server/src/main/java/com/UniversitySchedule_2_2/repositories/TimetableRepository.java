package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entity.Timetable;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Long>{

  List<Timetable> findByAudienceId(Long id);
  List<Timetable> findByAudienceName(String  name);
  List<Timetable> findByGroupListName(String  name);
  List<Timetable> findByTeacherFirstNameAndTeacherLastNameAndTeacherMiddleName(String  teacherFName, String  teacherLName, String  teacherMName);

  List<Timetable> findByLessonDateBetween(Date lessonDateStart, Date lessonDateEnd);
  List<Timetable> findByGroupListNameAndLessonDateBetween(String group, Date lessonDateStart, Date lessonDateEnd);
  List<Timetable> findByAudienceNameAndLessonDateBetween(String name, Date lessonDateStart, Date lessonDateEnd);
  List<Timetable> findByTeacherFirstNameAndTeacherLastNameAndTeacherMiddleNameAndLessonDateBetween(String  teacherFName, String  teacherLName, String  teacherMName, Date lessonDateStart, Date lessonDateEnd);
}
