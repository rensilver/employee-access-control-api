package com.rensilver.employeeaccesscontrolapi.service;

import com.rensilver.employeeaccesscontrolapi.model.WorkingDay;
import com.rensilver.employeeaccesscontrolapi.repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {

    @Autowired
    WorkingDayRepository workingDayRepository;

    public WorkingDay create(WorkingDay workingDay) {
       return workingDayRepository.save(workingDay);
    }

    public List<WorkingDay> findAll() {
        return workingDayRepository.findAll();
    }

    public Optional<WorkingDay> findById(Long id) {
        return workingDayRepository.findById(id);
    }

    public WorkingDay update(WorkingDay workingDay) {
        return workingDayRepository.save(workingDay);
    }

    public void deleteWorkingDay(Long id) {
        workingDayRepository.deleteById(id);
    }
}
