import java.lang.System;
import java.util.*;

abstract class Shape {
    int length, width, radius, side;

    Shape(int l, int w, int r, int s) {
        length = l;
        width = w;
        radius = r;
        side = s;
    }

    abstract void rectArea();
    abstract void sqArea();
    abstract void circArea();
}

class Area extends Shape {
    
    Area(int l, int w, int r, int s) {
        super(l, w, r, s);
    }

    void rectArea() {
        System.out.println("Area of the rectangle is: " + (length * width));
    }

    void sqArea() {
        System.out.println("Area of the square is: " + (side * side));
    }

    void circArea() {
        System.out.println("Area of the circle is: " + (3.14 * radius * radius));
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and the width of the rectangle: ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        System.out.print("Enter the side of the square: ");
        int s = sc.nextInt();
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();

        System.out.println("-------------------------------------");

        Shape ob = new Area(l, w, r, s);
        ob.rectArea();
        ob.sqArea();
        ob.circArea();

        sc.close();
    }
}
