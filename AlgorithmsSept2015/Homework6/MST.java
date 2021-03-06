package Homework6; 

import java.util.LinkedList;
import java.util.List;

public class MST {
	
	private Graph graph;
	private int totalWeight;
	private boolean[] visited;
	private List<Edge> mst;
	private Heap<Edge> minHeap;
	static int newBudget;
	
	public MST(Graph g, int budget){
		graph = g;
		minHeap = new Heap<Edge>();
		totalWeight = 0;
		visited = new boolean[graph.vertexCount() + 1];
		mst = new LinkedList<Edge>();
		
		visitVertex(graph.getVerteces().iterator().next());
		
		while(minHeap.size() != 0){
			Edge minEdge = minHeap.remove();
			int vertex1 = minEdge.either();
			int vertex2 = minEdge.other(vertex1);
			
			if (visited[vertex1] && visited[vertex2]) {
				continue;
			}
			
			mst.add(minEdge);
			totalWeight += minEdge.getWeight();
			if (budget - minEdge.getWeight() >= 0) {
				budget -= minEdge.getWeight();
				newBudget = budget;
				System.out.println("{" + vertex1 + ", " + vertex2 + "}" + " -> " + minEdge.getWeight());
			} else {
				break;
			}
			
			
			if (!visited[vertex1]) {
				visitVertex(vertex1);
			}
			
			if (!visited[vertex2]) {
				visitVertex(vertex2);
			}
		}
	}
	
	private void visitVertex(int vertex){
		visited[vertex] = true;
		for(Edge edge : graph.getEdgesFromVertex(vertex))
			if(!visited[edge.other(vertex)]){
				minHeap.insert(edge);
			}
	}
	
	public int totalWeight(){
		return totalWeight;
	}
	
	public List<Edge> getMst(){
		return mst;
	}

	public static int getNewBudget() {
		return newBudget;
	}
}
