package com.UniversitySchedule_2_2.dto;

import com.UniversitySchedule_2_2.entities.Timetable;
import java.util.Date;
import lombok.Data;

@Data
public class TimetableDTO {

    private Long id;

    private String teacher;

    private String subject;

    private String typeOfLesson;

    private String group;

    private String audience;

    private Date scheduleDate;

    private String description;

    public TimetableDTO() {}

    public TimetableDTO(Timetable timetable) {
        this.id = timetable.getId();
        this.teacher = timetable.getTeacher();
        this.subject = timetable.getSubject();
        this.typeOfLesson = timetable.getTypeOfLesson();
        this.group = timetable.getGroup();
        this.audience = timetable.getAudience();
        this.scheduleDate = timetable.getScheduleDate();
        this.description = timetable.getDescription();
    }
}
