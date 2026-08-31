import java.lang.System;
import java.util.*;

class Complex {
    int real, img;

    void initialise(int r, int i) {
        real = r;
        img = i;
    }

    void display() {
        System.out.print(real + " + " + img + "i");
    }

    Complex add(Complex ob1, Complex ob2) {

        Complex temp = new Complex();

        temp.real = ob1.real + ob2.real;
        temp.img = ob1.img + ob2.img;

        return temp;
    }
}

class Driver{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Complex ob1 = new Complex();
        Complex ob2 = new Complex();
        Complex ob3 = new Complex();

        System.out.print("Enter the real and imaginary part of first number: ");
        int num1_real = sc.nextInt();
        int num1_img = sc.nextInt();

        System.out.print("Enter the real and imaginary part of first number: ");
        int num2_real = sc.nextInt();
        int num2_img = sc.nextInt();

        ob1.initialise(num1_real, num1_img);
        ob2.initialise(num2_real, num2_img);

        ob3 = ob3.add(ob1, ob2);

        ob3.display();

    }
}