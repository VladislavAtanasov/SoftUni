package Homework3;

import java.util.Arrays;
import java.util.Random;

public class FisherYatesShuffle {

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
	
	public static void shuffle(int[] sorted){
		Random rd = new Random();
		int len = sorted.length;
		
		for (int i = 0; i < len; i++) {
			int randomIndex = i + rd.nextInt(len - i);
			
			int temp = sorted[randomIndex];
			sorted[randomIndex] = sorted[i];
			sorted[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] newarr = generateRandomArray();
		Arrays.sort(newarr);
		shuffle(newarr);
		
		for (int i = 0; i < newarr.length; i++) {
			System.out.println(newarr[i]);
		}
	}

}
