package java_abstraction_examples;

//Abstract class
abstract class Bank{
	//abstract method
	abstract int rateOfIntrest();
}

//Extended classes
class SBI extends Bank{
	//abstract method implementation
	int rateOfIntrest() {
		return 6;
	}
}

//Extended class
class HDFC extends Bank{
	//abstract method implementation
	int rateOfIntrest() {
		return 5;
	}
}

//Extended class
class Axis extends Bank{
	//abstract method implementation
	int rateOfIntrest() {
		return 6;
	}
}

//Main driving class
public class Abstract_Class_Example4 {
	public static void main(String[] args) {
		//Calling Abstract class with the IS-A inheritance relationship
		Bank bank;
		//SBI
		bank=new SBI();
		System.out.println("SBI bank rate of intrest is:- "+bank.rateOfIntrest());
		
		//HDFC
		bank=new HDFC();
		System.out.println("HDFC bank rate of intrest is:- "+bank.rateOfIntrest());
		
		//Axis
		bank=new Axis();
		System.out.println("Axis bank rate of intrest id:- "+bank.rateOfIntrest());
		
	}
}
