package com.leon.queue;

import com.leon.stack.MystackByArrays;

public class MyQueueByStack<E> {
	private MystackByArrays<E> s1=new MystackByArrays<E>();
	private MystackByArrays<E> s2=new MystackByArrays<E>();
	
	public synchronized void put(E data){
		s1.push(data);
	}
	
	public synchronized E pop(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
	public synchronized boolean isEmpty(){
		return s1.isEmpty()&&s2.isEmpty();
	}
}
