package subsequenceCases;

import java.util.ArrayList;

//generate all subsequences having sum k

public class subsequencesSumK {
	
	static void sub(int i,int[] arr,ArrayList<Integer> al,int sum,int k) {
		if(i==arr.length) {
			if(sum==k) {
				System.out.println(al);
			}
			return;
		}
		
		al.add(arr[i]);
		sum+=arr[i];
		sub(i+1,arr,al,sum,k);
		al.remove(al.size()-1);
		sum-=arr[i];
		sub(i+1,arr,al,sum,k);
	}
	
	public static void main(String args[]) {
		int[] arr=new int[] {1,2,1};
		int k=2;
		ArrayList<Integer> samp=new ArrayList<Integer>();
		
		sub(0,arr,samp,0,k);
	}

}
