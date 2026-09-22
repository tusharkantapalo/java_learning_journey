import java.lang.System;
import java.util.*;

class Vehicle {
    String vehicleNo;
    double fuelConsumed;

    Vehicle(String vehicleNo, double fuelConsumed) {
        this.vehicleNo = vehicleNo;
        this.fuelConsumed = fuelConsumed;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Fuel Consumed: " + fuelConsumed + " litres");
    }
}

class Car extends Vehicle {
    double distance;

    Car(String vehicleNo, double fuelConsumed, double distance) {
        super(vehicleNo, fuelConsumed);
        this.distance = distance;
    }

    double mileage() {
        return distance / fuelConsumed;
    }

    void display() {
        super.display();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Mileage: " + mileage() + " km/l");
    }
}

class ElectricCar extends Car {
    double batteryBackup;

    ElectricCar(String vehicleNo, double fuelConsumed, double distance,
                double batteryBackup) {
        super(vehicleNo, fuelConsumed, distance);
        this.batteryBackup = batteryBackup;
    }

    void display() {
        super.display();
        System.out.println("Battery Backup: " + batteryBackup + " km");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        ElectricCar[] vehicles = new ElectricCar[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Vehicle " + (i + 1));

            sc.nextLine();

            System.out.print("Enter Vehicle Number: ");
            String no = sc.nextLine();

            System.out.print("Enter Fuel Consumed: ");
            double fuel = sc.nextDouble();

            System.out.print("Enter Distance Travelled: ");
            double distance = sc.nextDouble();

            System.out.print("Enter Battery Backup: ");
            double backup = sc.nextDouble();

            vehicles[i] = new ElectricCar(no, fuel, distance, backup);
        }

        System.out.println("\n--- Vehicle Details ---");

        for (int i = 0; i < n; i++) {
            vehicles[i].display();
            System.out.println();
        }

        ElectricCar highest = vehicles[0];

        for (int i = 1; i < n; i++) {
            if (vehicles[i].mileage() > highest.mileage()) {
                highest = vehicles[i];
            }
        }

        System.out.println("--- Vehicle with Highest Mileage ---");
        highest.display();

        sc.close();
    }
}