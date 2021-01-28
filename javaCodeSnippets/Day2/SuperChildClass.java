package javaCodeSnippets.Day2;

//To use super keyword to access the variables of parent class
public class SuperChildClass extends SuperParentClass {
	
	int num = 200;
	
	public void printNum() {
		System.out.println(super.num + " Super uses the member of parent class");
		System.out.println(num + " This prints the number from child class");
	}
	
	public static void main(String[] args) {
		SuperChildClass obj = new SuperChildClass();
		obj.printNum();
		
	}

}
