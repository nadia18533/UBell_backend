package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entity.RegisteredStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisteredStudentRepository extends JpaRepository<RegisteredStudent, Long>{

}
