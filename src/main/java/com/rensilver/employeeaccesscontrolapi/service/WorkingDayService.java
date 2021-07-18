package com.rensilver.employeeaccesscontrolapi.service;

import com.rensilver.employeeaccesscontrolapi.model.WorkingDay;
import com.rensilver.employeeaccesscontrolapi.repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkingDayService {

    @Autowired
    WorkingDayRepository workingDayRepository;

    public WorkingDay create(WorkingDay workingDay) {
       return workingDayRepository.save(workingDay);
    }
}
