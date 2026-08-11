//Write a program to input of name, sic, branch and marks of six subjects and print the average
import java.lang.System;
class Bio {
    public static void main(String args[]) {
        String name = "Tusharkanta Palo";
        String sic = "25bcsf75";
        String branch = "CSE";
        int dsa = 42;
        int math = 43;
        int bec = 45;
        int envs = 37;
        int thermo = 35;
        int chem = 45;
        float avg = ((dsa + math + bec + envs + thermo + chem) / 6);

        System.out.println("Name - " + name);
        System.out.println("SIC - " + sic);
        System.out.println("Branch - " + branch);
        System.out.println("Average Mark - " + avg);
    }
}