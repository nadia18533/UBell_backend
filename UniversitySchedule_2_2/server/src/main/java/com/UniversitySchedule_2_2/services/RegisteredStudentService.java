package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.RegisteredStudentDTO;
import com.UniversitySchedule_2_2.entity.RegisteredStudent;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.RegisteredStudentRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisteredStudentService {

    @Autowired
    private RegisteredStudentRepository registeredStudentRepository;

  public List<RegisteredStudentDTO> getAllRegisteredStudents() {
    return registeredStudentRepository.findAll().stream().map(RegisteredStudentDTO::new).collect(Collectors.toList());
  }

    public RegisteredStudentDTO getOneRegisteredStudent(Long id) {
        return new RegisteredStudentDTO(registeredStudentRepository.getOne(id));
    }

    public void remove(Long id){
        registeredStudentRepository.deleteById(id);
    }

    public RegisteredStudent update(Long id, RegisteredStudent registeredStudent) {
        return registeredStudentRepository.findById(id)
            .map(employee -> {
                employee.setId(registeredStudent.getId());
                employee.setUserFName(registeredStudent.getUserFName());
                employee.setUserLName(registeredStudent.getUserLName());
                employee.setInstitute(registeredStudent.getInstitute());
                employee.setCourse(registeredStudent.getCourse());
                employee.setGroup(registeredStudent.getGroup());
                employee.setOsVersion(registeredStudent.getOsVersion());
                employee.setVersionSDK(registeredStudent.getVersionSDK());
                employee.setBuildDevice(registeredStudent.getBuildDevice());
                employee.setModel(registeredStudent.getModel());
                employee.setBrand(registeredStudent.getBrand());
                employee.setManufacturer(registeredStudent.getManufacturer());
                employee.setNetworkOperatorName(registeredStudent.getNetworkOperatorName());
                employee.setSimOperatorName(registeredStudent.getSimOperatorName());
                return registeredStudentRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public RegisteredStudent save (RegisteredStudent registeredStudent) {
        return registeredStudentRepository.save(registeredStudent);
    }

}
