/*
In this we use extra space for storing unique elements
SC :: O(n)
*/
package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayApproach1 {
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
        //logic
        static void removeDuplicates(int arr[]) {
            int uniqueElements[] = new int[arr.length];
            int k=0;
            uniqueElements[k++] = arr[0];
            for(int i=0; i<arr.length-1; i++) {
                if(arr[i]!=arr[i+1]) {
                    uniqueElements[k++]=arr[i+1];
                }
            }
            // System.out.println("Number of Unique Elements = " + k);

            //print unique elements
            System.out.print("Elements are ::");
            for(int i=0; i<k; i++) {
                System.out.print(" " + uniqueElements[i]);
            }
        }
    public static void main(String[] args) {
        System.out.print("Enter length of List :: ");
			int length = scanner.nextInt();
			int arr[] = new int[length];
			inputArray(arr);
            removeDuplicates(arr);
    }
}
