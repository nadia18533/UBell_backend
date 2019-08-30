package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.AUDIENCE;

import com.UniversitySchedule_2_2.dto.AudienceDTO;
import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.services.AudienceService;
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
@RequestMapping(AUDIENCE)
public class AudienceController {

    @Autowired
    private AudienceService audienceService;

  @GetMapping("/allAudiences")
    public List<AudienceDTO> getAllAudiences() {
        return audienceService.getAllAudiences();
    }

    @GetMapping("/{id}")
    public AudienceDTO getOneAudience(@PathVariable Long id) {
        return audienceService.getOneAudience(id);
    }

@PutMapping("/{id}")
    public void update(@RequestBody Audience audience, @PathVariable Long id){
  audienceService.update(id, audience);
    }


    @PostMapping
  public void post(@RequestBody Audience audience) {
      audienceService.save(audience);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
      audienceService.remove(id);
    }

}

