package graphs;

import java.util.*;

public class adjMat {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//number of edges:m
		int m=sc.nextInt();
		
		int[][] adjMat=new int[n][n];
		
		for(int i=0;i<m;i++) {
			System.out.println("enter the starting and the ending node:");
			int u=sc.nextInt();
			int v=sc.nextInt();
			
			adjMat[u][v]=1;
			adjMat[v][u]=1;
		}
		
		System.out.println(Arrays.deepToString(adjMat));
		
		for(int j=0;j<n;j++) {
			System.out.println(Arrays.toString(adjMat[j]));
		}
	}
}
