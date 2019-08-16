package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.InstituteDTO;
import com.UniversitySchedule_2_2.entity.Institute;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.InstituteRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituteService {

    @Autowired
    private InstituteRepository instituteRepository;

    public List<InstituteDTO> getAllInstituteNames() {
        return instituteRepository.findAll().stream().map(InstituteDTO::new).collect(Collectors.toList());
    }

    public InstituteDTO getOneInstitute(Long id) {
        return new InstituteDTO(instituteRepository.getOne(id));
    }

    public void remove(Long id){
      instituteRepository.deleteById(id);
    }

    public Institute update(Long id, Institute institute) {
        return instituteRepository.findById(id)
            .map(employee -> {
                employee.setId(institute.getId());
                employee.setName(institute.getName());
                return instituteRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public Institute save (Institute institute) {
        return instituteRepository.save(institute);
    }

}
