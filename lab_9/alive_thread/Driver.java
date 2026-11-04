import java.lang.System;

class Driver {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        t.setName("New Thread");

        System.out.println("Thread name: " + t.getName() + "\nThread ID: " );

        if(t.isAlive()) {
            System.out.println(t.getName() + " is alive.");
        } else {
            System.out.println(t.getName() + " is in dead state.");
        }
    }
}
