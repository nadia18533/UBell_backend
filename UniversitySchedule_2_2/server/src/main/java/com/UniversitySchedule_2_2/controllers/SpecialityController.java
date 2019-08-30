package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.SPECIALTY;

import com.UniversitySchedule_2_2.dto.SpecialtyDTO;
import com.UniversitySchedule_2_2.entity.Specialty;
import com.UniversitySchedule_2_2.services.SpecialtyService;
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
@RequestMapping(SPECIALTY)
public class SpecialityController {

    @Autowired
    private SpecialtyService specialtyService;

  @GetMapping("/allSpecialties")
    public List<SpecialtyDTO> getAllSpecialties() {
        return specialtyService.getAllSpecialties();
    }

    @GetMapping("/{id}")
    public SpecialtyDTO getOneSpecialty(@PathVariable Long id) {
        return specialtyService.getOneSpecialty(id);
    }

@PutMapping("/{id}")
    public void update(@RequestBody Specialty specialty, @PathVariable Long id){
  specialtyService.update(id, specialty);
    }

    @PostMapping
  public void post(@RequestBody Specialty specialty) {
      specialtyService.save(specialty);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
      specialtyService.remove(id);
    }

}

