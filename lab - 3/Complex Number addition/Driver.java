import java.lang.System;
import java.util.*;

class Complex {
    int real;
    int img;

    Complex() {
        real = 0;
        img = 0;
    }

    Complex (int real, int img) {
        this.real = real;
        this.img = img;
    }

    void display() {
        System.out.println("Number is: " + real + " + " + img + "i");
    }

    Complex add(Complex ob1, Complex ob2) {
        Complex temp = new Complex();
        
        temp.real = ob1.real + ob2.real;
        temp.img = ob1.img + ob2.img;

        return temp;
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the real and imaginary part of the first number: ");
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();
        Complex ob1 = new Complex(real1, img1);
        System.out.print("Enter the real and imaginary part of the second number: ");
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();
        Complex ob2 = new Complex(real2, img2);

        ob1.display();
        ob2.display();

        Complex ob3 = new Complex();

        ob3 = ob3.add(ob1, ob2);
        
        System.out.print("The addition is: " + ob3.real + " + " + ob3.img + "i  ");

        sc.close();
    }
}
