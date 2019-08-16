package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.LessonTypeDTO;
import com.UniversitySchedule_2_2.entity.LessonType;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.LessonTypeRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonTypeService {

    @Autowired
    private LessonTypeRepository lessonTypeRepository;

    public List<LessonTypeDTO> getAllLessonTypes() {
        return lessonTypeRepository.findAll().stream().map(LessonTypeDTO::new).collect(Collectors.toList());
    }

    public LessonTypeDTO getOneLessonType(Long id) {
        return new LessonTypeDTO(lessonTypeRepository.getOne(id));
    }

    public void remove(Long id){
      lessonTypeRepository.deleteById(id);
    }

    public LessonType update(Long id, LessonType lessonType) {
        return lessonTypeRepository.findById(id)
            .map(employee -> {
                employee.setId(lessonType.getId());
                employee.setName(lessonType.getName());
                employee.setAbbreviated(lessonType.getAbbreviated());
                return lessonTypeRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public LessonType save (LessonType lessonType) {
        return lessonTypeRepository.save(lessonType);
    }
}
