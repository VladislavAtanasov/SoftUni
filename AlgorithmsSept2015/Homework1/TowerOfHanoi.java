package Homework1;

import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {

	public static void moveDisks(int bottom, Stack<Integer> source, Stack<Integer> destination, Stack<Integer> spare){
		if (bottom < 1)
        {
            return;
        }
		else if (bottom == 1) {
			destination.push(source.pop());
			System.out.println("Disk " + bottom + " from " + source + " to " + destination);
		}
		else {
			moveDisks(bottom - 1, source, spare, destination);
			destination.push(source.pop());
			System.out.println("Disk " + bottom + " from " + source + " to " + destination);
			moveDisks(bottom - 1, destination, spare, source);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Stack<Integer> sour = new Stack<Integer>();
		for (int i = size; i > 0; i--) {
			sour.push(i);
		}
		Stack<Integer> dest = new Stack<Integer>();
		Stack<Integer> spar = new Stack<Integer>();
		moveDisks(size, sour, dest, spar);
		sc.close();
	}

}
