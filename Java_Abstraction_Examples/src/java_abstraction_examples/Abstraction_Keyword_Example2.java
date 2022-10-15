package java_abstraction_examples;

//abstract class
abstract class Book{
	abstract void readBook();
}

public class Abstraction_Keyword_Example2 extends Book{
	void readBook() {
		System.out.println("Reading MahaBharath");
	}
	public static void main(String[] args) {
		//Creating object for the extended class
		Book obj1=new Abstraction_Keyword_Example2();
		
		//Calling method with the help of the extended class object
		obj1.readBook();
	}
}
