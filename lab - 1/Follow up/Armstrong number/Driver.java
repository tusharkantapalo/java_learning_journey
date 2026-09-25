import java.lang.System;
import java.util.*;

class Armstrong{
    int i, s, f, cnt = 0, i1, cnt2 = 0, i2, i3, x;
    double sum = 0;

    Armstrong(int s, int f) {
        this.s = s;
        this.f = f;
    }

    void calc() {
        for( i = s; i <= f; i++) {
            cnt = 0;
            sum = 0;
            i1 = i2 = i3 = i;

            while(i3 > 0) {
                i3 = i3 / 10;
                cnt++;
            }

            while(i1 > 0) {
                x = i1 % 10;
                sum = sum + Math.pow(x, cnt);
                i1 = i1 / 10;
            }

            if(sum == i2) {
                System.out.print(i2 + " ");
                cnt2++;
            }
        }

        if(cnt2 == 0){
            System.out.println("No Armstrong number present.");
        }
    }
    
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting points: ");
        int s = sc.nextInt();
        System.out.print("Enter the ending points: ");
        int f = sc.nextInt();

        Armstrong ob = new Armstrong(s, f);

        System.out.println("The Armstrong numbers are: ");
        ob.calc();

        sc.close();
    }
}
