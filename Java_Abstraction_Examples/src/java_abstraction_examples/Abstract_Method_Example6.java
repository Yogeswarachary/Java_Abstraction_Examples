package java_abstraction_examples;

interface ParentInterface{
	//defining methods and we can implement these below classes
	void method1();
	void method2();
	void method3();
	void method4();
}

abstract class BCls implements ParentInterface{
	public void method3() {
		System.out.println("Calling from method3");
	}
}

class Ccls extends BCls{
	//method1
	public void method1() {
		System.out.println("Calling from method1");
	}
	
	//method2
	public void method2() {
		System.out.println("calling from method2");
	}
	
	//method4
	public void method4() {
		System.out.println("calling from method4");
	}
	
}

public class Abstract_Method_Example6 {
	public static void main(String[] args) {
		//Creating object for the A class
		ParentInterface obj1=new Ccls();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
	}
}
