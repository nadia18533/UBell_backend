package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.SubjectDTO;
import com.UniversitySchedule_2_2.entity.Subject;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.SubjectRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<SubjectDTO> getAllSubjects() {
        return subjectRepository.findAll().stream().map(SubjectDTO::new).collect(Collectors.toList());
    }

    public SubjectDTO getOneSubject(Long id) {
        return new SubjectDTO(subjectRepository.getOne(id));
    }

    public void remove(Long id){
      subjectRepository.deleteById(id);
    }

    public Subject update(Long id, Subject subject) {
        return subjectRepository.findById(id)
            .map(employee -> {
                employee.setId(subject.getId());
                employee.setName(subject.getName());
                return subjectRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public Subject save (Subject subject) {
        return subjectRepository.save(subject);
    }
}
