package recursion;

public class linSearch {

	public static void main(String args[]) {
		
	}
	
	static int linear(int[] arr,int i,int t) {
		if(i==arr.length) {
			return -1;
		}
		
		if(arr[i]==t) {
			return i;
		}
		else {
			return linear(arr,i+1,t);
		}
		
		
	}
	
}
