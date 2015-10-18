package Homework4;

import java.util.Scanner;

public class BinominalCoeficents {
	
	public static int findBiCoeficent(int n, int k){
		if (k == 0) {
			return 1;
		}
		int num = 1, denum = 1;
		for (int i = n, j = 1; i > k && j <= n- k; i--, j++) {
			num *= i;
			denum *= j;
		}
		return num/denum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int denom = sc.nextInt();
		System.out.println(findBiCoeficent(num, denom));
		sc.close();
	}

}
