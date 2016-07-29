package com.leon.stack;

public class Main {
	public static void main(String[] args) {
//		MystackByArrays<Integer> s=new MystackByArrays<Integer>();
//		MyStackByLinked<Integer> s=new MyStackByLinked<Integer>();
		MyStackMin stackMin=new MyStackMin();
		stackMin.push(2);
		stackMin.push(31);
		stackMin.push(13);
		stackMin.push(7);
		stackMin.push(56);
		stackMin.push(13);
		stackMin.push(49);
		System.out.println(stackMin.min());
	}
	
}
