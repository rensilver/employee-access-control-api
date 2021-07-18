package com.rensilver.employeeaccesscontrolapi.repository;

import com.rensilver.employeeaccesscontrolapi.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {


}
