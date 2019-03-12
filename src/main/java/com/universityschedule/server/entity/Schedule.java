package com.universityschedule.server.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {

//private Date

//  @Column(updatable = false)
//  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
//  @JsonView(Views.FullMessage.class)
//  private LocalDateTime creationDate;

  public Schedule() {
  }

}
