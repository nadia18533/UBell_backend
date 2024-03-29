package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entity.Teacher;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

  List<Teacher> findByDepartmentName(String  name);

}
