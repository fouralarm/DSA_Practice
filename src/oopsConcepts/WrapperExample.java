package oopsConcepts;

public class WrapperExample {
	public static void main(String args[]) {
		//primitive assignment:
		int a=10;
		
		//wrapper class assignment:
		Integer num=new Integer(45);
		//or same as Integer num= 45;
		
		//a. - does not give many options
		//but num. - gives many options
		int b=20;
		swap(a,b);
		System.out.println(a+" "+b);
		
		final A aditi=new A("aditi");
		aditi.name="paditi";
		//aditi=new A("new object"); not possible
	}
	
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}

}

class A{
	final int num=10;
	String name;
	
	public A(String name) {
		this.name=name;
	}
}
