import java.lang.System;
import java.util.*;

class Movie {
	String title;
	int id, rating;
	
	Movie() {
		title = "*";
		id = 0;
		rating = 0;
	}
	
	Movie(String title, int id, int rating) {
		this.title = title;
		this.id = id;
		this.rating = rating;
	}
	
	void display() {
		System.out.println("Name: " + title + "\nPatient ID: " + id + "Age: " + rating);
	}
}

class Driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of the Movies: ");
		int n = sc.nextInt();
		
		Movie ob[] = new Movie[n];

        sc.nextLine();
		
		System.out.println("Enter the details of the Movies: ");
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the Title of the Movie: ");
			String name = sc.nextLine();
			System.out.print("Enter the ID of the Movie: ");
			int id = sc.nextInt();
			System.out.print("Enter the Rating of the patient: ");
			int rating = sc.nextInt();
			ob[i] = new Movie(name, id, rating);

            sc.nextLine();
		}
		
		for(int i = 0; i < n; i++) {
			ob[i].display();
		}
		
		int l = 0, i1 = 0;
        for(int i = 0; i < n; i++) {
            if(ob[i].rating > l) {
                l = ob[i].rating;
                i1 = i;
            }
        }

        System.out.println("\nThe highest rating is of " + ob[i1].title);

        sc.close();
	}
}
