import java.lang.System;
import java.util.*;

class ChildThread extends Thread {
    public void run() {
        System.out.println("Child process is runniing.");
    }
}

class Driver {
    public static void main(String args[]) {
        ChildThread ob = new ChildThread();

        ob.start();
        try{
            Thread.sleep(5000);
            System.out.println("Parent process is running.");
        } catch(InterruptedException e) {
            System.out.println("Exception occured.");
        }
    }
}
