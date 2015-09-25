package Homework1;

public class PathsInLabyrinth {

	private static char[][] area = {{' ', ' ', ' ', ' '},
			 {' ', '*', '*', ' '},
			 {' ', '*', '*', ' '},
			 {' ', '*', 'e', ' '},
			 {' ', ' ', ' ', ' '}
			};
	private static char[] path = new char[area[0].length*area.length];
	private static int numPaths = 0;
	private static int position = 0;
	
	public static void findPaths(int row, int col, char direction){
		if ((row < 0) || (col < 0) || (row >= area.length) || (col >= area[0].length)) {
			return;
		}
		path[position] = direction;
		position++;
		if (area[row][col] == 'e') {
			numPaths++;
			printPaths(path, 1, position - 1);
			System.out.println("You found the exit");
		}
		if (area[row][col] == ' ') {
			area[row][col] = 's';
			findPaths(row, col - 1, 'L');
			findPaths(row - 1, col, 'U');
			findPaths(row, col + 1, 'R');
			findPaths(row + 1, col, 'D');
			
			area[row][col] = ' ';
		}
		position--;
	}
	
	private static void printPaths(char[] pat, int start, int end){
		for (int i = start; i <= end; i++) {
			System.out.print(pat[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		findPaths(0, 0, 's');
		System.out.println("Number of found ways: " + numPaths);
	}

}
