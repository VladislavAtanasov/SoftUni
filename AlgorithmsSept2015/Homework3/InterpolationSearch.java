package Homework3;

import java.util.Arrays;
import java.util.Random;

public class InterpolationSearch {

	private final static int arrayCapacity = 30;	
	private static int intervalNumbers = 50;
	public static int[] generateRandomArray(){
	        int array[] = new int[arrayCapacity];
	        Random random = new Random();
	        
	        for (int i = 0; i < array.length; i++) {
	            array[i] = random.nextInt(intervalNumbers);
	        }
	        
	        return array;
	}
	
	public static int search(int[] arr, int key){
		int left = 0;
		int right = arr.length - 1;
		while (arr[left] <= key && arr[right] >= key) {
			int mid = left + ((key - arr[left]) * (right - left)) / (arr[right] - arr[left]);
			
			if (arr[mid] < key) {
				left = mid + 1;
			}
			
			else if (arr[mid] > key) {
				right = mid - 1;
			}
			else {
				return mid;
			}
		}
		if (key == arr[left]) return left;
		else return -1;
	}
	
	public static void main(String[] args) {
		int[] randomArr= generateRandomArray();
		Arrays.sort(randomArr);
		int key = 21;
		System.out.println(search(randomArr, key));
		System.out.println();
		for (int i = 0; i < randomArr.length; i++) {
			System.out.println(randomArr[i]);
		}
	}

}
