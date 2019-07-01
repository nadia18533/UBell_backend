package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.util.ResourceMappings.TIMETABLE;

import com.UniversitySchedule_2_2.dto.TimetableDTO;
import com.UniversitySchedule_2_2.entities.Timetable;
import com.UniversitySchedule_2_2.services.TimetableService;
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
@RequestMapping(TIMETABLE)
public class TimetableController {

    @Autowired
    private TimetableService timetableService;

    @GetMapping
    public List<TimetableDTO> getAllTimetables() {
        return timetableService.getAllTimetables();
    }

    @GetMapping("/{id}")
    public TimetableDTO getOneTimetable(@PathVariable Long id) {
        System.out.println("getting");
        return timetableService.getOneTimetable(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Timetable timetable, @PathVariable Long id){
        timetableService.update(id, timetable);
    }

    @PostMapping
    public void put(@RequestBody Timetable timetable){
        timetableService.save(timetable);
    }

//    @PostMapping
//    public ObjectDescription objectDescription(@RequestBody ObjectDescription objectDescription) {
//        return objectDescriptionService.save(objectDescription);
//    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
        timetableService.remove(id);
    }



}
