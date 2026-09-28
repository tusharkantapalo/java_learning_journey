import java.lang.System;
import java.util.*;

abstract class Employee {
    int empid, basicPay;
    String name;

    Employee(String n, int e, int b) {
        name = n;
        empid = e;
        basicPay = b;
    }

    abstract void calcSal();
    void showDetails() {
        System.out.print("Name: " + name + "\nID: " + empid + "\nBasic Pay: " + basicPay);
    }
}

class Manager extends Employee {

    Manager(String n, int e, int b){
        super(n, e, b);
    }

    void calcSal() {
        System.out.println("Salary: Rs." + (basicPay + (basicPay * 0.2)) + "/-");
    }
}

class Developer extends Employee {

    Developer(String n, int e, int b) {
        super(n, e, b);
    }

    void calcSal() {
        System.out.println("Salary: Rs." + (basicPay + (basicPay * 0.1)) + "/-");
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter the ID: ");
        int id1 = sc.nextInt();
        System.out.print("Enter the basic pay: ");
        int basic1 = sc.nextInt();

        sc.nextLine();

        Employee ob1 = new Manager(name1, id1, basic1);
        ob1.calcSal();
        ob1.showDetails();

        System.out.print("\nEnter the Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter the ID: ");
        int id2 = sc.nextInt();
        System.out.print("Enter the basic pay: ");
        int basic2 = sc.nextInt();

        Employee ob2 = new Developer(name2, id2, basic2);
        ob2.calcSal();
        ob2.showDetails();

        sc.close();
    }
}
