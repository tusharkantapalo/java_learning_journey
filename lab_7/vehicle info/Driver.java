import java.lang.System;
import java.util.*;

interface Servicing {

    public abstract int getServicingTime();

}

class Car implements Servicing {

    int time;

    Car(int time) {
        this.time = time;
    }

    public int getServicingTime() {
        return time;
    }

}

class Bike implements Servicing {

    int time;

    Bike(int time) {
        this.time = time;
    }

    public int getServicingTime() {
        return time;
    }

}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the car servicing time and bike servicing time: ");
        int carT = sc.nextInt();
        int bikeT = sc.nextInt();

        Car ob1 = new Car(carT);
        Bike ob2 = new Bike(bikeT);

        int res1 = ob1.getServicingTime();
        int res2 = ob2.getServicingTime();

        System.out.println("The service time for car is " + res1 + " days and for bike is " + res2 + " days.");

        sc.close();
    }
}
