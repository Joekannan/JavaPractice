package javaCodeSnippets.Day1;

public class VariableTypes {

	static int data = 50; //instance variable
	static int num = 500; //class / static variable
	
	public static void main(String[] args) {
		System.out.println("I am static variable -" + num);//static variable
		// Static variable needs to be used in static methods.as main method is a static method it will accept the static variable 
		System.out.println("I am instance variable -" + data); //instance variable
//		System.out.println("I am local variable -" + a);//local variable
		//Static method to be called inside static method
		localVariable();
		
		System.out.println("I am back to main method");
		
	}

	public  static  void localVariable() {
		System.out.println("I m inside local method");
		int a = 10; // local variable
		System.out.println("I am local variable -" + a);
		System.out.println("I am instance variable -" + data);
		
	}
}
