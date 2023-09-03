package ll;

public class CustomLinked {
	Node head;
	Node tail;
	
	int size;
	
	public CustomLinked(){
		this.size=0;
	}
	
	class Node{
		int value;
		Node nextNode;
		
		public Node(int item) {
			this.value=item;
		}
		
		public Node(int item,Node next) {
			this.value=item;
			this.nextNode=next;
		}
		
	}
	
	//linked list methods - insert at end, at front, at index
	//deletion - at front, at end, at a value
	//display - head,front, back
	
	public boolean isEmpty() {
		//if a linked list is empty, then head and tail will both be null
		return(head==null);
	}
	
	public void insertFirst(int value) {
		//inserting at first position: 
		//next of newNode=head, head=newNode
		Node newN=new Node(value);
		newN.nextNode=head;
		head.nextNode=newN;
		
		if(tail==null) {
			tail=head;
		}
		
		size+=1;
		
	}
	
	public void insertLast(int value) {
		//inserting at end of linked list: tail=new node,new node's tail=null
		if(tail==null) {
			insertFirst(value);
			return;
		}
		
		Node newN=new Node(value);
		tail.nextNode=newN;
		tail=newN;
		size+=1;
		
	}
	
	public void insert(int value,int index) {
		//temp iterates till index before index to insert at
		
		if (index==0) {
			insertFirst(value);
			return;
		}
		
		if(index==size) {
			return;
		}
		
		
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.nextNode; //temp is the node before the index to insert at 
		}
		Node node=new Node(value,temp.nextNode);
		temp.nextNode=node;
		size++;
		
	}
	
	//to remove first element, head=head.next
	public void removeFirst(){
		if()
	}
	

}
