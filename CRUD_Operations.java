
import java.util.Scanner;

public class CRUD_Operations {
	int arr[];
	int currentSize;
	CRUD_Operations(int maxCapacity) {
		this.arr = new int[maxCapacity];
		currentSize = 0;
	}
	// 1.insert operation
	void insert(int value, int index)
	{
		if(currentSize==arr.length) {
			 //throw new RuntimeException("Array Full");
			System.out.println("Array Full Can't Add ");
            return;
		}
		if(index>currentSize) {
			//throw new RuntimeException("Position can't be greater than currentSize");
			System.out.println("Position can't be greater than length of array.");
			return;
		}
		for(int i=currentSize-1; i>=index; i--)
		{
			arr[i+1] = arr[i];
		}
		arr[index] = value;
		currentSize++;
		System.out.println("Element Added Successfully...");
	}
	// 2.Remove operation
	void remove(int index)
	{
		if(currentSize==0)
		{
			//throw new RuntimeException("Array is Empty !");
			System.out.println("Array is already Empty.");
			return;
		}
		if(index>currentSize) {
			//throw new RuntimeException("Position can't be greater than currentSize");
			System.out.println("Position can't be greater than currentSize");
			return;
		}
		for(int i=index; i<currentSize-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[currentSize-1] = 0;
		currentSize--;
		System.out.println("Element Deleted Successfully...");
	}
	//3.Display
	void print() {
		if(currentSize == 0)
		{
			System.out.println("Array is Empty...");
			return;
		}
		System.out.print("Elements are :: ");
		for(int i=0; i<currentSize; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
//		 for(int element: arr){
//	            System.out.print(" " + element);
//	        }
	}
	// 4.Search operation
	int search(int searchValue) {
		int index = -1;
		if(currentSize == 0)
		{
			System.out.println("Array is Empty...");
			return index;
		}
		for(int i=0; i<currentSize; i++)
		{
			if(arr[i] == searchValue) {
				index = i;
				break;
			}
		}
		return index;	
	}
	// 5. Update operation
	void update(int oldValue, int newValue) {
		if(currentSize == 0)
		{
			System.out.println("Array is Empty...");
			return;
		}
		int index = search(oldValue);
		if(index==-1)	
		{
			System.out.println("Given Element not Exists.");
			return;
		}
		arr[index] = newValue;	
		System.out.println("Array Value Updated...");
	}
	public static void main(String[] args) {
		CRUD_Operations opr = new CRUD_Operations(10);
		Scanner scanner = new Scanner(System.in);
		int index, value;
		while(true){
	        System.out.println("\tArray Operations");
	        System.out.println("1. Array Insert at Specific Position");
	        System.out.println("2. Array Delete From Specific Position");
	        System.out.println("3. Search in Array");
	        System.out.println("4. Update the Array");
	        System.out.println("5. Print the Array");
	        System.out.println("6. Exit");  
	        System.out.print("Enter the Choice : ");
	        int choice = scanner.nextInt();
	        switch(choice)
	        {
	        case 1:
                System.out.print("Enter the Index : ");
                index = scanner.nextInt();
                System.out.print("Enter the Value : ");
                value = scanner.nextInt();
                opr.insert(value, index);
                break;
            case 2:
                System.out.print("Enter the Index Where you want to Remove the Value : ");
                index = scanner.nextInt();
                opr.remove(index);
                break;
            case 3:
                System.out.println("Enter the Value to Search : ");
                value = scanner.nextInt();
                opr.search(value);
                break;
            case 4:
                System.out.print("Enter the Value which you want to Update : ");
                value = scanner.nextInt();
                System.out.print("Enter the Updated Value : ");
                int newValue = scanner.nextInt();  
                opr.update(value, newValue);
                break;         
            case 5:
                opr.print();
                break;
            case 6:
                return ;
             default:
                System.out.println("Wrong Choice...");
	        }
	        System.out.println("***************************************");
		}
	}
}
