package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.REGISTERED_TEACHER;

import com.UniversitySchedule_2_2.dto.RegisteredTeacherDTO;
import com.UniversitySchedule_2_2.entity.RegisteredTeacher;
import com.UniversitySchedule_2_2.services.RegisteredTeacherService;
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
@RequestMapping(REGISTERED_TEACHER)
public class RegisteredTeacherController {

  @Autowired
  private RegisteredTeacherService registeredTeacherService;

  @GetMapping("/all")
  public List<RegisteredTeacherDTO> getAllRegisteredTeachers() {
    return registeredTeacherService.getAllRegisteredTeachers();
  }

  @GetMapping("/{id}")
  public RegisteredTeacherDTO getOneRegisteredTeacher(@PathVariable Long id) {
    return registeredTeacherService.getOneRegisteredTeacher(id);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody RegisteredTeacher registeredTeacher, @PathVariable Long id) {
    registeredTeacherService.update(id, registeredTeacher);
  }

  @PostMapping
  public void post(@RequestBody RegisteredTeacher registeredTeacher) {
    registeredTeacherService.save(registeredTeacher);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    registeredTeacherService.remove(id);
  }

}

