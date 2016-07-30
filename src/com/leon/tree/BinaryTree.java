package com.leon.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	public Node root;

	public BinaryTree() {
		this.root = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent = null;
			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void buildTree(int[] data) {
		for (int i = 0; i < data.length; i++) {
			insert(data[i]);
		}
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}

	public void inOrder() {
		this.inOrder(this.root);
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void preOrder() {
		this.preOrder(this.root);
	}

	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "  ");
		}
	}

	public void postOrder() {
		this.postOrder(this.root);
	}

	public void layerTranverse() {
		if (this.root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(this.root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.print(n.data + "  ");
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
		}
	}

	private int maxLen = 0;

	public int getMaxLen() {
		return maxLen;
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}

	public void findMaxDis(Node root) {
		if (root == null) {
			return;
		}
		if (root.left == null) {
			root.leftMaxDis = 0;
		}
		if (root.right == null) {
			root.rightMaxDis = 0;
		}
		if (root.left != null) {
			findMaxDis(root.left);
		}
		if (root.right != null) {
			findMaxDis(root.right);
		}
		if (root.left != null) {
			root.leftMaxDis = max(root.left.leftMaxDis, root.left.rightMaxDis) + 1;
		}
		if (root.right != null) {
			root.rightMaxDis = max(root.right.rightMaxDis, root.right.leftMaxDis) + 1;
		}
		if (root.leftMaxDis + root.rightMaxDis > maxLen) {
			maxLen = root.leftMaxDis + root.rightMaxDis;
		}

	}
}
