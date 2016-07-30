package com.leon.tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree biTree = new BinaryTree();
		int[] data = { 2, 8, 7, 4, 9, 3, 1, 6, 7, 5 };
		biTree.buildTree(data);
//		biTree.inOrder();
//		biTree.preOrder();
//		biTree.postOrder();
//		biTree.layerTranverse();
		biTree.findMaxDis(biTree.root);
		System.out.println(biTree.getMaxLen());
//		BinaryTreeByPostAndIn binaryTree=new BinaryTreeByPostAndIn();
//		int[] preOrder={1,2,4,8,9,5,10,3,6,7};
//		int[] inOrder={8,4,9,2,10,5,1,6,3,7};
//		
//		binaryTree.initTree(preOrder, inOrder);
//		
//		binaryTree.postOrder();
	}
}
