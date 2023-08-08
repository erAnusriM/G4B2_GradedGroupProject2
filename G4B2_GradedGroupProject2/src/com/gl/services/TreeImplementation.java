package com.gl.services;

public class TreeImplementation {

	static Node prevNode = null;
	public static Node headNode = null;

	public static void flattenBTToSkewed(Node root) {
		if (root == null) {
			return;
		}

		flattenBTToSkewed(root.left);
		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		flattenBTToSkewed(rightNode);
	}

	// Function to traverse the right
	// skewed tree using recursion
	public static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
}
