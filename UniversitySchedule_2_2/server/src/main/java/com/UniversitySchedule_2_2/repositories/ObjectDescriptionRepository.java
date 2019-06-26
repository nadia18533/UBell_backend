package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entities.ObjectDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectDescriptionRepository extends JpaRepository<ObjectDescription, Long>{


}
