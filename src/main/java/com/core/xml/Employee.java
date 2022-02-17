package com.core.xml;

import java.time.LocalDate;

public class Employee {

    private String firstName;
    private Double salary;
    private LocalDate birthDate;

    public Employee(String firstName, Double salary, LocalDate birthDate) {
        this.firstName = firstName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public Employee(){}


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
