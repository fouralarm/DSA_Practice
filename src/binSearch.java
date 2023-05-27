
public class binSearch {
	public static void main(String[] args) {
		int[] arra= {1,6,9,2,55,5,237,89,132,5457,97,123};//make this a sorted array
		System.out.println(binarySearch(arra,55));

	}
	
	static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(target>arr[mid]) {
				start=mid+1;
			}
			if(target<arr[mid]) {
				end=mid-1;
			}
			
		}
		return -1;
	}

}
