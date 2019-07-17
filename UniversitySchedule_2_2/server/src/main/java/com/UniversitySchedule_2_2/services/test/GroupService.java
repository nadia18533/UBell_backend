//package com.UniversitySchedule_2_2.services.test;
//
//import com.UniversitySchedule_2_2.dto.test.GroupDTO;
//import com.UniversitySchedule_2_2.entity.test.GroupEnt;
//import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
//import com.UniversitySchedule_2_2.repositories.test.GroupRepository;
//import java.util.List;
//import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class GroupService {
//
//    @Autowired
//    private GroupRepository groupRepository;
//
//    public List<GroupDTO> getAllGroups() {
//        return groupRepository.findAll().stream().map(GroupDTO::new).collect(Collectors.toList());
//    }
//
//    public GroupDTO getOneGroup(Long id) {
//        return new GroupDTO(groupRepository.getOne(id));
//    }
//
//    public void remove(Long id){
//        groupRepository.deleteById(id);
//    }
//
//    public GroupEnt update(Long id, GroupEnt groupEnt) {
//        return groupRepository.findById(id)
//            .map(employee -> {
//                employee.setId(groupEnt.getId());
//                employee.setName(groupEnt.getName());
//            //TODO...
//                return groupRepository.save(employee);
//            })
//                .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
//            }
//
//    public GroupEnt save (GroupEnt groupEnt) {
//        return groupRepository.save(groupEnt);
//    }
//}
