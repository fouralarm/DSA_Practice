package hashing;

import java.util.*;

public class countLowerCaseChar {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int[] count=new int[26];
				
		for(int i=0;i<s.length();i++) {
			int index=s.charAt(i)-'a';
			count[index]+=1;
		}
		
		System.out.println(Arrays.toString(count));
		System.out.println("Enter the number of characters to search for:");
		int n=sc.nextInt();
		sc.nextLine();
		while(n>=0) {
			char c=sc.nextLine().charAt(0);
			System.out.println("Count of char "+c+" is:"+(count[c-'a']));
			n--;
		}
		
	}

}
