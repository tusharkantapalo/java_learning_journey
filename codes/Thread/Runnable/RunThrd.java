package codes.Thread.Runnable;
import java.util.*;

class NewThread implements Runnable {
    int n;
    Thread t;
    NewThread (int n) {
        System.out.println("Child Thread is running.");
        t = new Thread(this, "Child Thread");
        this.n = n;
        t.start();
    }

    public void run() {
        try {
            for(int i = 0; i < n; i++) {
                System.out.println(i);
                Thread.sleep(500); // Sleep for 500 milliseconds (0.5 seconds)
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
    }
}

class RunThrd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter the number: ");
        num = sc.nextInt();

        NewThread ob = new NewThread(num);

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Parent process is running");
    }
}
