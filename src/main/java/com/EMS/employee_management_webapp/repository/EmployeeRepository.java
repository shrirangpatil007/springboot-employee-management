package com.EMS.employee_management_webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EMS.employee_management_webapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
