package Homework2;

import java.util.Scanner;

public class PermutationsIterrative {

	private static int num;
	private static int[] arr;
	private static int countPerm = 1;
	private static int i = 1;
	private static int[] perm;
	private static int j = 0;

	public static void findPerm(){
		printPerm();
		while (i < num) {
			perm[i]--;
			if (i % 2 != 0) {
				j = perm[i];
			}
			else{
				j = 0;
			}
			swap(j, i);
			i = 1;
			while (perm[i] == 0) {
				perm[i] = i;
				i++;
			}
			printPerm();
			countPerm++;
		}
	}
		
	private static void swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printPerm(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		arr = new int[num];
		perm = new int[num + 1];
		
		for (int i = 1; i <= num; i++) {
			arr[i - 1] = i;
		}
		
		for (int i = 0; i < perm.length; i++) {
			perm[i] = i;
		}
		findPerm();
		System.out.println("Total Permutations: " + countPerm);
		sc.close();
	}

}
