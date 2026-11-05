import java.lang.System;
import java.util.*;

class NewThread extends Thread {
    int n;

    NewThread(String name, int n) {
        super(name);
        this.n = n;
    }

    public void run() {
        int i, temp, rev = 0, n1;
        n1 = n;

        while( n != 0) {
            temp = n % 10;
            rev = (rev * 10) + temp;
            n /= 10;
        }

        if(n1 == rev) {
            System.out.println(n1 + " is palindrome number.");
        } else {
            System.out.println(n1 + " is not a palindrome number.");
        }
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, n1, i, cnt = 0, n2;

        System.out.print("Enter the number: ");
        n = sc.nextInt();
        n1 = n;
        n2 = n;

        NewThread t = new NewThread("My Thread", n);
        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }

        for(i = 1; i <= n1; i++) {
            if(n1 % i == 0) {
                cnt++;
            }
        }

        if(cnt == 2) {
            System.out.println(n2 + " is prime");
        } else {
            System.out.println(n2 + " is composite.");
        }
    }
}
