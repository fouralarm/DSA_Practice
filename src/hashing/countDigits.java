package hashing;

import java.util.*;

public class countDigits {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
				
		//assuming we know that the numbers in the array range from 0 to 12:
		int[] count=new int[13];
		
		
		for(int i=0;i<n;i++) {
			count[arr[i]]=count[arr[i]]+1;
		}
		
		System.out.println(Arrays.toString(count));
		
		
	}

}
