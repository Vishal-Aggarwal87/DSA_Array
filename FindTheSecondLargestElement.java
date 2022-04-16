/*
 *  Array as Input int arr[] = {10,20,3,20,19,15}; 
 *  							Output is 19
 *  
 *  Special Case ::
 *  int arr[] = {1000,1000,1000}; // no second largest
 */
import java.util.Scanner;

public class FindTheSecondLargestElement {
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
		static int secondLargestElementInArray(int arr[]) {
			int max = arr[0];
			int secondMax =0;
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]>max) {
					max=arr[i];
				}
				if(arr[i]!=max && arr[i]>secondMax) {
					secondMax = arr[i];
				}
			}
			return secondMax; 
		}
		public static void main(String[] args) {
			System.out.print("Enter length of List :: ");
			int length = scanner.nextInt();
			int arr[] = new int[length];
			inputArray(arr);
			System.out.println("Second Maximum Element :: " + secondLargestElementInArray(arr));
			scanner.close();
		}
}
