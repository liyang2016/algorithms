package com.leon.linklist;

public class MyLinkedList {
	Node head = null;

	public void addNode(int p) {
		Node newNode = new Node(p);
		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	public Boolean deleteNode(int index) {
		if (index < 1 || length() < index) {
			return false;
		}

		if (index == 1) {
			head = head.next;
			return true;
		}

		int i = 1;
		Node preNode = head;
		Node curNode = preNode.next;
		while (curNode != null) {
			if (i == index) {
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return true;
	}

	public Node orderList() {
		Node curNode = head;
		Node nextNode = null;
		int temp = 0;
		while (curNode != null) {
			nextNode = curNode.next;
			while (nextNode != null) {
				if (curNode.data > nextNode.data) {
					temp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
		return head;
	}

	public void deleteDuplecate(Node head){
		Node p=head;
		while(p!=null){
			Node q=p;
			while(q.next!=null){
				if(p.data==q.next.data){
					q.next=q.next.next;
				}else{
					q=q.next;
				}
			}
			p=p.next;
		}
	}
	
	public Node findElem(Node head,int k){
		if(k<1||k>this.length()){
			return null;
		}
		
		Node p1=head;
		Node p2=head;
		for(int i=0;i<k;i++){
			p1=p1.next;
		}
		while(p1!=null){
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
	}
	
	public void reverseList(Node head){
		Node pReverseHead=head;
		Node pNode=head;
		Node pPrev=null;
		while(pNode!=null){
			Node pNext=pNode.next;
			if(pNext==null){
				pReverseHead=pNode;
			}
			pNode.next=pPrev;
			pPrev=pNode;
			pNode=pNext;
		}
		this.head=pReverseHead;
	}
	
	public Node searchMid(Node head){
		Node p=this.head;
		Node q=this.head;
		while(p!=null&&p.next!=null&&p.next.next!=null){
			p=p.next.next;
			q=q.next;
		}
		return q;
	}
	
	public void printListReversely(Node pListHead){
		if(pListHead!=null){
			printListReversely(pListHead.next);
			System.out.println(pListHead.data);
		}
	}
	
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int length() {
		int len = 0;
		Node temp = head;
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		return len;
	}
}
