package questions;

import java.lang.*;

public class findDiameterNaive {
	static int height(Node root) {
		if(root==null) {
			return 0;
		}
		
		int lh=height(root.left);
		int rh=height(root.right);
		
		return 1+Math.max(lh, rh);
	}
	
	static void findDiameter(Node root, int cmax[]) {
		//diameter is the longest path between any two nodes in a tree
		//for each node, we can find the longest part it is part of by summing the lh and rh (left and right) height
		
		if(root==null) {
			return;
		}
		
		int lh=height(root.left);
		int rh=height(root.right);
		
		cmax[0]=Math.max(cmax[0],lh+rh);
		//System.out.println(cmax);
		
		findDiameter(root.left,cmax);
		findDiameter(root.right,cmax);
		
	}
	
	public static void main(String args[]) { 
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.right.left=new Node(4);
		root.right.left.left=new Node(5);
		root.right.left.left.left=new Node(6);
		
		root.right.right=new Node(7);
		root.right.right.right=new Node(8);
		root.right.right.right.right=new Node(9);
		int[] cmax=new int[1];
		findDiameter(root,cmax);
		
		System.out.println(cmax[0]);
	}
}
