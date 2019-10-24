package com.housegap.lab.eng.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Graph {

	public static void main(String[] args) {
		Graph graph = new Graph();
		System.out.println("Explore nodes DFS: " + graph.exploreGraphDepthFirst(graph.createGraph()));
		System.out.println("Explore nodes BFS: " + graph.exploreGraphBreadthFirst(graph.createGraph()));
		
		System.out.println("Search 5 DFS: " + graph.searchGraphDepthFirst(graph.createGraph(), 5));
		System.out.println("Search 5 BFS: " + graph.searchGraphBreadthFirst(graph.createGraph(), 5));
		
		System.out.println("Search 7 DFS: " + graph.searchGraphDepthFirst(graph.createGraph(), 7));
		System.out.println("Search 7 BFS: " + graph.searchGraphBreadthFirst(graph.createGraph(), 7));
		
		System.out.println("Search 8 DFS: " + graph.searchGraphDepthFirst(graph.createGraph(), 8));
		System.out.println("Search 8 BFS: " + graph.searchGraphBreadthFirst(graph.createGraph(), 8));

	}
	
	private GraphNode createGraph() {		
		GraphNode node7 = new GraphNode(7);
		
		GraphNode node6 = new GraphNode(6);
		node6.getChilds().add(node7);
		GraphNode node5 = new GraphNode(5);
		node5.getChilds().add(node7);
		GraphNode node4 = new GraphNode(4);
		node4.getChilds().add(node7);
		
		GraphNode node3 = new GraphNode(3);
		node3.getChilds().add(node5);
		node3.getChilds().add(node6);
		
		GraphNode node2 = new GraphNode(2);
		node2.getChilds().add(node4);
		
		GraphNode node1 = new GraphNode(1);
		node1.getChilds().add(node2);
		node1.getChilds().add(node3);
		
		return node1;
	}
	
	public List<Integer> exploreGraphDepthFirst(GraphNode home) {
		List<Integer> visited = new ArrayList<Integer>();
		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.add(home);
		while(!stack.empty()) {
			GraphNode node = stack.pop();
			if (!visited.contains(node.getValue())) {
				visited.add(node.getValue());
			}
			stack.addAll(node.getChilds());
		}
		
		return visited;
	}
	
	public List<Integer> exploreGraphBreadthFirst(GraphNode home) {
		List<Integer> visited = new ArrayList<Integer>();
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(home);
		while(!queue.isEmpty()) {
			GraphNode node = queue.poll();
			if (!visited.contains(node.getValue())) {
				visited.add(node.getValue());
			}
			queue.addAll(node.getChilds());
		}
		
		return visited;
	}
	
//	public List<Integer> findPathGraphDepthFirst(GraphNode home) {
//		Stack<GraphNode> path = new Stack<GraphNode>();
//		List<Integer> visited = new ArrayList<Integer>();
//		Stack<GraphNode> stack = new Stack<GraphNode>();
//		stack.add(home);
//		while(!stack.empty()) {
//			GraphNode node = stack.pop();
//			path.add(node);
//			if (!visited.contains(node.getValue())) {
//				visited.add(node.getValue());
//			}
//			stack.addAll(node.getChilds());
//		}
//		
//		return visited;
//	}
	
	public int searchGraphDepthFirst(GraphNode home, int value) {
		List<Integer> visited = new ArrayList<Integer>();
		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.add(home);
		while(!stack.empty()) {
			GraphNode node = stack.pop();
			if (node.getValue() == value) {
				return value;
			}
			if (!visited.contains(node.getValue())) {
				visited.add(node.getValue());
			}
			stack.addAll(node.getChilds());
		}
		
		return -1;
	}
	
	public int searchGraphBreadthFirst(GraphNode home, int value) {
		List<Integer> visited = new ArrayList<Integer>();
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(home);
		while(!queue.isEmpty()) {
			GraphNode node = queue.poll();
			if (node.getValue() == value) {
				return value;
			}
			if (!visited.contains(node.getValue())) {
				visited.add(node.getValue());
			}
			queue.addAll(node.getChilds());
		}
		return -1;
	}

}
