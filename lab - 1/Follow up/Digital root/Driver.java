import java.lang.System;
import java.util.*;

class Root {
    int num, sum = 0;

    int calc(int num) {
        if(num <= 9) {
            return num;
        }

        while(num > 0) {
            sum = sum + (num % 10);
            num = num /10;
        }
        
        return sum;
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        Root ob = new Root();

        int res = ob.calc(num);

        System.out.println("The Digital root is: " + res);

        sc.close();
    }
}
