package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entities.ObjectDescription;
import lombok.Data;

@Data
public class ObjectDescriptionDTO {

  private Long id;

  private String name;

  private String nameQr;

  private String description;

  public ObjectDescriptionDTO() {
  }

  public ObjectDescriptionDTO(ObjectDescription objectDescription) {
    this.id = objectDescription.getId();
    this.name = objectDescription.getName();
    this.nameQr = objectDescription.getNameQr();
    this.description = objectDescription.getDescription();
  }
}
