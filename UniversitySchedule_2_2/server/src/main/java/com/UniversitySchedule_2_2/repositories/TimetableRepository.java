package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entity.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Long>{

  Timetable findByAudienceId(Long id);

}
