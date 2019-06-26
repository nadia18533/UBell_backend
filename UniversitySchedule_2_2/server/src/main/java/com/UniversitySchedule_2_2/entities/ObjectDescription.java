package com.UniversitySchedule_2_2.entities;

import com.UniversitySchedule_2_2.dto.ObjectDescriptionDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "object_description")
public class ObjectDescription extends ObjectDescriptionDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @Column(name = "name_qr", length = 255, nullable = false)
    private String nameQr;

    @Column(name ="description", length = 3000, nullable = false)
    private String description;
}
