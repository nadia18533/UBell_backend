package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.TimetableDTO;
import com.UniversitySchedule_2_2.entity.Timetable;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.TimetableRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimetableService {

    @Autowired
    private TimetableRepository timetableRepository;

    public List<TimetableDTO> getAllTimetables() {
        return timetableRepository.findAll().stream().map(TimetableDTO::new).collect(Collectors.toList());
    }

    public TimetableDTO getOneTimetable(Long id) {
        return new TimetableDTO(timetableRepository.getOne(id));
    }

    public void remove(Long id){
      timetableRepository.deleteById(id);
    }

    public Timetable update(Long id, Timetable timetable) {
        return timetableRepository.findById(id)
            .map(employee -> {
                employee.setId(timetable.getId());
                employee.setLessonDate(timetable.getLessonDate());
                employee.setAudience(timetable.getAudience());
                employee.setSubject(timetable.getSubject());
                employee.setLessonType(timetable.getLessonType());
                employee.setNumberOfLessonInDay(timetable.getNumberOfLessonInDay());
                employee.setTeacher(timetable.getTeacher());
                employee.setGroup(timetable.getGroup());
                return timetableRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
//                  .orElseGet(() -> {
//                    objectDescription.setId(id);
//                return objectDescriptionRepository.save(objectDescription);
//            });
    }

    public Timetable save (Timetable timetable) {
        return timetableRepository.save(timetable);
    }
}
