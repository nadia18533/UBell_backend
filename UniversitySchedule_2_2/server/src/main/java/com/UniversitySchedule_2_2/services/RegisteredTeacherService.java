package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.RegisteredTeacherDTO;
import com.UniversitySchedule_2_2.entity.RegisteredTeacher;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.RegisteredTeacherRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisteredTeacherService {

  @Autowired
  private RegisteredTeacherRepository registeredTeacherRepository;

  public List<RegisteredTeacherDTO> getAllRegisteredTeachers() {
    return registeredTeacherRepository.findAll().stream().map(RegisteredTeacherDTO::new)
        .collect(Collectors.toList());
  }

  public RegisteredTeacherDTO getOneRegisteredTeacher(Long id) {
    return new RegisteredTeacherDTO(registeredTeacherRepository.getOne(id));
  }

  public void remove(Long id) {
    registeredTeacherRepository.deleteById(id);
  }

  public RegisteredTeacher update(Long id, RegisteredTeacher registeredTeacher) {
    return registeredTeacherRepository.findById(id)
        .map(employee -> {
          employee.setId(registeredTeacher.getId());
          employee.setUserFullName(registeredTeacher.getUserFullName());
          employee.setDepartment(registeredTeacher.getDepartment());
          employee.setInstitute(registeredTeacher.getInstitute());
          employee.setRegistrationDate(registeredTeacher.getRegistrationDate());
          employee.setApplicationVersion(registeredTeacher.getApplicationVersion());
          employee.setOsVersion(registeredTeacher.getOsVersion());
          employee.setVersionSDK(registeredTeacher.getVersionSDK());
          employee.setBuildDevice(registeredTeacher.getBuildDevice());
          employee.setModel(registeredTeacher.getModel());
          employee.setBrand(registeredTeacher.getBrand());
          employee.setManufacturer(registeredTeacher.getManufacturer());
          employee.setNetworkOperatorName(registeredTeacher.getNetworkOperatorName());
          employee.setSimOperatorName(registeredTeacher.getSimOperatorName());
          return registeredTeacherRepository.save(employee);
        })
        .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
  }

  public RegisteredTeacher save(RegisteredTeacher registeredTeacher) {
    return registeredTeacherRepository.save(registeredTeacher);
  }

}
