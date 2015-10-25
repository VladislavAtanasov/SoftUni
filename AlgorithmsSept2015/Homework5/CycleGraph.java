package Homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CycleGraph {

	private static List<String> verteces;
	private static boolean[] visited;
	private static boolean hasCycle = false;
	
	public static void start(Map<String, ArrayList<String>> map, String start){
		visited = new boolean[verteces.size()];
		visited[verteces.indexOf(start)] = true;
		DFSSearching(map, start);
	}
	
	public static boolean DFSSearching(Map<String, ArrayList<String>> graph, String key){
		
		for (int i = 0; i < graph.get(key).size(); i++) {
			if (visited[verteces.indexOf(graph.get(key).get(i))]) {
				hasCycle = true;
				return hasCycle;
			}
			
			if (!visited[verteces.indexOf(graph.get(key).get(i))]) {
				visited[verteces.indexOf(graph.get(key).get(i))] = true;
				DFSSearching(graph, graph.get(key).get(i));
			}
			
		}
		
		return hasCycle;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		Map<String, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < rows + 1; i++) {
			String line = sc.nextLine();
			String[] splitted = line.split(" ");
			if (!map.containsKey(splitted[0])) {
				map.put(splitted[0], new ArrayList<String>());
			}
			if (line.length() > 1) {	
				map.get(splitted[0]).add(splitted[1]);
			}
		}
		verteces = new ArrayList<String>();
		System.out.println("Enter number of verteces ");
		int numVerteces = sc.nextInt();
		System.out.println("Enter verteces ");
		for (int i = 0; i < numVerteces; i++) {
			String v = sc.next();
			verteces.add(v);
		}
		System.out.println("Start vertex: ");
		String stV = sc.next();
		start(map, stV);
		System.out.println("Cycled:" + hasCycle);
		sc.close();
	}

}
