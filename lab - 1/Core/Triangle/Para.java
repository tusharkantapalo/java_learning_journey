import java.lang.System;
import java.util.*;

class Para {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int height = sc.nextInt();

        float area = (0.5f * base * height);
        
        System.out.println("Area of the triangle is: " + area);

        sc.close();
    }
}