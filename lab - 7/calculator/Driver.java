import java.lang.System;
import java.util.*;

interface Calculator {

    public abstract double add();
    public abstract double sub();
    public abstract double mul();
    public abstract double div();

}

class DemoCalculator implements Calculator {
    int num1, num2;

    DemoCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double sub() {
        return num1 - num2;
    }

    public double  mul() {
        return num1 * num2;
    }

    public double div() {
        return num1 / num2;
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, ch;
        double res;

        System.out.print("Enter the number1 and number2: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        Calculator ob = new DemoCalculator(num1, num2);

        while(true) {
            System.out.println("1: Addition");
            System.out.println("2: Substraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    res = ob.add();
                    System.out.println("Addition: " + res);
                    break;
                case 2:
                    res = ob.sub();
                    System.out.println("Substraction: " + res);
                    break;
                case 3:
                    res = ob.mul();
                    System.out.println("Multiplication: " + res);
                    break;
                case 4:
                    res = ob.div();
                    System.out.println("Division: " + res);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
