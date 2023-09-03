package sorts;

import java.util.*;

public class mergePrac {
	static void merge(int[] arr,int low,int mid,int high) {
		//to merge:
		int left=low;
		int right=mid+1;
		
		ArrayList<Integer> temp=new ArrayList<Integer>();
		
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		//adding leftover elements:
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		
		//making changes to the array:
		
		for(int i=low;i<=high;i++) {
			arr[i]=temp.get(i-low);
		}
		
	}
	
	static void mergeSort(int[] arr,int low,int high) {
		
		
		
		int mid=(low+high)/2;
		
		if(low==high) {
			return;
		}
		//mergeSort function exists to split the arrays into parts
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		
		//after splitting the arrays, we merge.
		//merge function is after the splitting because that way we can first reach the case where array size is 1
		merge(arr,low,mid,high);
		
	}
	
	public static void main(String args[]) {
		int[] arr=new int[] {0,8,2,34,6,8,1,87,5,9,3};
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
	
}
