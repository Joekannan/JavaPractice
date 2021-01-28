package javaCodeSnippets.Day1;

public class CallMethodFromMain {

	public static void main(String[] args) {
		System.out.println("I am currently in main method. Before calling printMe method");
		printMe();
		System.out.println("I am currently in main method. After calling printMe method");
		
		System.out.println("Before calling sum");
		sum();
		System.out.println("After Calling sum");
	}
	
	
	public static void printMe() {
		System.out.println("I am coming from method printMe");
	}
	
	public static void sum() {
		int a =100;
		int b = 50;
		int c = a+b;
		System.out.println("Sum of A and B is " + c);
		
	}
}
