package sorts;

import java.util.*;

public class mergeSort {
	
	
	static void merge(int[] arr,int low,int mid,int high) {
		int left=low;
		int right=mid+1;
		
		ArrayList<Integer> temp=new ArrayList<>();
		
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
		
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		
		//adding elements to arr:
		for(int i=low;i<=high;i++) {
			arr[i]=temp.get(i-low);
		}
		
		
	}
	
	static void mergeSort(int[] arr,int low,int high) {
		int mid=(high+low)/2;
		
		if(low==high) {
			return;
		}
		
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
		
	}
	
	public static void main(String args[]) {
		int[] arr=new int[] {0,8,2,34,6,8,1,87,5,9,3};
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
}
