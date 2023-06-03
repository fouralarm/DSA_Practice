package qs;

public class circularQueueMain {
	public static void main(String[] args) throws Exception{
		circularQueue cq=new circularQueue();
		
		cq.insert(9);
		cq.insert(10);
		cq.insert(11);
		cq.insert(12);
		cq.insert(13);
		cq.insert(14);
		cq.display();
		
		System.out.println(cq.frontElement());
		cq.remove();
		cq.display();
		System.out.println(cq.frontElement());

	}
}
