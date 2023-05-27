import java.util.Stack;

public class inbuiltStack {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(12);
		stack.push(43);
		stack.push(55);
		stack.push(12);
		stack.push(456);
		stack.push(41);
		stack.push(78);
		System.out.println(stack);
		stack.peek();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		
	}

}
