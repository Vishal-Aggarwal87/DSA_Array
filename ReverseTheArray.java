/*
    Approach :: Two Pointer Approach
    The TimeComplexity of the Solution would be n/2 which is O(n) and Space Complexity would be O(1).
*/
package Arrays;

import java.util.Scanner;

public class ReverseTheArray {
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
    static void reverseTheArray(int arr[]) {
        int i=0, j=arr.length-1;
        while(i<j) {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
    }
    // print Array 
    static void printArray(int arr[]) {
        System.out.print("List ::");
        for(int i=0; i<arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter length :: ");
		int length = scanner.nextInt();
		int arr[] = new int[length];
		inputArray(arr);
        reverseTheArray(arr);
        printArray(arr);
    }
    
}
