package codes.Package.myPack;
import java.lang.System;
import java.util.*;

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Test ob = new Test(a, b);

        ob.display();

        sc.close();
    }
}
