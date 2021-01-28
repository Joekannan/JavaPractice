package javaCodeSnippets.Day3;

public class HieraricalInheritance2 extends HieraricalInheritance3 {
	
	public void iAmFromClass2() {
		System.out.println("I am coming from class 2");
	}
	
	public static void main(String[] agrs) {
		HieraricalInheritance2 class1 = new HieraricalInheritance2();
		class1.superParent(); // from parent class 
		class1.iAmFromClass2(); // from its own class
	}

}
