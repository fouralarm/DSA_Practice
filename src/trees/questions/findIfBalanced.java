package questions;

import java.lang.Math;

public class findIfBalanced {
	//if a binary tree is balanced, then the height of its left subtree-height of right subtree <=1
	
	static int balancedHeight(Node root) {
		if(root==null) {
			return 0;
		}
		
		int lh=balancedHeight(root.left);
		int rh=balancedHeight(root.right);
		
		if(lh==-1 || rh==-1) {
			return -1;
		}
		
		if(Math.abs(lh-rh)>1) {
			return -1;
		}
		
		return 1+Math.max(lh, rh);
		
	}
	
	public static void main(String args[]) {
		Node root1=new Node(3);
		root1.left=new Node(9);
		root1.right=new Node(20);
		
		root1.right.left=new Node(15);
		root1.right.right=new Node(7);
		
		if(balancedHeight(root1)!=-1) {
			System.out.println("Yes, Balanced");
		}
		else {
			System.out.println("Not balanced");
		}
		
	}

}
