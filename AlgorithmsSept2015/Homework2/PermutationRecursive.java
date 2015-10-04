package Homework2;

import java.util.Scanner;

public class PermutationRecursive {

	private static int num;
	private static int[] arr;
	private static int countPerm = 0;
	
	public static void findPerm(int index){
		if (index >= num - 1) {
			printPerm();
			countPerm ++;
			return;
		}
		
		for (int i = index; i < num; i++) {
			swap(index, i);
			findPerm(index + 1);
			swap(i, index);
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
		for (int i = 1; i <= num; i++) {
			arr[i - 1] = i;
		}
		findPerm(0);
		System.out.println("Total Permutations: " + countPerm);
		sc.close();
	}

}
