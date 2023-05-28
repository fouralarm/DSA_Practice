package qs;

public class customQueue {
	protected int[] data;
	private static final int DEFAULT_SIZE=10;
	
	int ptr=-1;

	public customQueue() {
		this(DEFAULT_SIZE);
	}
	
	public customQueue(int size) {
		this.data=new int[size];
	}
	
	public boolean isFull() {
		return (ptr==data.length-1);
	}
	
	public boolean add(int item) {
		if(isFull()) {
			return false;
		}
		
		ptr=ptr+1;
		data[ptr]=item;
		return(true);
		
	}
	
	public boolean isEmpty() {
		return(ptr==-1);
	}
	
	public int remove() {
		if(isEmpty()) {
			return -1;
		}
		
		
		
	}
	
	
	

	
	
}
