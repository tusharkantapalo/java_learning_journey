import java.lang.System;
import java.util.*;

class Emp {
	String ename;
	int empid, sal;
	static String comp = "Silicon";
	
	Emp() {
		ename = "*";
		empid = 0;
		sal = 0;
	}
	
	Emp(int empid, String ename, int sal) {
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	
	void putData() {
        System.out.println("\n-------------------");
		System.out.println("Employee ID: " + empid + "\nEmployee name: " + ename + "\nSalary: " + sal + "\nCompany name: " + comp);
	}
}

class Driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		Emp[] ob= new Emp[n];

        sc.nextLine();              //to absorb the input buffer
		
		System.out.print("Entert he details of the employees: \n");
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the name of the emp: ");
			String ename = sc.nextLine();
			System.out.print("Enter the ID of the emp: ");
			int empid = sc.nextInt();
			System.out.print("Enter the salary of the emp: ");
			int sal = sc.nextInt();
			ob[i] = new Emp(empid, ename, sal);

            sc.nextLine();              //to absorb the input buffer
		}
		
		for(int i = 0; i < n; i++) {
			ob[i].putData();
		}

        sc.close();
	}
}
