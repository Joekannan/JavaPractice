package javaCodeSnippets.Day3;

public class MultilevelInheritance2 extends MultilevelInheritance3 {
	
	public void iAmFromClass2() {
		System.out.println("I am from class 2");
	}
	
	public static void main(String[] args) {
		
		MultilevelInheritance2 class2 = new MultilevelInheritance2();
		class2.superParent();// From parent class
		class2.iAmFromClass2();// from its own class
	}

}
