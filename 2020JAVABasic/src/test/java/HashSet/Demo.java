package HashSet;

import java.*;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		
		hset.add("My ");
		hset.add("name ");
		hset.add("is ");
		hset.add("Kinjal ");
		
		for(String temp:hset)
		{
			System.out.println(temp);
		}
		
		
	}

}
