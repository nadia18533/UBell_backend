package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{


}
