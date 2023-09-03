package subsequenceCases;

import java.util.ArrayList;

//count of subsequences having a sum k

public class subsequencesCount {
	static int subc(int i,int[] arr,ArrayList<Integer> al,int sum,int k) {
		//base case:
		if(i==arr.length) {
			if(sum==k) {
				return 1;
			}
			return 0;
		}
		
		al.add(arr[i]);
		sum+=arr[i];
		int l=subc(i+1,arr,al,sum,k);
		sum-=arr[i];
		al.remove(al.size()-1);
		int r=subc(i+1,arr,al,sum,k);
		return l+r;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,1};
		int k=2;
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		int ans=subc(0,arr,al,0,k);
		
		System.out.println(ans);
		
	}
}
