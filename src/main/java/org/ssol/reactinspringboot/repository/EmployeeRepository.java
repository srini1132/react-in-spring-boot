package org.ssol.reactinspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.ssol.reactinspringboot.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
