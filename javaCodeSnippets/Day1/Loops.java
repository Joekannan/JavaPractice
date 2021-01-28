package javaCodeSnippets.Day1;

public class Loops {

	public static void main(String[] args) {
		int a = 8;
		
		
		//if else condition
		if(a > 9) {
			System.out.println("a is greater than 9");
		}
		else {
			System.out.println("a is not greater than 9");
		}
		
		
		//switch case
		switch(a) {
			case 1:
				System.out.println("Number is 1");
				break;
				
			case 8:
				System.out.println("Number is 8");
				break;
				
			default:
				break;
		}
		
		
	//while loop
		while(a < 10) {
			System.out.println("condition a < 10 is true and a is - " + a);
			a++;
		}
		
		
	//do while loop
		
		do {
			System.out.println("Print a value first and check the condition " + a);
			a++;
		}while(a<10);
	
		
		//for loop
		for(int i =0 ; i <= a; i++) {
			System.out.println("Print i value - " + i);
		}
		
	
	}
}
