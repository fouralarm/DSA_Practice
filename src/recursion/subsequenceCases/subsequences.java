package subsequenceCases;

import java.util.*;


public class subsequences {
	
	static void sub(int i,int[] arr, ArrayList<Integer> al) {
		if(i>=arr.length) {
			System.out.println(al);
			return;
		}
		
		al.add(arr[i]);
		sub(i+1,arr,al);
		al.remove(al.size()-1);
		sub(i+1,arr,al);
	}
	
	public static void main(String args[]) {
		int[] arr=new int[]{3,1,2};
		ArrayList<Integer> samp=new ArrayList<>();
		sub(0,arr,samp);
	}

}
