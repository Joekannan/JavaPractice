package javaCodeSnippets.Day4;

public class ThisKeyword {
	
	int a;
	int b;
	
	public ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;
	}
 
	
	public static void main(String[] args) {
		// call the constructor
		
		ThisKeyword obj = new ThisKeyword(10, 20);
		System.out.println(obj.a + " " + obj.b);

	}

}
