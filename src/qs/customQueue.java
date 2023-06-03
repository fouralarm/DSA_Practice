package qs;
import java.lang.Exception;

public class customQueue extends Exception{
	protected int[] data;
	private static final int DEFAULT_SIZE=10;
	
	int end=0;
	
	public customQueue(){
		this(DEFAULT_SIZE);
	}
	
	public customQueue(int size) {
		this.data=new int[size];
	}
	
	public boolean isFull() {
		return(end==data.length-1);
	}
	
	public boolean add(int item){
		if(isFull()) {
			return false;
		}
		
		data[end++]=item;
		return true;
		
	}
	
	public boolean isEmpty() {
		return(end==0);
	}
	
	public int remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty.");
		}
		
		int removed=data[0];
		//shifting items to remove from first index:
		for(int i=1;i<end;i++) {
			data[i-1]=data[i];
		}
		end--;
		return removed;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("queue is empty");
		}
		
		return data[0];
	}
	
	public void display() {
		for(int i=0;i<end;i++) {
			System.out.print(data[i]+" ");
			}
		
		System.out.println("END");
		}
	
	
}