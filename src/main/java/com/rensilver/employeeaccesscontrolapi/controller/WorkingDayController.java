package com.rensilver.employeeaccesscontrolapi.controller;

import com.rensilver.employeeaccesscontrolapi.model.WorkingDay;
import com.rensilver.employeeaccesscontrolapi.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workingday")
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public ResponseEntity<WorkingDay> createWorkingDay(@RequestBody WorkingDay workingDay) {
        workingDay = workingDayService.create(workingDay);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idWorkingDay}")
                    .buildAndExpand(workingDay.getId()).toUri();
        return ResponseEntity.created(uri).body(workingDay);
    }

    @GetMapping
    public List<WorkingDay> findAllWorkingDays() {
        return workingDayService.findAll();
    }

    @GetMapping("/{idWorkingDay}")
    public ResponseEntity<WorkingDay> findWorkingDayById(@PathVariable Long idWorkingDay) throws Exception {
       return ResponseEntity.ok(workingDayService.findById(idWorkingDay).orElseThrow(() -> new NoSuchElementException("Working Day not found.")));
    }

    @PutMapping
    public WorkingDay updateWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.update(workingDay);
    }

    @DeleteMapping("/{idWorkingDay}")
    public ResponseEntity<WorkingDay> deleteById(@PathVariable Long idWorkingDay) throws Exception {
        try {
            workingDayService.deleteWorkingDay(idWorkingDay);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity.noContent().build();
    }
}
