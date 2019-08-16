package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.SpecialtyDTO;
import com.UniversitySchedule_2_2.entity.Specialty;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.SpecialtyRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public List<SpecialtyDTO> getAllSpecialties() {
        return specialtyRepository.findAll().stream().map(SpecialtyDTO::new).collect(Collectors.toList());
    }

    public SpecialtyDTO getOneSpecialty(Long id) {
        return new SpecialtyDTO(specialtyRepository.getOne(id));
    }

    public void remove(Long id){
      specialtyRepository.deleteById(id);
    }

    public Specialty update(Long id, Specialty specialty) {
        return specialtyRepository.findById(id)
            .map(employee -> {
                employee.setId(specialty.getId());
                employee.setName(specialty.getName());
                return specialtyRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public Specialty save (Specialty specialty) {
        return specialtyRepository.save(specialty);
    }
}
