package stringMatching;

//using character array method

import java.util.*;

public class naiveSearch1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String pattern=sc.nextLine();
		
		int t=text.length();
		int p=pattern.length();
		int i=0;
		int j=0;
		while(i<=t-p) {
			char c=text.charAt(i);
			if(c.equals(pattern.charAt(j))) {
				i++;
			}
		}
		
	}

}
