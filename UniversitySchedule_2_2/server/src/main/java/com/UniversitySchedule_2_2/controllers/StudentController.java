package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.STUDENT;

import com.UniversitySchedule_2_2.dto.RankDTO;
import com.UniversitySchedule_2_2.dto.StudentDTO;
import com.UniversitySchedule_2_2.entity.Rank;
import com.UniversitySchedule_2_2.entity.Student;
import com.UniversitySchedule_2_2.services.StudentService;
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
@RequestMapping(STUDENT)
public class StudentController {

    @Autowired
    private StudentService studentService;

  @GetMapping("/allStudents")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getOneStudent(@PathVariable Long id) {
        return studentService.getOneStudent(id);
    }

@PutMapping("/{id}")
    public void update(@RequestBody Student student, @PathVariable Long id){
  studentService.update(id, student);
    }

    @PostMapping
  public void post(@RequestBody Student student) {
      studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
      studentService.remove(id);
    }

}

