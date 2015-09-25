package Homework1;

public class ConnectedAreas {

	private static char[][] area = {{' ', ' ', ' ', '*', ' ', ' ', ' ', '*', ' '},
			{' ', ' ', ' ', '*', ' ', ' ', ' ', '*', ' '},
			{' ', ' ', ' ', '*', ' ', ' ', ' ', '*', ' '},
			{' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' '}
			};
	private static int countCells = 0;
	
	public static void startFrom(){
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[0].length; j++) {
				if (area[i][j] == ' ') {
					findPaths(i, j);
					System.out.println("Starting point at (" + i + ", " + j +"), size: " + countCells);
					countCells = 0;
				}
			}
		}
	}
	
	public static void findPaths(int row, int col){
		if ((row < 0) || (col < 0) || (row >= area.length) || (col >= area[0].length)) {
			return;
		}
		
		if (area[row][col] == ' ') {
			area[row][col] = 's';
			countCells++;
			findPaths(row, col - 1);
			findPaths(row - 1, col);
			findPaths(row, col + 1);
			findPaths(row + 1, col);
			
		}
	}
	
	public static void main(String[] args) {
		startFrom();
	}

	
	
}
