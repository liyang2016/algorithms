package com.leon.queue;

public class Main {
	public static void main(String[] args) {
//		MyQueueByArrays<Integer> queue=new MyQueueByArrays<Integer>();
		MyQueueByLinked<Integer> queue=new MyQueueByLinked<Integer>();
		queue.put(1);
		queue.put(2);
		queue.put(3);
		queue.put(4);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}
}
