package org.ssol.reactinspringboot.loader;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.ssol.reactinspringboot.entity.Employee;
import org.ssol.reactinspringboot.repository.EmployeeRepository;

@Component
@AllArgsConstructor
public class DatabaseLoader implements CommandLineRunner {
    private final EmployeeRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
