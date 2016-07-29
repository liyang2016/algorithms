package com.leon.stack;

public class Main {
	public static void main(String[] args) {
//		MystackByArrays<Integer> s=new MystackByArrays<Integer>();
		MyStackByLinked<Integer> s=new MyStackByLinked<Integer>();
		s.push(1);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.peek());
	}
}
