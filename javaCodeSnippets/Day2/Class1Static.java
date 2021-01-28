package javaCodeSnippets.Day2;

public class Class1Static {
	
	static String studentName;
	int studentAge;
	
	public Class1Static() {
		System.out.println("I am from the constrcutor");
	}
	
	public static void setStudentName(String name) {
		studentName = name;
		System.out.println("Static student name from set method - " + name);
	}
	
	public static String getStudentName() {
		System.out.println("Static student name from get method - " + studentName);
		return studentName;
	}
	
	public void setStudentAge(int age) {
		studentAge = age;
		System.out.println("Non Static student age from set method - " + age);
	}
	
	public int getStudentAge() {
		System.out.println("Non Static student age from get method - " + studentAge);
		return studentAge;
	}
}
