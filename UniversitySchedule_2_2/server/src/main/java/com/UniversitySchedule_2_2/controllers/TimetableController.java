package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.AUDIENCE_NAME;
import static com.UniversitySchedule_2_2.constants.ResourceMappings.STUDENT_GROUP;
import static com.UniversitySchedule_2_2.constants.ResourceMappings.TEACHER_NAME;
import static com.UniversitySchedule_2_2.constants.ResourceMappings.TIMETABLE;

import com.UniversitySchedule_2_2.dto.QRCodeDTO;
import com.UniversitySchedule_2_2.dto.TimetableDTO;
import com.UniversitySchedule_2_2.dto.TimetableStudentDTO;
import com.UniversitySchedule_2_2.dto.TimetableTeacherDTO;
import com.UniversitySchedule_2_2.entity.Timetable;
import com.UniversitySchedule_2_2.services.TimetableService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TIMETABLE)
public class TimetableController {

  @Autowired
  private TimetableService timetableService;

  @GetMapping
  public List<TimetableDTO> getAllTimetables() {
    return timetableService.getAllTimetables();
  }


  @GetMapping(TEACHER_NAME + "/{teacherFName}/{teacherLName}/{teacherMName}/{lessonDateStart}/{lessonDateEnd}")
  public List<TimetableTeacherDTO> getTimetableByTeacherAndDateBetween(
      @PathVariable String teacherFName,
      @PathVariable String teacherLName,
      @PathVariable String teacherMName,
      @PathVariable
      @DateTimeFormat(pattern = "yyyy.MM.dd-HH:mm") Date lessonDateStart,
      @PathVariable
      @DateTimeFormat(pattern = "yyyy.MM.dd-HH:mm") Date lessonDateEnd) {
    return timetableService.getTimetableByTeacherAndDateBetween(teacherFName, teacherLName, teacherMName, lessonDateStart, lessonDateEnd);
  }

  @GetMapping(STUDENT_GROUP + "/{group}/{lessonDateStart}/{lessonDateEnd}")
  public List<TimetableStudentDTO> getTimetableByGroupAndDateBetween(
      @PathVariable String group,
      @PathVariable
      @DateTimeFormat(pattern = "yyyy.MM.dd-HH:mm") Date lessonDateStart,
      @PathVariable
      @DateTimeFormat(pattern = "yyyy.MM.dd-HH:mm") Date lessonDateEnd) {
    return timetableService.getTimetableByGroupAndDateBetween(group, lessonDateStart, lessonDateEnd);
  }

  @GetMapping(AUDIENCE_NAME + "/{name}/{lessonDateStart}/{lessonDateEnd}")
  public List<QRCodeDTO> getTimetableByAudienceAndDateBetween(
      @PathVariable String name,
      @PathVariable
      @DateTimeFormat(pattern = "yyyy.MM.dd-HH:mm") Date lessonDateStart,
      @PathVariable
      @DateTimeFormat(pattern = "yyyy.MM.dd-HH:mm") Date lessonDateEnd) {
    return timetableService.getTimetableByAudienceAndDateBetween(name, lessonDateStart, lessonDateEnd);
  }

  @GetMapping("/dateBetween/{lessonDateStart}/{lessonDateEnd}")
  public List<QRCodeDTO> getTeacherByLessonDateBetween(
      @PathVariable
  @DateTimeFormat(pattern = "yyyy.MM.dd-HH:mm") Date lessonDateStart,
      @PathVariable
  @DateTimeFormat(pattern = "yyyy.MM.dd-HH:mm") Date lessonDateEnd) {
    return timetableService.getTimetableByLessonDateBetween(lessonDateStart, lessonDateEnd);
  }

  @GetMapping("/{id}")
  public TimetableDTO getOneTimetable(@PathVariable Long id) {
    return timetableService.getOneTimetable(id);
  }

  @GetMapping("/audienceId/{id}")
  public List<TimetableDTO> getAllTimetablesByAudienceId(@PathVariable Long id) {
    return timetableService.getAllTimetablesByAudienceId(id);
  }

  @GetMapping(TEACHER_NAME + "/{teacherFName}/{teacherLName}/{teacherMName}")
  public List<TimetableTeacherDTO> getAllTimetablesByTeacher(@PathVariable String teacherFName,
      @PathVariable String teacherLName, @PathVariable String teacherMName) {
    return timetableService.getAllTimetablesByTeacher(teacherFName, teacherLName,
        teacherMName);
  }

  @GetMapping(STUDENT_GROUP + "/{group}")
  public List<TimetableStudentDTO> getAllTimetablesByGroupName(@PathVariable String group) {
    return timetableService.getAllTimetablesByGroupName(group);
  }

  @GetMapping(AUDIENCE_NAME + "/{name}")
  public List<QRCodeDTO> getAllTimetablesByAudienceName(@PathVariable String name) {
    return timetableService.getAllTimetablesByAudienceName(name);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Timetable timetable, @PathVariable Long id) {
    timetableService.update(id, timetable);
  }


  @PostMapping
  public void post(@RequestBody Timetable timetable) {
    timetableService.save(timetable);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    timetableService.remove(id);
  }

}

