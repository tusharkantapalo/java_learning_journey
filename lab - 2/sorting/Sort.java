import java.lang.System;
import java.util.*;

class Sort {

    static void fun(int arr[], int n) {

        int i, j, temp, cnt = 0;

        for(i = 0; i < n-1; i++) {
            for(j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    cnt++;
                }
            }
        }

        System.out.print("Number of comparision is: " + cnt);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elemtns of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array before sorting: ");
        for( int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n");

        fun(arr, n);

        System.out.print("\nThe array after sorting: ");
        for( int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}