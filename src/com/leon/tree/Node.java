package com.leon.tree;

public class Node {
	public int data;
	public Node left;
	public Node right;
	public int leftMaxDis;
	public int rightMaxDis;
	
	public Node(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}
}
