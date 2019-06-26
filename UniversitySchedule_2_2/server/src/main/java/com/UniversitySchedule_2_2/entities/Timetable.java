package com.UniversitySchedule_2_2.entities;

import com.UniversitySchedule_2_2.dto.TimetableDTO;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "timetable")
public class Timetable extends TimetableDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "teacher", length = 50, nullable = false)
    private String teacher;

    @Column(name = "subject", length = 50, nullable = false)
    private String subject;

    @Column(name = "type_of_lesson", length = 50, nullable = false)
    private String typeOfLesson;

    @Column(name = "group_name", length = 50, nullable = false)
    private String group;

    @Column(name = "audience", length = 50, nullable = false)
    private String audience;

    @Column(name = "schedule_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduleDate;

    @Column(name = "description", length = 50, nullable = true)
    private String description;

}
