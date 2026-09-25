import java.lang.System;
import java.util.*;

class GCD {
    int num1, num2;

    GCD (int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    int calc(int num1, int num2) {
        if(num1 == num2) {
            return num1;
        } else if(num1 > num2) {
            return calc(num1 - num2, num2);
        } else {
            return calc(num1, num2 - num1);
        }
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        GCD ob = new GCD(num1, num2);
        int res = ob.calc(num1, num2);

        System.out.println("The GCD is " + res + " and LCM is " + ((num1 * num2) / res));

        sc.close();
    }
}
