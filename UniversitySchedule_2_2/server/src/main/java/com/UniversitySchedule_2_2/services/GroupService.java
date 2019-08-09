package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.AudienceDTO;
import com.UniversitySchedule_2_2.dto.GroupDTO;
import com.UniversitySchedule_2_2.dto.GroupNamesDTO;
import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.AudienceRepository;
import com.UniversitySchedule_2_2.repositories.GroupRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<GroupNamesDTO> getAllGroupNames() {
        return groupRepository.findAll().stream().map(GroupNamesDTO::new).collect(Collectors.toList());
    }

    public List<GroupNamesDTO> getAllByInstituteName(String name) {
        return groupRepository.findByInstituteName(name).stream().map(GroupNamesDTO::new).collect(Collectors.toList());
    }

    public GroupDTO getOneGroup(Long id) {
        return new GroupDTO(groupRepository.getOne(id));
    }

    public void remove(Long id){
      groupRepository.deleteById(id);
    }



}
