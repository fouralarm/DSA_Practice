package sorts;

import java.util.Arrays;

public class insertionSort {
	
	public static void main(String[] args) {
		int[] myarr= {9,8,7,6,5,4,3,2,1};
		insertion(myarr);
		System.out.println(Arrays.toString(myarr));
	}

	static void insertion(int[] arr) {
		//j=i+1 till j=1
		//j can be till arr.length-1
		//i+1=arr.length-1;i max=arr.length-2
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
			
		}
		
		
	}
	
}
