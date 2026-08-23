import java.lang.System;
import java.util.*;

class Ins{

    static void fun(int arr[], int n) {

        int i, j, key;

        for(j = 0; j < n; j++) {
            key = arr[j];
            i = j - 1;
            while(i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of characters in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        fun(arr, n);

        System.out.print("Array after sorting is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
