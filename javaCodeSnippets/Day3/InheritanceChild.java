package javaCodeSnippets.Day3;

public class InheritanceChild extends InheritanceParent {

	String mainWork = "Automation Testing";
	
	@Override
	public void does() {
		System.out.println("I am overriding does() method from super / parent class");
	}
	
	public static void main(String[] args) {
		
		//Accessing the member variable and method from parent class using 'extend' keyword
		System.out.println("Printing parent class name variable in child class - " + name);
		printName();
		
		
		//object for parent class
		InheritanceParent parent = new InheritanceParent();
		System.out.println(parent.designation);
		System.out.println(parent.employer);
		parent.does(); // Overridden method
		
		//Object for child (this) class
		InheritanceChild child = new InheritanceChild();
		System.out.println(child.designation);
		System.out.println(child.employer);
		System.out.println(child.mainWork);
		child.does(); // overriding method
	}

}
