package javaCodeSnippets.Day2;

public class Class2Static {

	public static void main(String[] args) {
		//No need to create object to access static methods and variable from Parent class 
		Class1Static.setStudentName("Nagajothi");
		Class1Static.getStudentName();
		
		//Object is required to access the non static methods and members from parent class
		Class1Static obj = new Class1Static();
		obj.setStudentAge(25);
		obj.getStudentAge();
	}

}
