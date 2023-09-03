package subsequenceCases;
import java.util.*;
import java.math.*;

public class longestCommonSubsequence {
	
	static int lcs(String s1,String s2,int ind1,int ind2) {
		//base case:
		if(ind1<0 || ind2<0) {
			return 0;
		}
		
		if(s1.charAt(ind1)==s2.charAt(ind2)) {
			return (1+lcs(s1,s2,ind1-1,ind2-1));
		}
		
		return Math.max(lcs(s1,s2,ind1-1,ind2), lcs(s1,s2,ind1,ind2-1));
	}
	
	public static void main(String args[]) {
		String s1="adcbc";
		String s2="dcadb";
		
		System.out.println(lcs(s1,s2,s1.length()-1,s2.length()-2));
	}
}
