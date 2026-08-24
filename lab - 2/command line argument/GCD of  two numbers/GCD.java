import java.lang.System;

class GCD {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two integer numbers.");
            System.out.println("Usage: java GCD <number1> <number2>");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int iterations = 0;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
            iterations++;
        }

        System.out.println("First number  : " + Integer.parseInt(args[0]));
        System.out.println("Second number : " + Integer.parseInt(args[1]));
        System.out.println("GCD           : " + a);
        System.out.println("Iterations    : " + iterations);
    }
}