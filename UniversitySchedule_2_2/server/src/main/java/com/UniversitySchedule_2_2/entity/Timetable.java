package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.TIMETABLE;

import com.UniversitySchedule_2_2.dto.TimetableDTO;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
@Table(name = TIMETABLE)
public class Timetable extends TimetableDTO {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lesson_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lessonDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "audience_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Audience audience;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Subject subject;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lesson_type_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private LessonType lessonType;

    @Column(name = "number_of_lesson_in_day", nullable = false)
    private Integer numberOfLessonInDay;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teacher_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Teacher teacher;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "group_id_1", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    private Group group;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "timetable_group",
//        joinColumns = @JoinColumn(name = "timetable_id", referencedColumnName = "id"),
//        inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"))


//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "timetable_group",
//        joinColumns = @JoinColumn(name = "timetable_id"),
//        inverseJoinColumns = @JoinColumn(name = "group_id"))

//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)

//    @JsonBackReference
//    @OneToMany(cascade = CascadeType.ALL,
//        fetch = FetchType.LAZY,
//        mappedBy = "timetable")
//    private List<Group> groupList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinTable(name = "timetable_group",
        joinColumns = @JoinColumn(name = "timetable_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"))
    private List<Group> groupList;

}
