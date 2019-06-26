package com.UniversitySchedule_2_2.repositories;


import com.UniversitySchedule_2_2.entities.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Long>{


}
