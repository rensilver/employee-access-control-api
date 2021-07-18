package com.rensilver.employeeaccesscontrolapi.controller;

import com.rensilver.employeeaccesscontrolapi.model.WorkingDay;
import com.rensilver.employeeaccesscontrolapi.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workingday")
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.create(workingDay);
    }

}
