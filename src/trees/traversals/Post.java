package traversals;

public class Post {
	public static void postOrder(Node node) {
		if(node==null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}
	
	public static void main(String args[]) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.right.left=new Node(8);
		
		root.right=new Node(3);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		root.right.right.left=new Node(9);
		root.right.right.right=new Node(10);
		
		postOrder(root);
		
	}
}
