public class ReverseArray{

	public static void reverseArray(int []numbers){
		int start = 0;
		int end = numbers.length - 1;

		while( start < end ){
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
	}


	public static void main(String []args){
		int []numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printArray(numbers);
		reverseArray(numbers);
		printArray(numbers);

	}

	public static void printArray(int []numbers){
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
	}
}