/*
    Enter Elements of Array :: 
    2 9 3 5 9
    
            *                       *
            *                       *
            *                       *
            *                       *
            *               *       *
            *               *       *
            *       *       *       *
    *       *       *       *       *
    *       *       *       *       *
*/
package Arrays;
import java.util.Scanner;
public class BarChart {
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
        static void barChart(int arr[]) {
            // for finding max element for y axis range
            int max = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]>max) {
                    max = arr[i];
                }
            }
            for(int i=max; i>=1; i--) {
                for(int j=0; j<arr.length; j++) {
                    if(i<=arr[j]) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        System.out.print("Enter length of List :: ");
			int length = scanner.nextInt();
			int arr[] = new int[length];
			inputArray(arr);
            barChart(arr);
    }
}
