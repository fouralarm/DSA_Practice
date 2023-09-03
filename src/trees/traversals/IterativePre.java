package traversals;
import java.util.*;

public class IterativePre {
	public static void main(String args[]) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(7);
		root.left.left=new Node(3);
		root.left.right=new Node(4);
		root.left.right.left=new Node(5);
		root.left.right.right=new Node(6);
		
		Pre.preorder(root);
		
		Stack<Node> stack=new Stack<>();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			Node current=stack.pop();
			System.out.print(current.data+ " ");
			if(current.right!=null) {
			stack.push(current.right);
			}
			if(current.left!=null) {
			stack.push(current.left);
			}
		}
		
		
	}
}
