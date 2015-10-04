package Homework2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CombinationIterative {

	private static int[] pool;

	public static void findComb(int length, int k){

	  int[] indexes = new int[k];

	  int pMax = pool.length;  
	  while (indexes[0] < pMax){ 
		  if (!isValid(indexes)) {
			  for (int i = 0; i < k; i++){
				  System.out.print(pool[indexes[i]] + " ");
			  }
			  System.out.println(); 
		  }
		  indexes[k-1]++; 
		  for (int i = k-1; indexes[i] == pMax && i > 0; i--){ 
			  indexes[i-1]++;
			  indexes[i] = 0; 
		  }     
	  }
	}
	
	private static boolean isValid(int[] array){
		Set<Integer> lump = new HashSet<Integer>();
		  for (int i : array)
		  {
		    if (lump.contains(i)) return true;
		    lump.add(i);
		  }
		  return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ki = sc.nextInt();
		pool = new int[n];
		for (int i = 1; i <= pool.length; i++) {
			pool[i - 1] = i;
		}
		findComb(n, ki);
		sc.close();
	}

}
