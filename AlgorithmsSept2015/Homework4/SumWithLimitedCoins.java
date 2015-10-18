package Homework4;

import java.util.Scanner;

public class SumWithLimitedCoins {
	private static int[] coins = {1, 2, 5, 10, 20, 50, 100};
	
	public static int sums(int n){
		int[] arr = new int[n + 1];
		arr[0] = 1;
		for(int j = 0; j < coins.length; j++){
			for (int i = coins[j]; i <= n; i++) {
				arr[i] += arr[i - coins[j]];
			}
		}
		return arr[n];
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sums(sc.nextInt()));
		sc.close();
	}
}
