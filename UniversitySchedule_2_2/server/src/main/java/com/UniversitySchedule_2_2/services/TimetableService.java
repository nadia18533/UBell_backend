package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.QRCodeDTO;
import com.UniversitySchedule_2_2.dto.TimetableDTO;
import com.UniversitySchedule_2_2.dto.TimetableStudentDTO;
import com.UniversitySchedule_2_2.dto.TimetableTeacherDTO;
import com.UniversitySchedule_2_2.entity.Timetable;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.TimetableRepository;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimetableService {

  @Autowired
  private TimetableRepository timetableRepository;

  public List<QRCodeDTO> getTimetableByAudienceAndDateBetween(String name, Date lessonDateStart, Date lessonDateEnd) {
    return timetableRepository.findByAudienceNameAndLessonDateBetween(name, lessonDateStart, lessonDateEnd).stream().map(QRCodeDTO::new).collect(Collectors.toList());
  }

  public List<TimetableStudentDTO> getTimetableByGroupAndDateBetween(String group, Date lessonDateStart, Date lessonDateEnd) {
    return timetableRepository.findByGroupListNameAndLessonDateBetween(group, lessonDateStart, lessonDateEnd).stream().map(TimetableStudentDTO::new).collect(Collectors.toList());
  }

  public List<TimetableTeacherDTO> getTimetableByTeacherAndDateBetween(String teacherFName, String teacherLName, String teacherMName, Date lessonDateStart, Date lessonDateEnd) {
    return timetableRepository.findByTeacherFirstNameAndTeacherLastNameAndTeacherMiddleNameAndLessonDateBetween(teacherFName, teacherLName, teacherMName, lessonDateStart, lessonDateEnd).stream().map(TimetableTeacherDTO::new).collect(Collectors.toList());
  }

  public List<QRCodeDTO> getTimetableByLessonDateBetween(Date lessonDateStart, Date lessonDateEnd) {
    return timetableRepository.findByLessonDateBetween(lessonDateStart, lessonDateEnd).stream().map(QRCodeDTO::new).collect(Collectors.toList());
  }

  public List<TimetableDTO> getAllTimetables() {
    return timetableRepository.findAll().stream().map(TimetableDTO::new)
        .collect(Collectors.toList());
  }

  public List<TimetableDTO> getAllTimetablesByAudienceId(Long audienceId) {
    return timetableRepository.findByAudienceId(audienceId).stream().map(TimetableDTO::new)
        .collect(Collectors.toList());
  }

  public List<TimetableStudentDTO> getAllTimetablesByGroupName(String name) {
    return timetableRepository.findByGroupListName(name).stream().map(TimetableStudentDTO::new)
        .collect(Collectors.toList());
  }

  public List<TimetableTeacherDTO> getAllTimetablesByTeacher(String teacherFName, String teacherLName,
      String teacherMName) {
    return timetableRepository
        .findByTeacherFirstNameAndTeacherLastNameAndTeacherMiddleName(teacherFName, teacherLName,
            teacherMName).stream().map(TimetableTeacherDTO::new).collect(Collectors.toList());
  }

  public List<QRCodeDTO> getAllTimetablesByAudienceName(String name) {
    return timetableRepository.findByAudienceName(name).stream().map(QRCodeDTO::new)
        .collect(Collectors.toList());
  }

  public TimetableDTO getOneTimetable(Long id) {
    return new TimetableDTO(timetableRepository.getOne(id));
  }

  public void remove(Long id) {
    timetableRepository.deleteById(id);
  }

  public Timetable update(Long id, Timetable timetable) {
    return timetableRepository.findById(id)
        .map(employee -> {
          employee.setId(timetable.getId());
          employee.setLessonDate(timetable.getLessonDate());
          employee.setAudience(timetable.getAudience());
          employee.setSubject(timetable.getSubject());
          employee.setLessonType(timetable.getLessonType());
          employee.setNumberOfLessonInDay(timetable.getNumberOfLessonInDay());
          employee.setTeacher(timetable.getTeacher());
          employee.setGroupList(timetable.getGroupList());
          return timetableRepository.save(employee);
        })
        .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
  }

  public Timetable save(Timetable timetable) {
    return timetableRepository.save(timetable);
  }
}
