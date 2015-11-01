package Homework6;

import java.util.Scanner;
import Homework6.MST;

public class ExtendCableNetwork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		Graph graph = new Graph();
		for (int i = 0; i < digit; i++) {
			graph.addEdge(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		System.out.println("Budget: ");
		int bug = sc.nextInt();
		MST mstree = new MST(graph, bug);
		System.out.println("Budget used: " + (bug - MST.getNewBudget()));
		sc.close();
	}
	
}
