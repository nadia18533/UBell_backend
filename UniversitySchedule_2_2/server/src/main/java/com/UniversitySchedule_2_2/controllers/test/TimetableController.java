//package com.UniversitySchedule_2_2.controllers.test;
//
//import static com.UniversitySchedule_2_2.constants.ResourceMappings.TIMETABLE;
//
//import com.UniversitySchedule_2_2.dto.test.TimetableDTO;
//import com.UniversitySchedule_2_2.entity.test.Timetable;
//import com.UniversitySchedule_2_2.services.test.TimetableService;
//import java.util.List;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(TIMETABLE)
//public class TimetableController {
//
//    @Autowired
//    private TimetableService timetableService;
//
//    @GetMapping
//    public List<TimetableDTO> getAllTimetables() {
//        return timetableService.getAllTimetables();
//    }
//
//    @GetMapping("/{id}")
//    public TimetableDTO getOneTimetable(@PathVariable Long id) {
//        System.out.println("getting");
//        return timetableService.getOneTimetable(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@Valid @RequestBody Timetable timetable, @PathVariable Long id){
//        timetableService.update(id, timetable);
//    }
//
//    @PostMapping
//    public void put(@Valid @RequestBody Timetable timetable){
//        timetableService.save(timetable);
//    }
//
//    @DeleteMapping("/{id}")
//    public void remove(@PathVariable Long id){
//        timetableService.remove(id);
//    }
//
//
//
//}
