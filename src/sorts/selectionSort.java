package sorts;

import java.util.Arrays;

public class selectionSort {

	public static void main(String args[]) {
		int[] myarr= {9,8,7,6,5,4,3,2,1};
		selection(myarr);
		System.out.println(Arrays.toString(myarr));
		//System.out.println(maxElement(myarr.length,myarr));
		
	}
	
	
	static void selection(int[] arr) {
		//select the maximum element from the current array
		//place it at the appropriate index
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int max=maxElement(last+1,arr);
			int temp=arr[last]; //current last element
			arr[last]=arr[max];
			arr[max]=temp;
							
		}
		
	}
	
	
	static int maxElement(int e,int[] arr) {
		int maxIndex=0;
		for(int i=0;i<e;i++) {
			if(arr[i]>arr[maxIndex]) {
				maxIndex=i;
			}
		}
		return maxIndex;
			
	}
	
	
}
