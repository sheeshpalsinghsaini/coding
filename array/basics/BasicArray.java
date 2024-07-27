
import java.util.Arrays;
import java.util.Scanner;
public class BasicArray{

	public static void main(String []args){

		// creating array: predefine array

		Integer []array = {1,2,3,4,5,6};
		// System.out.print(array);	// will print reference of array

		printArray(array);
		System.out.println();
		printArray02(array);
		System.out.println();
		// taking input from user 
		Integer size;
		System.out.println("Enter size of array :");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		// creating array 
		Integer []arr = new Integer[size];
		System.out.println("Enter "+size+" array elements : ");
		// taking input in array 

		for(int i=0; i<size; i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Your Entered number is : ");
		printArray(arr);


	}

// print using array for each loop
	public static void printArray(Integer []array){
		for(Integer item: array){
			System.out.print(item+" ");
		}
	}

	// print using collection framework stream api
	public static void printArray02(Integer []array){
		Arrays.asList(array).forEach(item -> System.out.print(item+" "));
	}
}