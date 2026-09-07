import java.lang.System;
import java.util.*;

class Rect {
    int length;
    int bredth;

    void getDim(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    int area() {
        return (length * bredth);
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Rect ob1 = new Rect();

        System.out.print("Enter the length of the rectangle: ");
        ob1.length = sc.nextInt();
        System.out.print("Enter the bredth of the rectangle: ");
        ob1.bredth = sc.nextInt();

        ob1.getDim(ob1.length, ob1.bredth);
        int area = ob1.area();

        System.out.print("The area of the rectangle is: " + area + " Unit square. ");

        sc.close();
    }
}
