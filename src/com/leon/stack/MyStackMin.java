package com.leon.stack;

public class MyStackMin {
	MystackByArrays<Integer> elem;
	MystackByArrays<Integer> min;
	
	public MyStackMin() {
		elem=new MystackByArrays<Integer>();
		min=new MystackByArrays<Integer>();
	}
	
	public void push(int data){
		elem.push(data);
		if(min.isEmpty()){
			min.push(data);
		}else{
			if(data<min.peek()){
				min.push(data);
			}
		}
	}
	
	public int pop(){
		int topData=elem.peek();
		elem.pop();
		if(topData==this.min()){
			min.pop();
		}
		return topData;
	}
	
	public int min(){
		if(min.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return min.peek();
		}
	}
}
