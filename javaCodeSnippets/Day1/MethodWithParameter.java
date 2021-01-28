package javaCodeSnippets.Day1;

public class MethodWithParameter {

	public static void main(String[] args) {
		sum(12, 3);
		sum(150, 60);
		sum(80, 120);
		
	}

	public static void sum(int a, int b) {
		int c = a+b;
		System.out.println("sum of the given value is - " + c);
	}
}
