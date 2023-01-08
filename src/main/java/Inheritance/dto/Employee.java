package Inheritance.dto;
import java.time.*;

public class Employee
{
    private String name;
    private Double salary;
    private LocalDate hireDay;
    private Department dept;

    public Department getDept() {
        return dept.clone();
    }

    public Employee(String name, Double salary, int year, int month, int day,Department dept) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of( year, month, day);
        this.dept=dept;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        Double raise = salary*byPercent /100;
        salary += raise;
    }
}
