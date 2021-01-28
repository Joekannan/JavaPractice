package javaCodeSnippets.Day2;

public class Class1 {

	String vechicleName;
	
	public Class1() {
		System.out.println("This is Vechicle class");
	}
	
	public void setVechicle(String name) {
		vechicleName = name;
		System.out.println("Printing from set method " + name);
	}

	public String getVechicle() {
		System.out.println("printing from get method " + vechicleName);
		return vechicleName;
	}
}
