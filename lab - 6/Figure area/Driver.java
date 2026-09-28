import java.lang.System;
import java.util.*;

abstract class Figure {
    int dim1, dim2;

    Figure(int d1, int d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract void getArea();
}

class Rectangle extends Figure {

    Rectangle(int l, int w) {
        super(l, w);
    }

    void getArea() {
        System.out.println("Area of the rectangle is: " + (dim1 * dim2));
    }
}

class Triangle extends Figure {

    Triangle(int b, int h) {
        super(b, h);
    }

    void getArea() {
        System.out.println("Area of the triangle is: " + (0.5 * dim1 * dim2));
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and width of the rectangle: ");
        int l = sc.nextInt();
        int w = sc.nextInt();

        Figure ob1 = new Rectangle(l, w);
        ob1.getArea();

        System.out.print("Enter the base and height of the Triangle: ");
        int b = sc.nextInt();
        int h = sc.nextInt();

        Figure ob2 = new Triangle(b, h);
        ob2.getArea();

        sc.close();
    }
}
