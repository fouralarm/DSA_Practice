package sorts;

import java.util.Arrays;

public class cycleSort {
	
	public static void main(String args[]) {
		int[] myarr= {9,8,7,6,5,4,3,2,1};
		cycle(myarr);
		System.out.println(Arrays.toString(myarr));
	}
	
	static void cycle(int[] arr) {
		//keep checking element at i; only if it is at correct index then increment i
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1; //correct =8, int[i]=9
			if(arr[i]!=arr[correct]) {
				//2 is at 0 index, should be at 1;i=0
				int temp=arr[correct]; //temp=arr[8]
				arr[correct]=arr[i]; //arr[8]=arr[0]=9
				arr[i]=temp; //arr[0]=8;
			}
			else {
				i++;
			}
		}
	}

	
	
}
