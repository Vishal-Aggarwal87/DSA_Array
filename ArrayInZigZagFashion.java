/**
 * Given an array of DISTINCT elements, rearrange the elements of array in zig-zag fashion in O(n) time. 
 * The converted array should be in form :: a < b > c < d > e < f.
 * Hint :: every odd-indexed element is greater than adjacent elements
 * 			ie. A[0] < A[1] > A[2] < A[3] > A[4] < ...

	Input: arr[] = {4, 3, 7, 8, 6, 2, 1}
	Output: arr[] = {3, 7, 4, 8, 2, 6, 1}

	Input: arr[] = {1, 4, 3, 2}
	Output: arr[] = {1, 4, 2, 3}
 */
package Arrays;

import java.util.Scanner;

public class ArrayInZigZagFashion {
	static Scanner scanner = new Scanner(System.in);

	// input Array
	static void inputArray(int arr[]) {
		System.out.println("Enter Elements of Array :: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
	}

	// swapping logic
	static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	// logic of zigZag fashion
	static void arrayInZigZagFashion(int arr[]) {
		// Flag true indicates relation "<" is expected,
		// else ">" is expected. The first expected relation
		// is "<"
		boolean flag = true;
		for (int i = 0; i <= arr.length - 2; i++) {
			if (flag) /* "<" relation expected */
			{
				/*
				 * If we have a situation like A > B > C,
				 * we get A > B < C by swapping B and C
				 */
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}

			} else /* ">" relation expected */
			{
				/*
				 * If we have a situation like A < B < C,
				 * we get A < C > B by swapping B and C
				 */
				if (arr[i] < arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			flag = !flag; /* flip flag */
		}
	}

	// displaying array
	static void display(int arr[]) {
		System.out.print("Array in Zig Zag Form ::");
		for (int elements : arr) {
			System.out.print(" " + elements);
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter length of first Array :: ");
		int length = scanner.nextInt();
		int arr[] = new int[length];
		inputArray(arr);
		arrayInZigZagFashion(arr);
		display(arr);
	}
}
