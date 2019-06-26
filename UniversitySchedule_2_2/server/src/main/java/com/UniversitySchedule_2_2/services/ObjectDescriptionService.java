package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.ObjectDescriptionDTO;
import com.UniversitySchedule_2_2.entities.ObjectDescription;
import com.UniversitySchedule_2_2.repositories.ObjectDescriptionRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjectDescriptionService {

    @Autowired
    private ObjectDescriptionRepository objectDescriptionRepository;

    public List<ObjectDescriptionDTO> getAllObjectDescriptions() {
        return objectDescriptionRepository.findAll().stream().map(ObjectDescriptionDTO::new).collect(Collectors.toList());
    }

    public ObjectDescriptionDTO getOneObjectDescription(Long id) {
        return new ObjectDescriptionDTO(objectDescriptionRepository.getOne(id));
    }

    public void remove(Long id){
        objectDescriptionRepository.deleteById(id);
    }

    public void put(ObjectDescription objectDescription){
        objectDescriptionRepository.save(objectDescription);
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
