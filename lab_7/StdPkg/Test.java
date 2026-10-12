package lab_7.StdPkg;
import lab_7.StdPkg.btech.*;
import java.lang.System;
import java.util.*;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name, branch and the roll no: ");
        String name = sc.nextLine();
        String branch = sc.nextLine();
        int roll = sc.nextInt();

        Student ob = new Student(name, branch, roll);

        ob.display();

        sc.close();
    }
}
