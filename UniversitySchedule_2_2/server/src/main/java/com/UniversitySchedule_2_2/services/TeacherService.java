package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.TeacherDTO;
import com.UniversitySchedule_2_2.dto.TeacherNamesDTO;
import com.UniversitySchedule_2_2.entity.Rank;
import com.UniversitySchedule_2_2.entity.Teacher;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.TeacherRepository;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<TeacherNamesDTO> getTeacherByDepartmentName(String department) {
        return teacherRepository.findByDepartmentName(department).stream().map(TeacherNamesDTO::new).collect(Collectors.toList());
    }

    public List<TeacherNamesDTO> getAllTeacherNames() {
        return teacherRepository.findAll().stream().map(TeacherNamesDTO::new).collect(Collectors.toList());
    }

  public List<TeacherDTO> getAllTeachers() {
    return teacherRepository.findAll().stream().map(TeacherDTO::new).collect(Collectors.toList());
  }

    public TeacherDTO getOneTeacher(Long id) {
        return new TeacherDTO(teacherRepository.getOne(id));
    }

    public void remove(Long id){
        teacherRepository.deleteById(id);
    }

    public Teacher update(Long id, Teacher teacher) {
        return teacherRepository.findById(id)
            .map(employee -> {
                employee.setId(teacher.getId());
                employee.setFirstName(teacher.getFirstName());
                employee.setLastName(teacher.getLastName());
                employee.setMiddleName(teacher.getMiddleName());
                employee.setDepartment(teacher.getDepartment());
                employee.setRank(teacher.getRank());
                employee.setPhoneNumber1(teacher.getPhoneNumber1());
                employee.setPhoneNumber2(teacher.getPhoneNumber2());
                employee.setAddress(teacher.getAddress());
                employee.setAbout(teacher.getAbout());
                return teacherRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public Teacher save (Teacher teacher) {
        return teacherRepository.save(teacher);
    }

}
