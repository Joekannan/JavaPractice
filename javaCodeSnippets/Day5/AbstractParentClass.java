package javaCodeSnippets.Day5;

public abstract class AbstractParentClass {
	
	//Abstract method - signature only
	public abstract void employees(String name, String designation, String department);
	
	//concrete or regular methods
	public void employerOfAllEmployees() {
		System.out.println("The Employler of all employee is TWG");
	}

}
