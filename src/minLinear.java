
public class minLinear {
	public static void main(String[] args) {
		int[] num= {1,23,45,87,678,74,353,0,-5,5,97,34,5,23};
		System.out.println(min(num));
	}
	
	static int min(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}
