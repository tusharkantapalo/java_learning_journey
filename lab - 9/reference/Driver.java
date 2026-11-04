import java.lang.System;

class Driver {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        t.setName("New Thread");

        System.out.println("Class name: " + t.getClass().getName() + "\nThread name: " + t.getName() + "\nThread priority: " + t.getPriority() + "\nGroup name: " + t.getThreadGroup().getName());
    }
}
