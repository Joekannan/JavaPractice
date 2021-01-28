package javaCodeSnippets.Day2;

public class ClassesAndObjects {
	
	
	static // Object is house
	String color = "White";
	String area = "Northshore";
	String address = "Celeste Palce";

	public static void main(String[] args) {
		
		System.out.println(color);
		
		ClassesAndObjects house = new ClassesAndObjects();
		System.out.println(house.color);
		System.out.println(house.area);
		System.out.println(house.address);
		
	}

}
