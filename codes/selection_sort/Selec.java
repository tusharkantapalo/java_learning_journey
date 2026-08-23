import java.lang.System;
import java.util.*;

class Selec {

    static void func(int arr[], int n) {

        int i, j, t, min_index;

        for( i = 0; i < (n - 1); i++) {
            min_index = i;
            for(j = i + 1; j< n; j++) {
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            if(min_index != i) {
                t = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = t;
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number elements in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        func(arr, n);

        System.out.print("The array after sorting is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}