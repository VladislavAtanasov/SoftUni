package Homework1;

import java.util.Scanner;

public class LoopsToRecursion {
	
	private static int numberOfLoops;
	private static int[] arr;
	
	
	public static void doLoops(int current){
		if (current == numberOfLoops) {
			printLoops();
			return;
		}
		for (int i = 1; i <= numberOfLoops; i++) {
			arr[current] = i;
			doLoops(current + 1);
		}
	}
	
	public static void printLoops(){
		for (int i = 0; i < numberOfLoops; i++) {
			System.out.print(String.format("%s ", arr[i]));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		numberOfLoops = sc.nextInt();
		arr = new int[numberOfLoops];
		doLoops(0);
		sc.close();
	}
}
