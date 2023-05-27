package stax;

import java.util.Arrays;

public class stackMain {

	public static void main(String args[]) throws Exception{
		customStack stack=new customStack(5);
		
		stack.push(10);
		stack.push(9);
		stack.push(15);
		stack.push(35);
		stack.push(25);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
	}
	
}
