package Homework3;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	private final static int arrayCapacity = 10000;	
	private static int intervalNumbers = 3000;
	
	public static int[] generateRandomArray(){
	        int array[] = new int[arrayCapacity];
	        Random random = new Random();
	        
	        for (int i = 0; i < array.length; i++) {
	            array[i] = random.nextInt(intervalNumbers);
	        }
	        
	        return array;
	    }
	
	
	public static int[] mergeSort(int[] arr){
		int len = arr.length;
		if (len <= 1) {
			return arr;
		}
		int middle = len/2;
		
		int[] left = Arrays.copyOfRange(arr, 0, middle);
		int[] right = Arrays.copyOfRange(arr, middle, len - 1);
		left = mergeSort(left);
		right = mergeSort(right);
		
		return merge(left, right);
	}
	
	private static int[] merge(int[] left, int[] right) {
		int[] temp = new int[left.length + right.length];

		int leftMin = 0;
		int rightMin = 0;
		int tempIndex = 0;
		
		while (leftMin < left.length && rightMin < right.length) {
			if (left[leftMin] >= right[rightMin]) {
				temp[tempIndex] = right[rightMin];
				rightMin++;
			}
			else{
				temp[tempIndex] = left[leftMin];
				leftMin++;
			}
			tempIndex++;
		}
		
		while (leftMin < left.length) {
			temp[tempIndex++] = left[leftMin++];
		}
		
		while (rightMin < right.length) {
			temp[tempIndex++] = right[rightMin++];
		}
		
		return temp;
	}
	public static void main(String[] args) {
		int[] arrToSort = generateRandomArray();
		long start = System.currentTimeMillis();
		int[] result = mergeSort(arrToSort);
		long end = System.currentTimeMillis();
		double time = (end - start)/1000.0;
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("Time Elapsed: " + time);
	}

}
