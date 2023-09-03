package packages;

import static packages.Message.message; //need the static keyword

public class Greeting {
	public static void main(String args[]) {
		System.out.println("I am awesome");
		//message(); //gives error - there is no message class or method in this scope
		message();
		
		
	}

}
