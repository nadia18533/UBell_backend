package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.GROUP;

import com.UniversitySchedule_2_2.dto.GroupDTO;
import com.UniversitySchedule_2_2.dto.GroupNamesDTO;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.Rank;
import com.UniversitySchedule_2_2.services.GroupService;
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
@RequestMapping(GROUP)
public class GroupController {

  @Autowired
  private GroupService groupService;

  @GetMapping("/allGroups")
  public List<GroupDTO> getAllGroups() {
    return groupService.getAllGroups();
  }

  @GetMapping("/allGroupNames")
  public List<GroupNamesDTO> getAllGroupNames() {
    return groupService.getAllGroupNames();
  }

  @GetMapping("/allDepartmentNames/{name}")
  public List<GroupNamesDTO> getAllDepartmentNames(@PathVariable String name) {
    return groupService.getAllByInstituteName(name);
  }

  @GetMapping("/{id}")
  public GroupDTO getOneGroup(@PathVariable Long id) {
    return groupService.getOneGroup(id);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Group group, @PathVariable Long id){
    groupService.update(id, group);
  }

  @PostMapping
  public void post(@RequestBody Group group) {
    groupService.save(group);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    groupService.remove(id);
  }

}

