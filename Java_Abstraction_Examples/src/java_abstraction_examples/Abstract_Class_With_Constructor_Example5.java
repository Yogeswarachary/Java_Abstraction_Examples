package java_abstraction_examples;

//Abstract Parent class
abstract class BikeA{
	//Constructor
	BikeA(){
		System.out.println("bike was started at first gear");
	}
	//abstract method
	abstract void run();//third gear was printed
	
	//Normal method
	void changeGear() {
		System.out.println("bike was running in second gear");
	}
}

//Extended class or Child class
class Bajaj extends BikeA{
	//Extended method
	void run() {
		System.out.println("Bike was running in third gear");
	}
}

//Extended class or Child class
class Discovery extends BikeA{
	//Extended method
	void run() {
		System.out.println("Bike was running in the fourth gear");
	}
}

//Main driving class
public class Abstract_Class_With_Constructor_Example5 {
	public static void main(String[] args) {
		
		//creating object for the Abstract class to the extended class
		BikeA obj1=new Bajaj();
		
		//Calling methods with the help of objects
		obj1.run();
		obj1.changeGear();
		
		//object for another extended class
		BikeA obj2=new Discovery();
		obj2.run();
	}
}
