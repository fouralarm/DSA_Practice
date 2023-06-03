package qs;

import java.lang.Exception;

public class circularQueue {
	protected int data[];
	private static final int DEFAULT_SIZE=10;
	
	public circularQueue() {
		this(DEFAULT_SIZE);
	}
	
	public circularQueue(int size) {
		this.data=new int[size];
	}
	
	//initially front and end and size will be 0;
	
	int front=0;
	int end=0;
	int size=0;
	
	
	//if circular queue is full, then size==data.length
	//if circular queue is empty, then size==0;
	
	public boolean isFull() {
		return size==data.length; //front and end are indicative of what to actually consider
		//but array is initilized fully
		//so when size==that initialized length, the queue is full
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	
	public boolean insert(int item) {
		if(isFull()) {
			return false;
		}
		
		data[end]=item;
		end+=1;
		end=end%data.length;
		size++;
		return true;
	}
	
	public int remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("the queue is full");
		}
		int removed=data[front];
		front=front+1;
		front=front%data.length;
		size--;
		return removed;
		
	}
	
	public int frontElement() throws Exception{
		if(isEmpty()) {
			throw new Exception("queue is empty, no front element");
		}
		return data[front];
	}
	
	public void display() throws Exception{
		if(isEmpty()) {
			throw new Exception("queue is empty, no front element");
		}
		for(int i=front;i<end;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
	}
	


}
