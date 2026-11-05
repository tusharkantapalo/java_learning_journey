import java.lang.System;
import java.util.*;

class ChildThread1 extends Thread {
    int n;

    ChildThread1(String name, int n) {
        super(name);
        this.n = n;
    }

    public void run() {
        int temp, i;

        System.err.print("The odd ordered digits are: ");

        for(i = 0; n != 0; i++) {
            temp = n % 10;
            n = n / 10;

            if(i % 2 != 0) {
                System.out.println(temp);
            }
        }
    }
}

class ChildThread2 extends Thread {
    int n;

    ChildThread2(String name, int n) {
        super(name);
        this.n = n;
    }

    public void run() {
        int temp, i;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception occured.");
        }

        System.err.print("The even ordered digits are: ");

        for(i = 0; n != 0; i++) {
            temp = n % 10;
            n = n / 10;

            if(i % 2 == 0) {
                System.out.println(temp);
            }
        }
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, i, cnt = 0, n1;

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        n1 = n;

        ChildThread1 t1 = new ChildThread1("Child Thread 1", n);
        ChildThread2 t2 = new ChildThread2("Child Thread 2", n);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.print("Exception arised.");
        }
        
        for (i = 1; i <= n1; i++) {
            if(n1 % i == 0){
                cnt++;
            }
        }

        if(cnt == 2) {
            System.out.print(n1 + " is a prime number.");
        } else {
            System.out.println(n1 + " is a composite number.");
        }

        sc.close();
    }
}
