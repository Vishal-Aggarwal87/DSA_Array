package Arrays;
import java.util.Scanner;
public class SortedArrayCheck {
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
    static boolean isArraySorted(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1]>arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter length :: ");
		int length = scanner.nextInt();
		int arr[] = new int[length];
		inputArray(arr);
        if(isArraySorted(arr)) {
            System.out.println("Array is Sorted.");
        }
        else {
            System.out.println("Array is not Sorted.");
        }
    }
}
