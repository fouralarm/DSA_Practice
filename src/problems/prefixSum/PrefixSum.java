package prefixSum;

import java.util.Arrays;

//concept used when we need to calculate the sum from one index of an array till another 



public class PrefixSum {
	public static void main(String args[]) {
		int arr[]=new int[]{1,6,4,2,5,3};
		
		//assume arr to be 1 indexed
		//we want to compute the value of arr[a]+arr[a+1]+..+arr[b] for a and b between 1 and n=6(length of array)
		//prefix sum=sum of all elements from a to b
		
		//first calculate the prefix sum array, i.e array where each index is the sum of all the elements prior to it + element at that index
		
		int[] prefixSum=new int[arr.length+1];
		prefixSum[0]=0;
		
		//prefix sum: use sliding window
		for(int i=0;i<arr.length;i++) {
			prefixSum[i+1]=prefixSum[i]+arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(prefixSum));
		
		//now, the sum between any two indices (both inclusive) of the array (1 indexed) is equal to:
		//prefixsum[b]-
		//0-4: 1-5 -> 1+6+4+2+5=18 = prefixSum[5]-prefixSum[0]
		
		Scanner sc=new Scanner(system)
		
	}
}
