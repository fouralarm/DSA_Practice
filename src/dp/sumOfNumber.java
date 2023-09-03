package dp;
import java.util.*;

public class sumOfNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		arr[0]=0;
		for(int i=1;i<=n;i++) {
			arr[i]=arr[i-1]+i;
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(arr[n]);
	}
	
	
}
