package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.LESSON_TYPE;
import static com.UniversitySchedule_2_2.constants.ResourceMappings.RANK;

import com.UniversitySchedule_2_2.dto.LessonTypeDTO;
import com.UniversitySchedule_2_2.entity.LessonType;
import com.UniversitySchedule_2_2.services.LessonTypeService;
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
@RequestMapping(LESSON_TYPE)
public class LessonTypeController {

    @Autowired
    private LessonTypeService lessonTypeService;

  @GetMapping("/allLessonTypes")
    public List<LessonTypeDTO> getAllLessonTypes() {
        return lessonTypeService.getAllLessonTypes();
    }

    @GetMapping("/{id}")
    public LessonTypeDTO getOneLessonType(@PathVariable Long id) {
        return lessonTypeService.getOneLessonType(id);
    }

@PutMapping("/{id}")
    public void update(@RequestBody LessonType lessonType, @PathVariable Long id){
  lessonTypeService.update(id, lessonType);
    }

    @PostMapping
  public void post(@RequestBody LessonType lessonType) {
      lessonTypeService.save(lessonType);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
      lessonTypeService.remove(id);
    }

}

