package traversals;

import java.util.*;

public class Level {
	public static List<List<Integer>> levelOrder(Node root){
		Queue<Node> queue=new LinkedList<Node>();
		List<List<Integer>> travlist=new ArrayList<>();
		if(root==null) {
			return travlist;
		}
		
		queue.add(root);
		while(!queue.isEmpty()) {
			int levelNum=queue.size(); //the size of a level
			
			List<Integer> sublist=new ArrayList<>();
			for(int i=0;i<levelNum;i++) {
				if(queue.peek().left!=null) {
					queue.add(queue.peek().left);
				}
				if(queue.peek().right!=null) {
					queue.add(queue.peek().right);
				}
				sublist.add(queue.remove().data);
			}
			
			travlist.add(sublist);
			
		}
		
		return travlist;
		
	}
	
	public static void main(String args[]) {
		
		System.out.println("this one");
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		List<List<Integer>> ans=levelOrder(root);
		
		System.out.println(ans);
		
		
	}

}
