package Inheritance;

import Inheritance.dto.Department;
import Inheritance.dto.Employee;
import Inheritance.dto.Manager;

public class ManagerTest
{
    public static void main(String[] args)
    {
        // constructing a manager object
        Manager boss = new Manager("Anchalaa Jha", 100000.0, 2002, 11, 25);
        boss.setBonus(5000.0);

        Employee[] staff = new Employee[3];

        staff[0]= boss;
        staff[1]= new Employee("Anish Jha", 50000.0, 2005, 12, 26,new Department().setName("Engg"));
        staff[2]= new Employee("Shruti Jha", 60000.0, 1997, 8, 5,new Department().setName("HR"));

        //printing all information about all employee objects
        for(Employee e: staff)
            System.out.println("Name=" + e.getName() + ", Salary=" + e.getSalary());
        staff[1].getDept().setName("Design");
        System.out.println(staff[1].getDept().getName());



    }
}
