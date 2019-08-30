package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.LESSON_TYPE;
import static com.UniversitySchedule_2_2.constants.DBConstants.SUBJECT;

import com.UniversitySchedule_2_2.dto.LessonTypeDTO;
import com.UniversitySchedule_2_2.dto.SubjectDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = LESSON_TYPE)
public class LessonType extends LessonTypeDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @Column(name = "abbreviated", length = 10, nullable = false)
    private String abbreviated;

}
