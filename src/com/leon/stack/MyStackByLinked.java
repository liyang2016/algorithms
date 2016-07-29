package com.leon.stack;

public class MyStackByLinked<E> {
	Node<E> top=null;
	public boolean isEmpty(){
		return top==null;
	}
	
	public void push(E data){
		Node<E> newNode=new Node<E>(data);
		newNode.next=top;
		top=newNode;
	}
	
	public E pop(){
		if(this.isEmpty()){
			return null;
		}
		E data=top.data;
		top=top.next;
		return data;
	}
	
	public E peek(){
		if(isEmpty()){
			return null;
		}
		return top.data;
	}
}
