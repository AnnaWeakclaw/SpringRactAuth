package com.domainObjects;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

//@Data is a Project Lombok annotation to autogenerate:
// getters, setters, constructors, toString, hash, equals, and other things. It cuts down on the boilerplate.
@Data
//@Entity is a JPA annotation that denotes the whole class for storage in a relational table.
@Entity
public class Employee {

    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    private String description;

    private Employee() {}

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}