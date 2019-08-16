package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.TEACHER;

import com.UniversitySchedule_2_2.dto.TeacherDTO;
import com.UniversitySchedule_2_2.dto.TeacherNamesDTO;
import com.UniversitySchedule_2_2.entity.Rank;
import com.UniversitySchedule_2_2.entity.Teacher;
import com.UniversitySchedule_2_2.services.TeacherService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TEACHER)
public class TeacherController {

  @Autowired
  private TeacherService teacherService;

  @GetMapping("/allTeacherNames/{department}")
  public List<TeacherNamesDTO> getTeacherByDepartmentName(@PathVariable String department) {
    return teacherService.getTeacherByDepartmentName(department);
  }

  @GetMapping("/allTeacherNames")
  public List<TeacherNamesDTO> getAllTeacherNames() {
    return teacherService.getAllTeacherNames();
  }

  @GetMapping("/allTeachers")
  public List<TeacherDTO> getAllTeachers() {
    return teacherService.getAllTeachers();
  }

  @GetMapping("/{id}")
  public TeacherDTO getOneTeacher(@PathVariable Long id) {
    return teacherService.getOneTeacher(id);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Teacher teacher, @PathVariable Long id) {
    teacherService.update(id, teacher);
  }

  @PostMapping
  public void post(@RequestBody Teacher teacher) {
    teacherService.save(teacher);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    teacherService.remove(id);
  }

}

