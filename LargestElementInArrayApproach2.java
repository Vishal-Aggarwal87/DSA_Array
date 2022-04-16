/*
 *  Start with Finding the Largest Element in Array Problem ::
 *	Example: Given is an array {100,20,900,1000,555,22}, The Largest Element is 1000
 *  {Brute Force Approach of this problem}
 *  TC :: O(n*n)
 */
import java.util.Scanner;
public class LargestElementInArrayApproach2 {
	static Scanner scanner = new Scanner(System.in);
	// inputing Array
	static void inputArray(int arr[])
	{
		System.out.println("Enter Elements of Array :: ");
		for(int i=0; i<arr.length; i++ )
		{
			arr[i] = scanner.nextInt();
		}
	}
	 /*
    In this Approach Compare all the Elements One By One with all 
    Elements if any next element comes greater than exit and 
    choose the next element and compare the same with all and 
    repeat the process
    */
	static void largestElementInArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			boolean isMax = true;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					isMax = false;
					break;
				}
			}
			if(isMax){
                System.out.println("Largest Element :: " +arr[i]);
				return;
            }
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter length :: ");
		int length = scanner.nextInt();
		int arr[] = new int[length];
		inputArray(arr);
		largestElementInArray(arr);
		scanner.close();
	}
}
