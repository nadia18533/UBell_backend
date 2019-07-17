package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Group;
import com.UniversitySchedule_2_2.entity.Teacher;
import lombok.Data;

@Data
public class GroupDTO {

  private Long id;

  private String name;

//    private Institute institute;

//    private Specialty specialty;

  private Teacher curator;

//    private Student captain;

//    private Department cathedra;

  private Integer course;

  public GroupDTO() {
  }

  public GroupDTO(Group group) {
    this.id = group.getId();
    this.name = group.getName();
    this.curator = group.getCurator();
    this.course = group.getCourse();
  }
}
