package subsequenceCases;
import java.util.*;

//all combinations summing up to a certain target

public class combinationSum {
	
	static void comb(int index,int target,ArrayList<ArrayList<Integer>> al,ArrayList<Integer> nest, int[] arr){
		//base cases:
		if(index==arr.length) {
			if(target==0) {
				al.add(new ArrayList<>(nest));
			}
			return;
		}
		
		//take case:
		if(arr[index]<=target) {
		nest.add(arr[index]);
		comb(index,target-arr[index],al,nest,arr);
		//not take:
		nest.remove(nest.size()-1);
		}
		comb(index+1,target,al,nest,arr);
	}
	
	public static void main(String args[]) {
		int[] arr=new int[] {2,3,6,7};
		int t=7;
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		comb(0,t,al,new ArrayList<>(),arr);
		System.out.println(al);
	}
	
	
}

