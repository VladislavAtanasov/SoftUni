package Homework2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Subsets {

	private static int numberOfLoops;
	private static int numberOfIterations;
	private static int[] arr;
	private static String[] names;
	
	public static void doLoops(int current){
		if (current == numberOfIterations) {
			printLoops();
			return;
		}
		for (int i = 1; i <= numberOfLoops; i++) {
			arr[current] = i;
			doLoops(current + 1);
		}
	}
	
	public static void printLoops(){
		if (isArrValid(arr)) {
			for (int i = 0; i < numberOfIterations; i++) {
				System.out.print(String.format("%s ", names[arr[i]]));
			}
		System.out.println();
		}
	}
	
	private static boolean isArrValid(int [] array){
		boolean isValid = true;
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (set.add(array[i]) == false) {
				isValid = false;
			}
		}
		return isValid;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean validInput = false;
		while(!validInput){
		numberOfLoops = sc.nextInt();
		numberOfIterations = sc.nextInt();
			if (numberOfLoops >= numberOfIterations) {
				arr = new int[numberOfLoops];
				names = new String[numberOfLoops + 1];
				for (int i = 1; i < names.length; i++) {
					names[i] = sc.next();
				}
				doLoops(0);
				validInput = true;
			}
			else{
				System.out.println("Wrong input. Try Again.");
			}
		}
		sc.close();
	}
}
