/*
Given an Array , 
find any pair whose sum is equal to K. 
e.g {2, 9, 4, 3, 1 ,10, 6} 
    K = 9 Output 6,3 
e.g K = 5 Output 1, 4

Approach :: TC -- O(n^2)
*/
package Arrays;

import java.util.Scanner;

public class PairSumProblemApproach1 {
    static Scanner scanner = new Scanner(System.in);
	// input Array
	static void inputArray(int arr[])
	{
		System.out.println("Enter Elements of Array :: ");
		for(int i=0; i<arr.length; i++ )
		{
			arr[i] = scanner.nextInt();
		}
	}

    // logic 
    static void pairSum(int arr[], int sum) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.print("Pair :: " + arr[i] + ", " + arr[j]);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter length :: ");
		int length = scanner.nextInt();
		int arr[] = new int[length];
		inputArray(arr);
        System.out.print("Enter the value of sum :: ");
        int sum = scanner.nextInt();
        pairSum(arr,sum);
    }
}
