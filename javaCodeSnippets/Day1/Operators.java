package javaCodeSnippets.Day1;

public class Operators {

	public static void main(String[] args) {
		//unary operators
		int x=10;  
		System.out.println("This is from unary postfix " + x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		//arithmetic operator
		int a=10;  
		int b=5;  
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0  
		
		//ternary operator
		int output = (a<b)?a:b;
		System.out.println("output value is - "+ output);
		
		//assignment operator
		a+=3;//10+3  
		System.out.println(a);  
		a-=4;//13-4  
		System.out.println(a);  
		a*=2;//9*2  
		System.out.println(a);  
		a/=2;//18/2  
		System.out.println(a);  
	}

}
