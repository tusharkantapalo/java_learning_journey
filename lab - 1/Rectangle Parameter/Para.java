import java.lang.System;
import java.util.*;

class Para {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int bredth = sc.nextInt();

        int area = (length * bredth);
        int peri = (2 * (length + bredth));

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + peri);

        sc.close(); //IMPORTANT
    }
}