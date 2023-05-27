
public class linearS {
	public static void main(String[] args) {
		int[] array= {1,6,2,4,9,0,2,67,9,2,1,5,7};
		System.out.println(linearSearch(array,65));
		
	}
	
	static int linearSearch(int[] arr, int target) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		return -1;
	}
}
