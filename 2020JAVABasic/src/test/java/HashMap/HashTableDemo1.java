package HashMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo1 {

	public static void main(String[] args) {

		System.out.println("\n---------------Concept 1-------------------");
		Hashtable h1 = new Hashtable();
		h1.put(1, "Kinjal");
		h1.put(2, "Ashish");
		h1.put(3, "Selenium");
		System.out.println("Value from h1 " + h1);
		
		
		

		System.out.println("\n\n---------------Concept 2-------------------");
		//Create a clone copy of HashTable
		Hashtable h2 = new Hashtable();
		
		//Duplicate object h2 which has all the value of h1
		h2 = (Hashtable) h1.clone();
		
		System.out.println("Value from h2 " + h2);
		
		
		
		
		
		System.out.println("\n\n---------------Concept 3-------------------");

		h1.clear();
		System.out.println("h1 values are cleared");
		System.out.println("Value from h1 " + h1);
		System.out.println("Value from h2 " + h2);
		
		
		
		
		//Contain Value
		System.out.println("\n\n---------------Concept 4-------------------");

		Hashtable h3 = new Hashtable();
		h3.put("A", "JAVA");
		h3.put("B", "Selenium");
		h3.put("C", "SQL");
		
		if(h3.containsValue("JAVA"))
			System.out.println("Value is found in h3");
		
		//Print all the values from hashtable using -- enumeration -- using elements() method
		Enumeration e = h3.elements();
		
		System.out.println("*****Print values from h3 using Enumeration*****");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
		
		System.out.println("\n\n---------------Concept 5-------------------\n");
		
		//get all the values from hashtable using  -- entySet() -- set of hashtable values
		
		System.out.println("*****Print values from h3 using Entry Set*****");
		
		Set s = h3.entrySet();
		System.out.println("Values from h3 using Entry set " + s);

		
		
		
		System.out.println("\n\n---------------Concept 6-------------------\n");

		//Creating same hashtable as h3
				
	    Hashtable h4 = new Hashtable();
		h4.put("A", "JAVA");
		h4.put("B", "Selenium");
		h4.put("C", "SQL");
		h4.put("C", "SQL"); //will not display as HashTable contains only unique value
		
		//Both will give Exception as HashTable not contain any null key, and null values
		h4.put("NULL", "SQL");
		h4.put("D", "NULL");


		//check both hashtable are equal of not
		System.out.println("***** Checking HAshTable h3, h4 are equals or not*****");

		if(h3.equals(h4))
			System.out.println("Both are equal");
		
		
		
		
		
		System.out.println("\n\n---------------Concept 7-------------------\n");

		//get the value from key
				
		System.out.println("***** Get the value from key*****");

		System.out.println(h4.get("A"));
		
		
		
		
		
		System.out.println("\n\n---------------Concept 8-------------------\n");

		//get the hashcode of hashtable object
		
		System.out.println("***** Get the HashCode of HashTable Object*****\n");
		
		System.out.println("HashCode value of h4:  " +h4.hashCode());

		
		
		
		System.out.println("\n\n---------------Concept 9-------------------\n");

		//Generics
		 
		Hashtable<String , String> h5 = new Hashtable<String , String>(); 
		
	}

}
