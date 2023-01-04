package Inheritance;

public class ManagerTest
{
    public static void main(String[] args)
    {
        // constructing a manager object
        var boss = new Manager("Anchalaa Jha", 100000.0, 2002, 11, 25);
        boss.setBonus(5000.0);

        var staff = new Employee[3];

        staff[0]= boss;
        staff[1]= new Employee("Anish Jha", 50000.0, 2005, 12, 26);
        staff[2]= new Employee("Shruti Jha", 60000.0, 1997, 8, 5);

        //printing all information about all employee objects
        for(Employee e: staff)
            System.out.println("Name=" + e.getName() + ", Salary=" + e.getSalary());
    }
}
