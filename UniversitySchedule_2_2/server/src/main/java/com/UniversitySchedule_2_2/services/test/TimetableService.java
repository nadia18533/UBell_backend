//package com.UniversitySchedule_2_2.services.test;
//
//import com.UniversitySchedule_2_2.dto.test.TimetableDTO;
//import com.UniversitySchedule_2_2.entity.test.Timetable;
//import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
//import com.UniversitySchedule_2_2.repositories.test.TimetableRepository;
//import java.util.List;
//import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TimetableService {
//
//    @Autowired
//    private TimetableRepository timetableRepository;
//
//    public List<TimetableDTO> getAllTimetables() {
//        return timetableRepository.findAll().stream().map(TimetableDTO::new).collect(Collectors.toList());
//    }
//
//    public TimetableDTO getOneTimetable(Long id) {
//        return new TimetableDTO(timetableRepository.getOne(id));
//    }
//
//    public void remove(Long id){
//        timetableRepository.deleteById(id);
//    }
//
//    public Timetable update(Long id, Timetable timetable) {
//        return timetableRepository.findById(id)
//            .map(employee -> {
//                employee.setId(timetable.getId());
//                employee.setTeacher(timetable.getTeacher());
//                employee.setSubject(timetable.getSubject());
//                employee.setTypeOfLesson(timetable.getSubject());
//                employee.setGroup(timetable.getGroup());
//                employee.setAudience(timetable.getAudience());
//                employee.setScheduleDate(timetable.getScheduleDate());
//                employee.setDescription(timetable.getDescription());
//                employee.setObjectDescription(timetable.getObjectDescription());
//                employee.setGroupEnt(timetable.getGroupEnt());
//                return timetableRepository.save(employee);
//            })
////            .orElseGet(() -> {
////                timetable.setId(id);
////                return timetableRepository.save(timetable);
////            });
//            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
//    }
//
//
//    public Timetable save (Timetable timetable) {
//        return timetableRepository.save(timetable);
//    }
//
//}
