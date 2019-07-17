//package com.UniversitySchedule_2_2.controllers.test;
//
//import static com.UniversitySchedule_2_2.constants.ResourceMappings.GROUP;
//
//import com.UniversitySchedule_2_2.dto.test.GroupDTO;
//import com.UniversitySchedule_2_2.entity.test.GroupEnt;
//import com.UniversitySchedule_2_2.services.test.GroupService;
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
//@RequestMapping(GROUP)
//public class GroupController {
//
//    @Autowired
//    private GroupService groupService;
//
//    @GetMapping
//    public List<GroupDTO> getAllGroups() {
//        return groupService.getAllGroups();
//    }
//
//    @GetMapping("/{id}")
//    public GroupDTO getOneGroup(@PathVariable Long id) {
//        return groupService.getOneGroup(id);
//    }
//
//@PutMapping("/{id}")
//    public void update(@RequestBody GroupEnt groupEnt, @PathVariable Long id){
//  groupService.update(id, groupEnt);
//    }
//
//
//    @PostMapping
//  public void put(@RequestBody GroupEnt groupEnt) {
//      groupService.save(groupEnt);
//    }
//
//    @DeleteMapping("/{id}")
//    public void remove(@PathVariable Long id){
//      groupService.remove(id);
//    }
//
//}
//
