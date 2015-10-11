package Homework3;

import java.util.Random;

public class InsertionSort {

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
	
	private static void swap(int[] arr,int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
 	}
	
	public static int[] sort(int[] brr){
		for (int start = 1; start < brr.length; start++) {
			int i = start;
			while (i > 0 && brr[i-1] > brr[i]) {
				swap(brr, i-1, i);
				i--;
			}
		}
		return brr;
	}
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int [] arrToSort = InsertionSort.generateRandomArray();
		int[] sorted = InsertionSort.sort(arrToSort);
		long endTime = System.currentTimeMillis();
		double elapsed = (endTime - startTime)/1000.0;
		
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
		
		System.out.println("Time elapsed: " + elapsed);
	}

}
