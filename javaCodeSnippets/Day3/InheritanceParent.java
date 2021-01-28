package javaCodeSnippets.Day3;

public class InheritanceParent {
	
	   String designation = "QA";
	   String employer = "TWG";
	   static String name = "Jothi";
	   
	   public static void printName() {
		   System.out.println("Name is -" + name);
	   }
	   
	   public void does(){
		System.out.println("Testing - I am printing this from parent class - overridden method");
	   }
}
