package com.leon.linklist;

public class Main {
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.addNode(5);
		list.addNode(3);
		list.addNode(1);
		list.addNode(3);
		list.addNode(2);
		System.out.println("len of list:"+list.length());
		list.printList();
//		list.orderList();
//		System.out.println("------排序后-----------");
//		list.printList();
//		System.out.println("------删除重复节点后---------");
//		list.deleteDuplecate(list.head);
//		list.printList();
//		System.out.println("------寻找倒数第k个元素-------");
//		System.out.println(list.findElem(list.head, 1).data);
//		System.out.println("------反转-------");
//		list.reverseList(list.head);
//		list.printList();
//		System.out.println("------反转输出-------");
//		list.printListReversely(list.head);
		System.out.println("------寻找中间节点-------");
		System.out.println(list.searchMid(list.head).data);
	}
}
