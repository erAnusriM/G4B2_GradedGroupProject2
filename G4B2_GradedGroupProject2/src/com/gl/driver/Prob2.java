package com.gl.driver;

import com.gl.services.TreeImplementation;
import com.gl.services.Node;

public class Prob2 {
	public Node node;

	// Driver Code
	public static void main(String[] args) {
		Prob2 p2 = new Prob2();
		p2.node = new Node(50);
		p2.node.left = new Node(30);
		p2.node.right = new Node(60);
		p2.node.left.left = new Node(10);
		p2.node.right.left = new Node(55);

		TreeImplementation.flattenBTToSkewed(p2.node);
		Node headNode = TreeImplementation.headNode;
		TreeImplementation.traverseRightSkewed(headNode);
	}
}