package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Long>{


}
