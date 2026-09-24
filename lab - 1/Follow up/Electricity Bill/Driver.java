import java.lang.System;
import java.util.*;

class Coustmer {
    String name;
    int id, unit;
    double woSurcharge = 0, wSurcharge = 0;

    Coustmer() {
        name = "";
        id = 0;
        unit = 0;
    }

    Coustmer(String n, int i, int u) {
        name = n;
        id = i;
        unit = u;
    }

    Coustmer clac() {
        Coustmer temp = new Coustmer();

        if(unit <= 100) {
            temp.woSurcharge = unit * 1.5;
        } else if(unit > 100 && unit <= 300) {
            temp.woSurcharge = (100 * 1.5) + ((unit - 100) * 2.5);
        } else if(unit > 300) {
            temp.woSurcharge = (100 * 1.5) + (300 * 2.5) + ((unit - 300) * 4.0);
        }

        if(temp.woSurcharge >= 2000) {
            temp.wSurcharge = temp.woSurcharge + (temp.woSurcharge * 0.05);
        }

        return temp;
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your ID: ");
        int id = sc.nextInt();
        System.out.print("Enter the units consumed: ");
        int unit = sc.nextInt();

        Coustmer cost1 = new Coustmer(name, id, unit);
        Coustmer res = new Coustmer();
        res = cost1.clac();

        System.out.println("\nBill - ");
        System.out.print("------------------------------\n");
        System.out.println("Name: " + cost1.name + "\nID: " + cost1.id + "\nUnits Consumed: " + cost1.unit + "\nWithout Surcharge: " + res.woSurcharge + "/-" + "\nWith Surcharge: " + res.wSurcharge + "/-");

        sc.close();
    }
}
