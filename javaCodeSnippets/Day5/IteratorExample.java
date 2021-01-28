package javaCodeSnippets.Day5;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) 
	{	
		HashSet hSet = new HashSet();
		hSet.add("test");
		hSet.add(123);
		hSet.add(null);
		hSet.add(55.22);
		System.out.println("Elements of the Set are  " + hSet);
		Iterator itr = hSet.iterator();
	    while(itr.next() != null)
	    {
	    	System.out.println("Element is " + itr.next());
	    }	
	}
}
