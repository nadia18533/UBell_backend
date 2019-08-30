package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.SUBJECT;

import com.UniversitySchedule_2_2.dto.SubjectDTO;
import com.UniversitySchedule_2_2.entity.Subject;
import com.UniversitySchedule_2_2.services.SubjectService;
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
@RequestMapping(SUBJECT)
public class SubjectController {

  @Autowired
  private SubjectService subjectService;

  @GetMapping("/allSubjects")
  public List<SubjectDTO> getAllSubjects() {
    return subjectService.getAllSubjects();
  }

  @GetMapping("/{id}")
  public SubjectDTO getOneSubject(@PathVariable Long id) {
    return subjectService.getOneSubject(id);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Subject subject, @PathVariable Long id) {
    subjectService.update(id, subject);
  }

  @PostMapping
  public void post(@RequestBody Subject subject) {
    subjectService.save(subject);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    subjectService.remove(id);
  }

}

