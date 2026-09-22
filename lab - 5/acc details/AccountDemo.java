import java.lang.System;
import java.util.*;

class Account {
    String customerName;
    int accountNo;

    Account(String customerName, int accountNo) {
        this.customerName = customerName;
        this.accountNo = accountNo;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNo);
    }
}

class Savings_Account extends Account {
    double minBal;
    double savingBal;

    Savings_Account(String customerName, int accountNo,
                    double minBal, double savingBal) {
        super(customerName, accountNo);
        this.minBal = minBal;
        this.savingBal = savingBal;
    }

    void show() {
        display();
        System.out.println("Minimum Balance: " + minBal);
        System.out.println("Saving Balance: " + savingBal);
    }
}

class AccountDetails extends Savings_Account {
    double deposit;
    double withdrawal;

    AccountDetails(String customerName, int accountNo,
                   double minBal, double savingBal,
                   double deposit, double withdrawal) {

        super(customerName, accountNo, minBal, savingBal);
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }

    void show() {
        super.show();
        System.out.println("Deposit: " + deposit);
        System.out.println("Withdrawal: " + withdrawal);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNo = sc.nextInt();

        System.out.print("Enter Minimum Balance: ");
        double minBal = sc.nextDouble();

        System.out.print("Enter Saving Balance: ");
        double savingBal = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawal = sc.nextDouble();

        AccountDetails account = new AccountDetails(
            name, accountNo, minBal, savingBal, deposit, withdrawal
        );

        System.out.println("\n--- Account Details ---");
        account.show();

        sc.close();
    }
}