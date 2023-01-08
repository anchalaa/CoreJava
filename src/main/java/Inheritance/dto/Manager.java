package Inheritance.dto;

import Inheritance.dto.Employee;

public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, Double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day,new Department().setName("HR"));
        bonus = 0;
    }

    public Double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(Double b) {
        bonus = b;
    }
}
