import java.lang.System;
import java.util.*;

class Student {
    int rollNo;
    String name;
    double mark1, mark2, mark3;

    Student(int rollNo, String name, double mark1, double mark2, double mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
    }
}

class Result extends Student {
    double percentage;
    char grade;

    Result(int rollNo, String name, double mark1, double mark2, double mark3) {
        super(rollNo, name, mark1, mark2, mark3);
    }

    void calculate() {
        percentage = (mark1 + mark2 + mark3) / 3;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayResult() {
        display();
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Result[] students = new Result[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks in Subject 1: ");
            double m1 = sc.nextDouble();

            System.out.print("Enter marks in Subject 2: ");
            double m2 = sc.nextDouble();

            System.out.print("Enter marks in Subject 3: ");
            double m3 = sc.nextDouble();

            students[i] = new Result(roll, name, m1, m2, m3);
            students[i].calculate();
        }

        System.out.println("\n--- Student Details ---");

        for (int i = 0; i < n; i++) {
            students[i].displayResult();
            System.out.println();
        }

        Result highest = students[0];

        for (int i = 1; i < n; i++) {
            if (students[i].percentage > highest.percentage) {
                highest = students[i];
            }
        }

        System.out.println("--- Student with Highest Percentage ---");
        highest.displayResult();

        sc.close();
    }
}