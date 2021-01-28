package javaCodeSnippets.Day1;

public class ReturnTypes {

	public static void main(String[] args) {
		System.out.println("I am currently in main method. Before returning Sum value");
		int c = sum(10, 20);
		System.out.println("I am currently in main method. After printing sum value - " + c);
		System.out.println("I am currently in main method. After printing sum value - " + sum(50,100));
		
	}
	
	public static int sum(int a, int b) {
		int c = a+b;
		
		return c;
	}

}
