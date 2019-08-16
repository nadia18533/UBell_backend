package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.DepartmentDTO;
import com.UniversitySchedule_2_2.dto.GroupDTO;
import com.UniversitySchedule_2_2.dto.GroupNamesDTO;
import com.UniversitySchedule_2_2.entity.Audience;
import com.UniversitySchedule_2_2.entity.Department;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.DepartmentRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentDTO> getAllDepartmentNames() {
        return departmentRepository.findAll().stream().map(DepartmentDTO::new).collect(Collectors.toList());
    }

    public DepartmentDTO getOneDepartment(Long id) {
        return new DepartmentDTO(departmentRepository.getOne(id));
    }

    public void remove(Long id){
      departmentRepository.deleteById(id);
    }

    public Department update(Long id, Department department) {
        return departmentRepository.findById(id)
            .map(employee -> {
                employee.setId(department.getId());
                employee.setName(department.getName());
                return departmentRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public Department save (Department department) {
        return departmentRepository.save(department);
    }

}
