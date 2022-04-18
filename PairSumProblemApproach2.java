/*
In this Approach we use --> SortedArray + Two pointer approach 
TC :: O(n)
*/
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PairSumProblemApproach2 {
    static Scanner scanner = new Scanner(System.in);
    // input Array
    static void inputArray(int arr[]) {
        System.out.println("Enter Elements of Array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    // logic
    static void pairSum(int arr[], int sum) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == sum) {
                System.out.print("Pair :: " + arr[i] + ", " + arr[j]);
                return;
            }
            if (arr[i] + arr[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter length :: ");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        inputArray(arr);
        System.out.print("Enter value of sum :: ");
        int sum = scanner.nextInt();
        pairSum(arr, sum);
    }
}
