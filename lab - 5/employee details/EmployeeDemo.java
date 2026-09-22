import java.lang.System;
import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    private int empid;

    Employee(String name, int empid) {
        super(name);
        this.empid = empid;
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + empid);
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    HourlyEmployee(String name, int empid,
                   double hourlyRate, int hoursWorked) {

        super(name, empid);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double getGrossPay() {
        return hourlyRate * hoursWorked;
    }

    void display() {
        super.display();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: " + getGrossPay());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Hourly Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();

        HourlyEmployee employee =
            new HourlyEmployee(name, id, rate, hours);

        System.out.println("\n--- Employee Details ---");
        employee.display();

        sc.close();
    }
}