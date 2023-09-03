package subsequenceCases;

import java.util.ArrayList;

//print only one subsequence

public class subsequencesModified {
	static boolean mod(int i,int[] arr,ArrayList<Integer> al,int sum,int k) {
		if(i==arr.length) {
			//condition satisfied check:
			if(sum==k) {
				System.out.println(al);
				return true;
			}
			//condition is not satisfied:
			return false;
		}
		
		al.add(arr[i]);
		sum+=arr[i];
		if(mod(i+1,arr,al,sum,k)==true) {
			return true;
		}
		
		al.remove(al.size()-1);
		sum-=arr[i];
		if(mod(i+1,arr,al,sum,k)==true) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		int[] arr=new int[] {1,2,1};
		int k=2;
		ArrayList<Integer> al=new ArrayList<>();
		
		mod(0,arr,al,0,k);
		
	}

}
