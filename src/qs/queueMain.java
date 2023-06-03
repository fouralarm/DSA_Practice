package qs;
import java.lang.Exception;

public class queueMain{
	public static void main(String[] args) throws Exception {
		customQueue queue=new customQueue(5);
		queue.add(8);
		queue.add(56);
		queue.add(90);
		queue.add(25);
		queue.add(7);
		queue.add(87);
		
		queue.display();
		
		queue.peek();
		queue.remove();
		queue.remove();
		queue.display();

		
		
		
	}
}
