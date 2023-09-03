package stringMatching;

import java.util.*;

//using substring method

public class naiveSearch {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String pattern=sc.nextLine();
		
		int s=str.length();
		int p=pattern.length();
		int i=0;
		int j=p-1;
		while(j<s) {
			if(pattern.equals(str.substring(i,j+1))) {
				System.out.println("Match found at index: "+i);
			}
			i++;
			j++;
		}
		
		
	}

}
