package javaCodeSnippets.Day3;

public class HieraricalInheritance1 extends HieraricalInheritance3 {
	
	public void iAmFromClass1() {
		System.out.println("I am coming from class 1");
	}
	
	public static void main(String[] agrs) {
		HieraricalInheritance1 class1 = new HieraricalInheritance1();
		class1.superParent(); // from parent class
		class1.iAmFromClass1(); // from its own class
	}

}
