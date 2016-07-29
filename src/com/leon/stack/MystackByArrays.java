package com.leon.stack;

import java.util.Arrays;

public class MystackByArrays<E> {
	private Object[] stack;
	int size;
	public MystackByArrays(){
		stack=new Object[10];
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	@SuppressWarnings("unchecked")
	public E peek(){       //返回栈顶元素
		if(isEmpty()){
			return null;
		}
		return (E) stack[size-1];
	}
	
	public E pop(){    //退栈
		E e=peek();
		stack[size-1]=null;
		size--;
		return e;
	}
	
	public E push(E item){   //进栈
		ensureCapacity(size+1);
		stack[size++]=item;
		return item;
	}
	
	public void ensureCapacity(int size){
		int len=stack.length;
		if(size>len){
			int newLen=10;
			stack=Arrays.copyOf(stack, newLen);
		}
	}
}
