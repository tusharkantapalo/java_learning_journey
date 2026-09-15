import java.lang.System;
import java.util.*;

class Std {
	int reg;
	String name, branch;
	float cgpa;
	
	void getData(int reg, String name, String branch,float cgpa) {
		this.reg = reg;
		this.name = name;
		this.branch = branch;
		this.cgpa = cgpa;
	}
	
	void putData() {
        System.out.println("\n--------------------");
		System.out.println("Name: " + name + "\nRegd No: " + reg + "\nBranch: " + branch + "\nCGPA: " + cgpa);
        System.out.print("\n");
	}
}

class Driver {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print(" Enter the number of students: ");
		int n = sc.nextInt();
	
		Std ob[] = new Std[n];
	
		for(int i = 0; i < n; i++) {
			ob[i] = new Std();
		}

        sc.nextLine();          //for having the input buffer
	
		System.out.print("Enter the details of the students: \n");
		for(int i = 0; i < n; i++){
			System.out.print("Enter the name of the students: ");
			String name = sc.nextLine();
            System.out.print("Enter the branch of the student: ");
			String branch = sc.nextLine();
			System.out.print("Enter the registration number of the student: ");
			int reg = sc.nextInt();
			System.out.print("Enter the CGPA of the student: ");
			float cgpa = sc.nextFloat();
			ob[i].getData(reg, name, branch, cgpa);

            sc.nextLine();          //for having the input buffer
            
        }
	
		System.out.print("The details of the students are: ");
		for(int i = 0; i < n; i++) {
			ob[i].putData();
		}
	
		float l = 0;
		int i1 = 0;
	
		for(int i = 0; i < n; i++) {
			if(ob[i].cgpa > l) {
				l = ob[i].cgpa;
				i1 = i;
			}
		}
	
		System.out.print("The highest cgpa is of " + ob[i1].name + " having cgpa of " + ob[i1].cgpa);
        
        sc.close();
    }
	
}
