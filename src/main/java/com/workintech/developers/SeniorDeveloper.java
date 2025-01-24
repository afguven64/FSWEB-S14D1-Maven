package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public String work() {
        setSalary(getSalary() + getSalary() * 0.1);
        return "Senior work";

    }
}
