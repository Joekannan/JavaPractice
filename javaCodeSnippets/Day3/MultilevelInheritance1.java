package javaCodeSnippets.Day3;

public class MultilevelInheritance1 extends MultilevelInheritance2 {
	
	public void iAmFromClass1() {
		System.out.println("I am coming from class 1");
	}
	
	public static void main(String[] agrs) {
		MultilevelInheritance1 class1 = new MultilevelInheritance1();
		class1.superParent(); // from Grand parent class
		class1.iAmFromClass2(); // from parent class
		class1.iAmFromClass1(); // from its own class
	}

}
