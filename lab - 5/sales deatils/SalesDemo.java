import java.lang.System;
import java.util.*;

class SalesPerson {
    int salesPersonId;
    String name;
    double salesAmount;

    SalesPerson(int salesPersonId, String name, double salesAmount) {
        this.salesPersonId = salesPersonId;
        this.name = name;
        this.salesAmount = salesAmount;
    }
}

class SeniorSalesPerson extends SalesPerson {
    double incentivePercentage;

    SeniorSalesPerson(int salesPersonId, String name,
                      double salesAmount, double incentivePercentage) {

        super(salesPersonId, name, salesAmount);
        this.incentivePercentage = incentivePercentage;
    }

    double getIncentiveAmount() {
        return salesAmount * incentivePercentage / 100;
    }

    double getTotalEarnings() {
        return salesAmount + getIncentiveAmount();
    }

    void display() {
        System.out.println("Salesperson ID: " + salesPersonId);
        System.out.println("Name: " + name);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Incentive Percentage: "
                           + incentivePercentage + "%");
        System.out.println("Incentive Amount: "
                           + getIncentiveAmount());
        System.out.println("Total Earnings: "
                           + getTotalEarnings());
    }
}

public class SalesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of salespersons: ");
        int n = sc.nextInt();

        SeniorSalesPerson[] salespersons =
            new SeniorSalesPerson[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Salesperson " + (i + 1));

            System.out.print("Enter Salesperson ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Sales Amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter Incentive Percentage: ");
            double incentive = sc.nextDouble();

            salespersons[i] = new SeniorSalesPerson(
                id, name, amount, incentive
            );
        }

        System.out.println("\n--- Salesperson Details ---");

        for (int i = 0; i < n; i++) {
            salespersons[i].display();
            System.out.println();
        }

        sc.close();
    }
}