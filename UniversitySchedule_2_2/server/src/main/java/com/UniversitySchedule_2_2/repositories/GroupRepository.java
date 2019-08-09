package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entity.Group;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{
  List<Group> findByInstituteName(String  name);

}
