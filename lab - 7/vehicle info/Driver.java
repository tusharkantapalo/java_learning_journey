import java.lang.System;

interface Servicing {

    public abstract int getServicingTime();

}

class Car implements Servicing {

    public int getServicingTime() {
        return 3;
    }

}

class Bike implements Servicing {

    public int getServicingTime() {
        return 1;
    }

}

class Driver {
    public static void main(String args[]) {

        Car ob1 = new Car();
        Bike ob2 = new Bike();

        int res1 = ob1.getServicingTime();
        int res2 = ob2.getServicingTime();

        System.out.println("The service time for car is " + res1 + " days and for bike is " + res2 + " days.");
    }
}
