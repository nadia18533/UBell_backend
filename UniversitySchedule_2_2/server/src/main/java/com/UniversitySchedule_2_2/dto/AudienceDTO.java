package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Audience;
import lombok.Data;

@Data
public class AudienceDTO {

  private Long id;

  private String name;

  private String description;

  public AudienceDTO() {
  }

  public AudienceDTO(Audience audience) {
    this.id = audience.getId();
    this.name = audience.getName();
    this.description = audience.getDescription();
  }
}
