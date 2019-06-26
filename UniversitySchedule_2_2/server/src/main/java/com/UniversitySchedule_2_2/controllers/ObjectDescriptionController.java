package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.util.ResourceMappings.OBJECT_DESCRIPTION;

import com.UniversitySchedule_2_2.dto.ObjectDescriptionDTO;
import com.UniversitySchedule_2_2.entities.ObjectDescription;
import com.UniversitySchedule_2_2.services.ObjectDescriptionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(OBJECT_DESCRIPTION)
public class ObjectDescriptionController {

    @Autowired
    private ObjectDescriptionService objectDescriptionService;

    @GetMapping
    public List<ObjectDescriptionDTO> getAllObjectDescriptions() {
        return objectDescriptionService.getAllObjectDescriptions();
    }

    @GetMapping("/{id}")
    public ObjectDescriptionDTO getOneObjectDescription(@PathVariable Long id) {
        return objectDescriptionService.getOneObjectDescription(id);
    }

//    @PostMapping("/{id}")
//    public void update(@RequestBody Artist artist, @PathVariable Long id){
//        artistService.update(id, artist);
//    }

    @PostMapping("/{id}")
    public void put(@RequestBody ObjectDescription objectDescription){
        objectDescriptionService.put(objectDescription);
        System.out.println("try to put");
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
        objectDescriptionService.remove(id);
    }



}
