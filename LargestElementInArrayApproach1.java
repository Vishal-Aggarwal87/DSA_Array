/*
 *  Start with Finding the Largest Element in Array Problem ::
 *	Example: Given is an array {100,20,900,1000,555,22}, The Largest Element is 1000
 *	TC :: O(n)
 */

import java.util.Scanner;
public class LargestElementInArrayApproach1 {
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
	static int largestElementInArray(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.print("Enter length :: ");
		int length = scanner.nextInt();
		int arr[] = new int[length];
		inputArray(arr);
		System.out.println("Maximum Element :: " + largestElementInArray(arr));
		scanner.close();
	}
}
