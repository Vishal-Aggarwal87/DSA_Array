/*
 * An element is called LEADER if it is greater than all the elements to its right side, 
 * note that the rightmost element is always a leader.
 * For example in the array {12, 27, 14, 11, 25, 6, 7}, leaders are 27, 25 and 7.
 */
package Arrays;
import java.util.Scanner;
public class LeaderElement {
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
	static int findLeaderElement(int arr[])
	{
		int n = arr.length;
		int count=0;
        System.out.println("Leader Elements are :: ");
		System.out.println(arr[n-1]);
		count++;
		int j=n-1;
		for(int i=n-2; i>0; i--)
		{
			if(arr[i]>arr[j]) {
				System.out.println(arr[i]);
				count++;
				j=i;
			}
		}
        return count;
	}
	public static void main(String[] args) {
		System.out.print("Enter length :: ");
		int length = scanner.nextInt();
		int arr[] = new int[length];
		inputArray(arr);
        System.out.println("Total Number Of Leader Elements :: " + findLeaderElement(arr));
	}
}
