package com.leon.tree;

public class BinaryTreeByPostAndIn {
	private Node root;

	public BinaryTreeByPostAndIn() {
		this.root = null;
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

	public void initTree(int[] preOrder, int[] inOrder) {
		this.root = this.initTree(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
	}

	private Node initTree(int[] preOrder, int start1, int end1, int[] inOrder, int start2, int end2) {
		if (start1 > end1 || start2 > end2) {
			return null;
		}
		int rootData=preOrder[start1];
		Node head=new Node(rootData);
		int rootIndex=findIndexInArray(inOrder, rootData,start2, end2);
		int offSet=rootIndex-start2-1;
		
		Node left=initTree(preOrder, start1+1, start1+1+offSet, inOrder, start2, start2+offSet);
		
		Node right=initTree(preOrder, start1+offSet+2, end1, inOrder, rootIndex+1, end2);
		
		head.left=left;
		head.right=right;
		return head;
	}

	private int findIndexInArray(int[] order, int rootData, int start, int end) {
		for (int i = start; i <= end; i++) {
			if (order[i] == rootData) {
				return i;
			}
		}
		return -1;
	}

}
