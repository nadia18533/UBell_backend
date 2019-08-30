package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.StudentDTO;
import com.UniversitySchedule_2_2.entity.Student;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.StudentRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream().map(StudentDTO::new).collect(Collectors.toList());
    }

    public StudentDTO getOneStudent(Long id) {
        return new StudentDTO(studentRepository.getOne(id));
    }

    public void remove(Long id){
      studentRepository.deleteById(id);
    }

    public Student update(Long id, Student student) {
        return studentRepository.findById(id)
            .map(employee -> {
                employee.setId(student.getId());
                employee.setFirstName(student.getFirstName());
                employee.setLastName(student.getLastName());
                employee.setMiddleName(student.getMiddleName());
                employee.setGroup(student.getGroup());
                employee.setPhoneNumber1(student.getPhoneNumber1());
                employee.setPhoneNumber2(student.getPhoneNumber2());
                employee.setAddress(student.getAddress());
                employee.setAbout(student.getAbout());
                return studentRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public Student save (Student student) {
        return studentRepository.save(student);
    }
}
