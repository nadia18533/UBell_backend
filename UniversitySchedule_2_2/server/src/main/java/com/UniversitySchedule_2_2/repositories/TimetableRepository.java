package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entity.Timetable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Long>{

  List<Timetable> findByAudienceId(Long id);
  List<Timetable> findByAudienceName(String  name);
  //TODO READY
  List<Timetable> findByGroupListName(String  name);
  List<Timetable> findByTeacherFirstNameAndTeacherLastNameAndTeacherMiddleName(String  teacherFName, String  teacherLName, String  teacherMName);

}
