public class BinarySearch{

	public static int binarySearch(int []arr, int key){
		int start = 0;
		int end = arr.length -1;
		int mid;

		while( start <= end ){
			mid = start - ( start -end ) / 2;
			if(key == arr[mid])
				return mid;
			else if( key < arr[mid])
				end = mid - 1;
			else 
				start = mid + 1;
		}

		return -1;
	}

	public static void main(String []args){
		int []array = {2, 4, 6, 8, 10, 12, 14};
		int key = 4;

		int index = binarySearch(array, key);

		System.out.println(index);

	}
}