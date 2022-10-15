package java_abstraction_examples;

//Abstract class
abstract class Bike{
	//Abstract method
	abstract void run();
}

public class Abstract_Keyword_Example1 extends Bike {
	//implementing abstract method
	void run() {
		System.out.println("Bike is running");
	}
	public static void main(String[] args) {
		//creating object for extended class
		Bike obj1=new Abstract_Keyword_Example1();
		
		//calling method with the help of object
		obj1.run();
	}
}
