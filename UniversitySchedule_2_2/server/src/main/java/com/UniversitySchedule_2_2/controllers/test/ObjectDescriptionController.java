//package com.UniversitySchedule_2_2.controllers.test;
//
//import static com.UniversitySchedule_2_2.constants.ResourceMappings.OBJECT_DESCRIPTION;
//
//import com.UniversitySchedule_2_2.dto.test.ObjectDescriptionDTO;
//import com.UniversitySchedule_2_2.entity.test.ObjectDescription;
//import com.UniversitySchedule_2_2.services.test.ObjectDescriptionService;
//import java.util.List;
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
//@RequestMapping(OBJECT_DESCRIPTION)
//public class ObjectDescriptionController {
//
//    @Autowired
//    private ObjectDescriptionService objectDescriptionService;
//
//    @GetMapping
//    public List<ObjectDescriptionDTO> getAllObjectDescriptions() {
//        return objectDescriptionService.getAllObjectDescriptions();
//    }
//
//    @GetMapping("/{id}")
//    public ObjectDescriptionDTO getOneObjectDescription(@PathVariable Long id) {
//        return objectDescriptionService.getOneObjectDescription(id);
//    }
//
//@PutMapping("/{id}")
//    public void update(@RequestBody ObjectDescription objectDescription, @PathVariable Long id){
//        objectDescriptionService.update(id, objectDescription);
//    }
//
//
//    @PostMapping
//  public void objectDescription(@RequestBody ObjectDescription objectDescription) {
//        objectDescriptionService.save(objectDescription);
//    }
//
//    @DeleteMapping("/{id}")
//    public void remove(@PathVariable Long id){
//        objectDescriptionService.remove(id);
//    }
//
//}
//
