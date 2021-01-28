package javaCodeSnippets.Day1;

public class MethodOverloading {

	public static void main(String[] args) {
		sum(10,5);
		sum(10,5,20);
		sum("Hello", "World");
		disp('x', 51 );
	    disp(52, 'y');
	}
	//Sum method
	public static void sum(int a, int b) {
		int c = a+b;
		System.out.println("Sum is -" + c);
	}
	//Method overloading with no of parameter
	public static void sum(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("sum is -" + d);
	}
	//Method overloading with data type of parameter
	public static void sum(String a, String b) {
		String c = a+b;
		System.out.println("sum is - " + c);
	}
	//display method
	public static void disp(char c, int num)
	   {
	       System.out.println("I’m the first definition of method disp");
	   }
	//Overloading – Sequence of data type of arguments
	public static void disp(int num, char c)
	   {
	       System.out.println("I’m the second definition of method disp" );
	   }
}
