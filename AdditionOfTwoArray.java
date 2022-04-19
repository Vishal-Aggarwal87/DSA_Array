package Arrays;

import java.util.Scanner;

public class AdditionOfTwoArray {
    static Scanner scanner = new Scanner(System.in);

    // input Array
    static void inputArray(int arr[][]) {
        System.out.println("Enter Elements of Array :: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }
    // print
    static void printArray(int arr[][]) {
        System.out.println("Resultant Array :: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    // logic
    static void additionOfArray(int arr1[][], int arr2[][], int rows, int cols) {
        int sum[][] = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        printArray(sum);
    }

    public static void main(String[] args) {
        System.out.print("Enter rows and cols of the matrix :: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];
        inputArray(arr1);
        inputArray(arr2);
        additionOfArray(arr1,arr2,rows,cols);
    }

}
