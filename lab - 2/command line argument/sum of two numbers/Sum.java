import java.lang.System;

class Sum {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two numbers.");
            System.out.println("Usage: java Sum <number1> <number2>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        // Display numbers and result
        System.out.println("First number  : " + num1);
        System.out.println("Second number : " + num2);
        System.out.println("Sum           : " + sum);
    }
}