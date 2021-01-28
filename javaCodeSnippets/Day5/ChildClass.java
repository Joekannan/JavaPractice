package javaCodeSnippets.Day5;

public class ChildClass extends AbstractParentClass{

	public static void main(String[] args) {
		//abstract classes cant be instantiated
		
		ChildClass obj = new ChildClass();
		//a regular method from an abstract class
		obj.employerOfAllEmployees();
		//An abstract method from Abstact class - implemented in child class
		obj.employees("jothi", "QA", "Testing");

	}

	@Override
	public void employees(String name, String designation, String department) {
		System.out.println(name);
		System.out.println(designation);
		System.out.println(department);
		
	}

}
