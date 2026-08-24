import java.lang.System;
import java.util.*;

class Arr{

    static void fun(int arr1[][], int arr2[][], int row1, int row2, int col1, int col2) {

        int arr3[][] = new int[row1][col1];

        if(row1 != row2 && col1 != col2) {
            System.out.println("Addition can not be done.");
        } else {
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < col1; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }

        System.out.println("The resusltant matrix is: ");
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row and column of 1st matrix: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        int arr1[][] = new int[row1][col1];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the row and column of 2nd matrix: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        int arr2[][] = new int[row2][col2];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < row2; i++) {
            for(int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        fun(arr1, arr2, row1, row2, col1, col2);

        sc.close();
    }
}
