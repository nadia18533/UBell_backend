package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.TimetableDTO;
import com.UniversitySchedule_2_2.entities.Timetable;
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

    public void put(Timetable timetable){
        timetableRepository.save(timetable);
    }

    //TODO redo all method
//    public Artist update(Long id, Artist artist) {
//        return artistRepository.findById(id)
//            .map(employee -> {
//                artist.setId(id);
//                return artistRepository.save(artist);
//            })
//            .orElseGet(() -> {
//                artist.setId(id);
//                return artistRepository.save(artist);
//            });
//    }

}
