package javaCodeSnippets.Day2;

public class Constructor {
	// instance variable
	String address;
	String area;
	String color;
	int noOfBeds;
	
	
	//no-arg constructor
	public Constructor() {
		System.out.println("I enter into no-arg constructor");
		this.address = "Celeste Palce";
		this.area = "Northshore";
		this.color = "White";
		
		System.out.println("I leave from no-arg constructor");
	}
	
	//parameteried constructor
	public Constructor(String address, String area, String color) {
		System.out.println("I enter into parameterized constructor");
		
		this.address = address;
		this.area = area;
		this.color = color;
		
		System.out.println("I leave from parameterized constructor");
	}
	
	//Constructor - constructor overloading
	
	public Constructor(String address, String area, String color, int noOfBeds) {
		System.out.println("I enter into parameterized constructor - constructor overloading");
		
		this.address = address;
		this.area = area;
		this.color = color;
		this.noOfBeds = noOfBeds;
		
		System.out.println("I leave from parameterized constructor -  constructor overloading");
	}
	
	public static void main(String[] args) {
		
		System.out.println("I start with main method");
		
		Constructor obj1 = new Constructor();
		System.out.println(obj1.address + " " + obj1.area + " " +obj1.color );
		System.out.println("I am done with no-arg constructor");
		
		
		Constructor obj2 = new Constructor("Nelson Street","Auckland","Yellow");
		System.out.println(obj2.address + " " + obj2.area + " " +obj2.color );
		System.out.println("I am done with parameterized constructor");
		
		
		Constructor obj3 = new Constructor("Symond Street","Hamilton","Blue", 5);
		System.out.println(obj3.address + " " + obj3.area + " " +obj3.color + " " + obj3.noOfBeds );
		System.out.println("I am done with parameterized constructor - constructor overloading");
		
		
//		Constructor obj4 = new Constructor("Symond Street");
	}

}
