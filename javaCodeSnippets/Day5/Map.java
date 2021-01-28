package javaCodeSnippets.Day5;

import java.util.HashSet;
import java.util.Set;

public class Map {
	public static void main(String[] args) 
	{		
		Set hSet = new HashSet();
		hSet.add("test");
		hSet.add("test");
		hSet.add(123);
		hSet.add(null);
		hSet.add(55.22);
		
		System.out.println("Size of the list " + hSet.size());
	 
		//Printing list of values using Enhanced For loop
		System.out.println("Printing the List of values using for-each");
		for(Object o:hSet)
		{
			System.out.println("Element is " + o);
		}
		
	}
}
