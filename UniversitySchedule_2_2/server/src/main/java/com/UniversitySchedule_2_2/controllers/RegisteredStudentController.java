package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.REGISTERED_STUDENT;

import com.UniversitySchedule_2_2.dto.RegisteredStudentDTO;
import com.UniversitySchedule_2_2.entity.RegisteredStudent;
import com.UniversitySchedule_2_2.services.RegisteredStudentService;
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
@RequestMapping(REGISTERED_STUDENT)
public class RegisteredStudentController {

  @Autowired
  private RegisteredStudentService registeredStudentService;

  @GetMapping("/all")
  public List<RegisteredStudentDTO> getAllRegisteredStudents() {
    return registeredStudentService.getAllRegisteredStudents();
  }

  @GetMapping("/{id}")
  public RegisteredStudentDTO getOneRegisteredStudent(@PathVariable Long id) {
    return registeredStudentService.getOneRegisteredStudent(id);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody RegisteredStudent registeredStudent, @PathVariable Long id) {
    registeredStudentService.update(id, registeredStudent);
  }

  @PostMapping
  public void post(@RequestBody RegisteredStudent registeredStudent) {
    registeredStudentService.save(registeredStudent);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    registeredStudentService.remove(id);
  }

}

