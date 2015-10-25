package Homework5;

import java.util.Scanner;

public class FindingComponents {

	private static int areas;
	
	public static int findComponents(String[][] matrix, String symbol){
		int countComponents = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j].equals(symbol)) {
					traverse(matrix, i, j, symbol);
					countComponents++;
				}
			}
		}
		areas += countComponents;
		
		return countComponents;
	}
	
	private static void traverse(String[][] graph, int row, int col, String symb){
		if (row >= graph.length || row < 0 || col >= graph[row].length || col < 0) {
			return;
		}
		
		if (!graph[row][col].equals(symb)) {
			return;
		}
		
		if (graph[row][col].equals(symb)) {
			graph[row][col] = " ";
			traverse(graph, row, col - 1, symb);
			traverse(graph, row, col + 1, symb);
			traverse(graph, row - 1, col, symb);
			traverse(graph, row + 1, col, symb);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeRow = sc.nextInt();
		int sizeCol = sc.nextInt();
		String[][] table = new String[sizeRow][sizeCol];
		for (int i = 0; i < sizeRow; i++) {
			String line = sc.nextLine();
			table[i] = line.split(" ");
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		String a = "a", b = "b", c = "c", d = "d";
		System.out.println("Symbol " + a + " -> " + findComponents(table, a));
		System.out.println("Symbol " + b + " -> " + findComponents(table, b));
		System.out.println("Symbol " + c + " -> " + findComponents(table, c));
		System.out.println("Symbol " + d + " -> " + findComponents(table, d));
		System.out.println("Total areas: " + areas);
		sc.close();
	}

}
