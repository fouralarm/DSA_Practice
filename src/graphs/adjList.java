package graphs;

import java.util.*;


//UNDIRECTED GRAPH

public class adjList {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
		
	}
	
	static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for(int j=0;j<adj.size();j++) {
			System.out.println("Adjacency list of Vertex "+j+" :");
			System.out.print("head ->");
			for(int k=0;k<adj.get(j).size();k++) {
				System.out.print(adj.get(j).get(k)+" "+"->");
			}
			System.out.print("/");
			System.out.println();
		}
	}
	
	
	public static void main(String args[]) {
		int V=5;
		ArrayList<ArrayList<Integer>> adjList=new ArrayList<ArrayList<Integer>>(V);
		
		//initialized arrayList and sub lists:
		for(int i=0;i<V;i++) {
			adjList.add(new ArrayList<Integer>(V));
		}
		
		addEdge(adjList,0,1);
		addEdge(adjList,0,2);
		addEdge(adjList,1,2);
		addEdge(adjList,2,3);
		addEdge(adjList,2,4);
		addEdge(adjList,3,4);
		addEdge(adjList,3,0);
		
		printGraph(adjList);
	}

}
