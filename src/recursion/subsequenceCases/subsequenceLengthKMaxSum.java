package subsequenceCases;

import java.util.*;

//subsequence of length k:
public class subsequenceLengthKMaxSum {
	static void kmaxsum(int[] arr,int index,int count,int k,int sum,ArrayList<Integer> al,int maxYet) {
		//base case: all indices have been considered
		if(index==arr.length) {
			if(count==k) {
				if(sum>maxYet) {
					System.out.println(al+" "+maxYet);
					maxYet=sum;
				}
				return;
			}
			return;
		}
		
		
		al.add(arr[index]);
		sum=sum+arr[index];
		kmaxsum(arr,index+1,count+1,k,sum,al,maxYet);
		al.remove(al.size()-1);
		sum=sum-arr[index];
		kmaxsum(arr,index+1,count,k,sum,al,maxYet);
		
	}
	
	public static void main(String args[]) {
		int[] nums=new int[] {2,1,3,3};
		int k=2;
		ArrayList<Integer> al=new ArrayList<>();
		kmaxsum(nums,0,0,k,0,al,0);
		
	}
	
	
}
