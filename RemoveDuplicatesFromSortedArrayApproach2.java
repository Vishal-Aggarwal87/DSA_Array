package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayApproach2 {
    static Scanner scanner = new Scanner(System.in);

    // input Array
    static void inputArray(int arr[]) {
        System.out.println("Enter Elements of Array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    // logic
    static int removeDuplicates(int arr[]) {
        int k = 1; // we start from 1 because atleast 1 element is always unique
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[k] = arr[i + 1];
                k++;
            }
        }
        // Here, we are making duplicates element 0
        for(int j=k; j<arr.length; j++) {
            arr[j] = 0;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.print("Enter length of List :: ");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        inputArray(arr);
        int k = removeDuplicates(arr); // k is number of unique elements
        // print array of unique elements
        System.out.print("Elements are ::");
        for (int i = 0; i<k; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
