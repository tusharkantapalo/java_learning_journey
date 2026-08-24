import java.lang.System;
import java.util.*;

class Arr {
    Scanner sc = new Scanner(System.in);

    static int fun(int arr[], int n, int key) {

        int i;

        for (i = 0; i < n; i++) {
            if(arr[i] == key) {
                return i + 1;
            }
        }

        return -1;
    }

    public void main(String args[]) {

        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for( int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to find: ");
        int key = sc.nextInt();

        int res = fun(arr, n, key);

        if(res != -1) {
            System.out.print(key + " is found at " + res + " place.");
        } else {
            System.out.print(key + " is not found.");
        }
    }
}
