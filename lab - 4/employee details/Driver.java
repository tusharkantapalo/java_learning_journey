import java.lang.System;
import java.util.*;

class Emp {
	String ename, dept;
	int empid, sal;
	
	void getData(int empid, String ename, String dept, int sal) {
		this.empid = empid;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}
	
	void putData() {
        System.out.println("\n-------------------");
		System.out.println("\nEmployee ID: " + empid + "\nEmployee name: " + ename + "\nDepartment: " + dept + "\nSalary: " + sal);
	}
}

class Driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		Emp[] ob= new Emp[n];
		
		for(int i = 0; i < n; i++) {
			ob[i] = new Emp();
		}

        sc.nextLine(); //for having the enter button
		
		System.out.print("Entert he details of the employees: \n");
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the name of the emp: ");
			String ename = sc.nextLine();
			System.out.print("Enter the department of the emp: ");
			String dept = sc.nextLine();
			System.out.print("Enter the ID of the emp: ");
			int empid = sc.nextInt();
			System.out.print("Enter the salary of the emp: ");
			int sal = sc.nextInt();
			ob[i].getData(empid, ename, dept, sal);

            sc.nextLine(); //for having the enter button
		}
		
		for(int i = 0; i < n; i++) {
			ob[i].putData();
		}

        sc.close();
	}
}