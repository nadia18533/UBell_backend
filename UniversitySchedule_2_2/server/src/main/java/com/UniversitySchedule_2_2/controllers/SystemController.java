package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.SYSTEM;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(SYSTEM)
public class SystemController {

  @GetMapping("/stop")
    public void expressStop() {
    System.out.println("Express stop server");
    System.exit(0);
    }

}

