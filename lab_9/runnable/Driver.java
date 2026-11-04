import java.lang.System;
import java.util.*;

class NewThread implements Runnable {
    Thread t;
    int n, i, cnt, n1, temp, n2;
    double sum = 0;

    NewThread(int n, String name) {
        t = new Thread(this, name);
        this.n = n;
        t.start();
    }

    public void run() {
        n1 = n;
        n2 = n;
        while(n != 0){
            n /= 10;
            cnt++;
        }

        while(n1 != 0) {
            temp = n1 % 10;
            sum = sum + Math.pow(temp, cnt);
            n1 /= 10;
        }

        if(n2 == sum) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        NewThread t = new NewThread(n, "My Thread");
    }
}
