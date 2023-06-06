package BreadthFirstSearch;

import AdjacencyMatrix.Graph;
import AdjacencyMatrix.Node;

public class Main {
	//BFS = a search algorithm for traversing
	//		a tree or graph data structure
	// This is done one "level" at a time
	// rather than one branch at a time
	
	public static void main(String[] args) {
Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 1);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		
		
		graph.print();
		//graph.breadthFirstSearch(1);
		
		//System.out.println(graph.checkEdge(0, 1));
		//System.out.println(graph.checkEdge(3, 2));
		
	}

}
