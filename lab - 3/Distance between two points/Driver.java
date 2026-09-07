import java.lang.System;
import java.util.*;

class Point {
    int xCo;
    int yCo;

    Point() {
        xCo = 0;
        yCo = 0;
    }

    Point(int xCo, int yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }

    double distanceBetPoints (Point ob1, Point ob2) {
        Point temp = new Point();

        temp.xCo = ((ob2.xCo - ob1.xCo) * (ob2.xCo - ob1.xCo));
        temp.yCo = ((ob2.yCo - ob1.yCo) * (ob2.yCo - ob1.yCo));

        return Math.sqrt((temp.xCo) + (temp.yCo));
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x and y co-ordinates of first point: ");
        int x1Co = sc.nextInt();
        int y1Co = sc.nextInt();
        Point ob1 = new Point(x1Co, y1Co);

        System.out.print("Enter the x and y co-ordinates of second point: ");
        int x2Co = sc.nextInt();
        int y2Co = sc.nextInt();
        Point ob2 = new Point(x2Co, y2Co);

        Point ob3 = new Point();

        double dis = ob3.distanceBetPoints(ob1, ob2);

        System.out.println("The distance between those two points is: " + dis + "units  ");

        sc.close();
    }
}
