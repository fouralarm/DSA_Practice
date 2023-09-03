package recursion;

public class checkSortedArray {
	
	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4,5,6};
		if(sorted(nums,0)) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("not sorted");
		}
	}
	
	static boolean sorted(int[] arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		
		return arr[i]<arr[i+1] && sorted(arr,i+1);
		
	}
		

}
