package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.INSTITUTE;

import com.UniversitySchedule_2_2.dto.InstituteDTO;
import com.UniversitySchedule_2_2.entity.Institute;
import com.UniversitySchedule_2_2.entity.Rank;
import com.UniversitySchedule_2_2.services.InstituteService;
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
@RequestMapping(INSTITUTE)
public class InstituteController {

  @Autowired
  private InstituteService instituteService;

  @GetMapping("/allInstitutes")
  public List<InstituteDTO> getAllInstitutes() {
    return instituteService.getAllInstitutes();
  }

  @GetMapping("/{id}")
  public InstituteDTO getOneInstitute(@PathVariable Long id) {
    return instituteService.getOneInstitute(id);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Institute institute, @PathVariable Long id){
    instituteService.update(id, institute);
  }

  @PostMapping
  public void post(@RequestBody Institute institute) {
    instituteService.save(institute);
  }


  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    instituteService.remove(id);
  }

}

