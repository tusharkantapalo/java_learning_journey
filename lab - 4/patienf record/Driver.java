import java.lang.System;
import java.util.*;

class Patient {
	String name;
	int id, age;
	
	Patient() {
		name = "*";
		id = 0;
		age = 0;
	}
	
	Patient(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	void display() {
        System.out.println("\n-------------------");
		System.out.println("Name: " + name + "\nPatient ID: " + id + "Age: " + age);
	}
}

class Driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of the patients: ");
		int n = sc.nextInt();
		
		Patient ob[] = new Patient[n];

        sc.nextLine();              //to absorb the input buffer
		
		System.out.println("Enter the details of the patients: \n");
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the name of the patient: ");
			String name = sc.nextLine();
			System.out.print("Enter the ID of the patient: ");
			int id = sc.nextInt();
			System.out.print("Enter the age of the patient: ");
			int age = sc.nextInt();
			ob[i] = new Patient(name, id, age);

            sc.nextLine();              //to absorb the input buffer
		}
		
		for(int i = 0; i < n; i++) {
			ob[i].display();
		}
		
		System.out.print("Enter the age limit: ");
		int a = sc.nextInt();
		for(int i = 0; i < n; i++) {
			if(ob[i].age <= a) {
				ob[i].display();
			}
		}

        sc.close();
	}
}
