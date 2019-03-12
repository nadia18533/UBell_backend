package com.universityschedule.server.controller;

import com.universityschedule.server.service.ScheduleService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

//  @Autowired
//  private ScheduleService service;



  @GetMapping("/greeting")
  public String greeting(
      @RequestParam(name="name", required=false, defaultValue="World") String name,
      Map<String, Object> model
  ) {
    model.put("name", name);
    return "greeting";
  }

  @GetMapping
  public String main(Map<String, Object> model) {
    model.put("some", "hello, letsCode!");
    return "main";
  }



}
