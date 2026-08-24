import java.lang.System;
import java.util.*;

class Arr {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix: ");
        int row = sc.nextInt();

        int arr[][] = new int[row][];

        for(int i = 0; i < row; i++) {

            System.out.print("Enter the number of element you want in " + i + " row");

            int j = sc.nextInt();
            arr[i] = new int[j];

            for(int k = 0; k < j; k++) {
                arr[i][k] = sc.nextInt();
            }
        }

        System.out.print("The matrix is: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + "  ");
            }
        }

        sc.close();
    }
}