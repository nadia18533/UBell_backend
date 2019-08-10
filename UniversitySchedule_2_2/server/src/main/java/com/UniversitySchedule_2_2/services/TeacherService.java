package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.TeacherDTO;
import com.UniversitySchedule_2_2.dto.TeacherNamesDTO;
import com.UniversitySchedule_2_2.repositories.TeacherRepository;
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

    public TeacherDTO getOneTeacher(Long id) {
        return new TeacherDTO(teacherRepository.getOne(id));
    }

    public void remove(Long id){
        teacherRepository.deleteById(id);
    }

}
