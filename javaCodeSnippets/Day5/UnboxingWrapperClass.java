package javaCodeSnippets.Day5;

public class UnboxingWrapperClass {

	public static void main(String[] args) {
		Integer myInt = 100;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	    
	    //Another useful method is the toString() method, which is used to convert wrapper objects to strings.

	    //In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":
	    
	    String myString = myInt.toString();
	    System.out.println(myString.length());
	}

}
