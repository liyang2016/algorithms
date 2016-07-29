package com.leon.queue;

import java.util.LinkedList;

public class MyQueueByArrays<E> {
	private LinkedList<E> linkedList=new LinkedList<E>();
	private int size=0;
	public synchronized void put(E data){
		linkedList.addLast(data);
		size++;
	}
	
	public synchronized E pop(){
		size--;
		return linkedList.removeFirst();
	}
	
	public synchronized boolean isEmpty(){
		return size==0;
	}
	
	public synchronized int size(){
		return size;
	}
}
