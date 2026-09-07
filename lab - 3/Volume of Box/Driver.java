import java.lang.System;
import java.util.*;

class Box {
    int height;
    int length;
    int bredth;

    Box(int height, int length, int bredth) {
        this.height = height;
        this.length = length;
        this.bredth = bredth;
    }

    int vol() {
        return (height * bredth * length);
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the box: ");
        int h = sc.nextInt();
        System.out.print("Enter the length of the box: ");
        int l = sc.nextInt();
        System.out.print("Enter the bredth of the box: ");
        int b = sc.nextInt();

        Box ob = new Box(h, l, b);

        int vol = ob.vol();

        System.out.println("The volume of the box is " + vol + " unit cube. ");

        sc.close();
    }
}
