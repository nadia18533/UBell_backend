package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.DEPARTMENT;

import com.UniversitySchedule_2_2.dto.DepartmentDTO;
import com.UniversitySchedule_2_2.entity.Department;
import com.UniversitySchedule_2_2.services.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(DEPARTMENT)
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

  @GetMapping("/allDepartments")
    public List<DepartmentDTO> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{id}")
    public DepartmentDTO getOneDepartment(@PathVariable Long id) {
        return departmentService.getOneDepartment(id);
    }

@PutMapping("/{id}")
    public void update(@RequestBody Department department, @PathVariable Long id){
  departmentService.update(id, department);
    }


    @PostMapping
  public void post(@RequestBody Department department) {
      departmentService.save(department);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
      departmentService.remove(id);
    }

}

