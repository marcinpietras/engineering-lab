package com.housegap.lab.eng.datastructure;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	
	private int value;
	
	private List<GraphNode> childs = new ArrayList<GraphNode>();

	public GraphNode(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public List<GraphNode> getChilds() {
		return childs;
	}

}
