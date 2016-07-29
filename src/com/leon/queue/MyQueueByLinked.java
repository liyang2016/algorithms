package com.leon.queue;

public class MyQueueByLinked<E> {
	private Node<E> head=null;
	private Node<E> tail=null;
	
	public boolean isEmpty(){
		return head==tail;
	}
	
	public void put(E data){
		Node<E> newNode=new Node<E>(data);
		if(head==null&&tail==null){
			head=newNode;
			tail=newNode;
		}else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public E pop(){
		if(this.isEmpty()){
			return null;
		}
		E data=head.data;
		head=head.next;
		return data;
	}
	
	public int size(){
		Node<E> temp=head;
		int n=0;
		while(temp!=null){
			n++;
			temp=temp.next;
		}
		return n;
	}
}
