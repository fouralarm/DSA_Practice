import java.util.Arrays;

public class search2d {
	
	public static void main(String[] args) {
		int[][] nums= {{1,2,3,4,5},{6,7,8},{9,10}};
		System.out.println(Arrays.toString(searchd(nums,12)));
	}
	
	static int[] searchd(int[][] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if (arr[i][j]==target) {
					return (new int[]{i,j});
				}
			}
		}
		return (new int[]{-1,-1});	
	}

}
