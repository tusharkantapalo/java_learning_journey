import java.lang.System;

interface Father {
    public abstract void work();
}

interface Mother {
    public abstract void cook();
}

class Child implements Father, Mother {
    public void work() {
        System.out.println("My son has finished the work.");
    }

    public void cook() {
        System.out.print("My has finished the cooking.");
    }
}

class Driver {
    public static void main(String args[]) {
        Child ob = new Child();

        ob.work();
        ob.cook();
    }
}
