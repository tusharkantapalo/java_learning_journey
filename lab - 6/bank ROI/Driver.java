import java.lang.System;

abstract class Bank {
    abstract void getROI();
}

class SBI extends Bank{

    SBI() {}

    void getROI() {
        System.out.println("\nState Bank of India" + "\nROI: 8.3%");
    }
}

class PNB extends Bank{
    void getROI() {
        System.out.println("\nPunjab National Bank" + "\nROI: 6.9%");
    }
}

class BOI extends Bank{
    void getROI () {
        System.out.println("\nBank of India" + "\nROI: 7.6%");
    }
}

class Driver {
    public static void main(String args[]) {
        Bank acc1 = new SBI();
        acc1.getROI();

        Bank acc2 = new PNB();
        acc2.getROI();

        Bank acc3 = new BOI();
        acc3.getROI();
    }
}
