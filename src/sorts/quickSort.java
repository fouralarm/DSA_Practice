package sorts;
import java.util.*;

public class quickSort {
	static int pivoter(int[] arr,int low,int high) {
		int pivot=arr[low];
		int i=low;
		int j=high;
		
		while(i<j) {
			//first element from left greater than pivot:
			while(arr[i]<=pivot && i<=high-1) {
				i++;
			}
			//first element from right smaller than pivot:
			while(arr[j]>pivot && j>=low+1) {
				j--;
			}
			
			if(i<j) {
				//swap i and j elements:
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		//now, swap the pivot to its correct place:
		int t=arr[low];
		arr[low]=arr[j];
		arr[j]=t;
		
		return j;
		
		
		
	}
	
	static void qs(int[] arr,int low,int high) {
		if(low<high) {
			int partitionIndex=pivoter(arr,low,high);
			qs(arr,low,partitionIndex-1);
			qs(arr,partitionIndex+1,high);
		}
	}
	
	public static void main(String[] args) {
		int[] nums=new int[] {12,7,3,78,12,778,34,213,76};
		qs(nums,0,nums.length-1);
		
		System.out.println(Arrays.toString(nums));
	}
}
