/*
 * The diff b/w min and max element of an array is called as span of an array.
 */
import java.util.Scanner;
public class SpanOfArray {
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
	// span of array logic
	static int spanOfArray(int arr[]) {
		int max = 0;
		int min =  Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return max-min;
	}
	public static void main(String[] args) {
		System.out.print("Enter length of List :: ");
		int length = scanner.nextInt();
		int arr[] = new int[length];
		inputArray(arr);
		System.out.println("Span of Array :: " + spanOfArray(arr));
	}

}
