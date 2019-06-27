package com.domainObjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
// It implements Spring Boot’s CommandLineRunner so that it gets run after all the beans are created and registered.
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

//    It uses constructor injection and autowiring to get Spring Data’s automatically created EmployeeRepository
    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
//     The run() method is invoked with command line arguments, loading up your data.
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}