package subsequenceCases;

import java.util.*;

//all subsequences of length k:

public class subsequencesKLength {
    static void gen(int[] arr,int index,int count,int k,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> al){

        if(index==arr.length){
            if(count==k){
            	//System.out.println(ds);
                al.add(new ArrayList<Integer>(ds));
                return;
            }
            
            return;
        }

        //take: 
        ds.add(arr[index]);
        gen(arr,index+1,count+1,k,ds,al);
        //did not take:
        ds.remove(ds.size()-1);
        gen(arr,index+1,count,k,ds,al);

    }
    
    public static void main(String args[]) {
    	int[] nums=new int[] {2,1,3,3};
    	int k=2;
    	ArrayList<ArrayList<Integer>> al=new ArrayList<>();
    	gen(nums,0,0,k,new ArrayList<Integer>(),al);
    	
    	System.out.println(al);
    }
}


