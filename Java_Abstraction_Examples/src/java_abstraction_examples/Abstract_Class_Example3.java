package java_abstraction_examples;

//Creating abstract class
abstract class Shape{
	
	//Abstract method
	abstract void draw();
}

//extending abstract class
class Rectangle extends Shape{
	
	//Abstract method
	void draw() {
		System.out.println("Drawing triangle...");
	}
}

//extending abstract class
class Circle extends Shape{
	
	//Abstract method
	void draw() {
		System.out.println("Drawing circle");
	}
}

//extending abstract class
class Pentagon extends Shape{
	
	//Abstract method
	void draw() {
		System.out.println("drawing pentagon");
	}
}

//main driving class
public class Abstract_Class_Example3 {
	public static void main(String[] args) {
		
		//creating object for the any of extended class
		Shape obj1=new Circle();
		
		//calling method with the help of extended class object
		obj1.draw();
	}
}
