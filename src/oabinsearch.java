
public class oabinsearch {
	public static void main(String args[]) {
		int[] arr= {1,2,5,12,55,123,237,5457};
		System.out.println(orderAgnosticBS(arr,5457))
	}

	
	public orderAgnosticBS(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		
		boolean isAsc=arr[start]<arr[end];
		
		while(start<=end) {
			if(arr[mid]==target) {
				return mid;
			}
			
			if(isAsc) {
				if(arr[mid]>target) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			
			else {
				if(arr[mid]<target) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
				
			}
			 
			
		}
		return -1;
		
		
	}
}
