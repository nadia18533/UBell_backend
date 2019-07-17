package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.AudienceDTO;
import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.AudienceRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudienceService {

    @Autowired
    private AudienceRepository audienceRepository;

    public List<AudienceDTO> getAllAudiences() {
        return audienceRepository.findAll().stream().map(AudienceDTO::new).collect(Collectors.toList());
    }

    public AudienceDTO getOneAudience(Long id) {
        return new AudienceDTO(audienceRepository.getOne(id));
    }

    public void remove(Long id){
      audienceRepository.deleteById(id);
    }

    public Audience update(Long id, Audience audience) {
        return audienceRepository.findById(id)
            .map(employee -> {
                employee.setId(audience.getId());
                employee.setName(audience.getName());
                employee.setDescription(audience.getDescription());
                return audienceRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
//                  .orElseGet(() -> {
//                    objectDescription.setId(id);
//                return objectDescriptionRepository.save(objectDescription);
//            });
    }

    public Audience save (Audience audience) {
        return audienceRepository.save(audience);
    }
}
