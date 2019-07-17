package com.UniversitySchedule_2_2.entity;

import static com.UniversitySchedule_2_2.constants.DBConstants.TEACHER;

import com.UniversitySchedule_2_2.dto.TeacherDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
@Table(name = TEACHER)
public class Teacher extends TeacherDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", length = 30, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;

    @Column(name = "middle_name", length = 30, nullable = false)
    private String middleName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rank_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Rank rank;

    @Column(name ="phone_number_1", length = 30, nullable = true)
    private String phoneNumber1;

    @Column(name ="phone_number_2", length = 30, nullable = true)
    private String phoneNumber2;

    @Column(name ="address", length = 100, nullable = true)
    private String address;

    @Column(name ="about", length = 300, nullable = true)
    private String about;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "curator")
    private Set<Group> groupSet = new HashSet<>();

}
