package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entity.Rank;
import lombok.Data;

@Data
public class RankDTO {

  private Long id;

  private String name;

  public RankDTO() {
  }

  public RankDTO(Rank rank) {
    this.id = rank.getId();
    this.name = rank.getName();
  }
}
