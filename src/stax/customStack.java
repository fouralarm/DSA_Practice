package stax;

import java.lang.Exception;

public class customStack{
	protected int[] data;
	private static final int DEFAULT_SIZE=10;
	
	public customStack() {
		this(DEFAULT_SIZE);
	}
	
	public customStack(int size) {
		this.data=new int[size];
	}
		
	int pointer=-1;
	
	public boolean isFull(){
		return(pointer==data.length-1);
	}
	
	
	public boolean push(int item) {
		if(isFull()) {
			return false;
		}
		
		pointer++;
		data[pointer]=item;
		return true;
		
	}
	
	
	private boolean isEmpty() {
		return(pointer==-1);
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Cannot pop empty stack");
		}
		
		return data[pointer--];
		
	}
	
	public int peek(){
		return data[pointer];
	}
	
	}


