package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.INSTITUTE;

import com.UniversitySchedule_2_2.dto.InstituteDTO;
import com.UniversitySchedule_2_2.services.InstituteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(INSTITUTE)
public class InstituteController {

  @Autowired
  private InstituteService instituteService;

  @GetMapping("/allInstituteNames")
  public List<InstituteDTO> getAllInstituteNames() {
    return instituteService.getAllInstituteNames();
  }

  @GetMapping("/{id}")
  public InstituteDTO getOneInstitute(@PathVariable Long id) {
    return instituteService.getOneInstitute(id);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    instituteService.remove(id);
  }

}

