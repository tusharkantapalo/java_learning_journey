import java.lang.System;
import java.util.*;

class Student {
    String name;
    int roll_no;
    String branch;

    void initialise(String n, int r, String b) {
        name = n;
        roll_no = r;
        branch = b;
    }

    void display() {
        System.out.println("Name: " + name + "\n" + "Roll No.: " + roll_no + "\n" + "Branch: " + branch); 
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Student std1 = new Student();

        System.out.print("Enter your name: ");
        std1.name = sc.nextLine();

        System.out.print("Enter your branch: ");
        std1.branch = sc.nextLine();

        System.out.print("Enter your Roll number: ");
        std1.roll_no = sc.nextInt();

        std1.initialise(std1.name, std1.roll_no, std1.branch);

        std1.display();

        sc.close();
    }
}
