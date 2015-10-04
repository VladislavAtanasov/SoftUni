package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationWithRepetition {
	private static int num;
	private static int[] arr;
	
	public static void findPerm(int start, int end){
		printPerm();
		
		for (int left = end - 1; left >= start; left--) {
			for (int right = left + 1; right <= end; right++) {
				if (arr[left] != arr[right]) {
					swap(left, right);
					findPerm(left + 1, end);
				}
			}
			int first = arr[left];
			for (int i = left; i <= end - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[end] = first;
		}
	}
	
	private static void swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void printPerm(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		findPerm(0, arr.length - 1);
		sc.close();
	}

}
