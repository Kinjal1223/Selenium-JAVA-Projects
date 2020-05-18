package Array;
import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String args[])
	{
		//Traditional Array
		
		int[] a = new int[3];
		a[0]=5;
		a[1]=6;
		a[2]=7;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("ArrayList Output:");
		
		//ArrayList: Resizable array
		
		/* 
		
		List<Integer> li;
		li=list;
		li.add(7);
		li.add(8);
		li.add(9);
		li.add(10);
		li.add(11);
		
		List<Integer> list= new ArrayList<Integer>(); ArrayList object creation OR
		Collection<Integer> list= new ArrayList<Integer>(); ArrayList object creation
		*/
		
		ArrayList<Integer> list= new ArrayList<Integer>();  // Here 'Integer' is wrapper class of 'int' which stores the object
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		
		/*
		 
		System.out.println("Second: " +list.get(1));
		System.out.println("Third: " +list.get(2));
		System.out.println("Forth: " +list.get(3));
		System.out.println("Fifth: " +list.get(4));
		
		OR */

		/*
		 for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		*/
		
		for(Integer temp:list)
		{
			System.out.println(temp);
		}
		
		

	}

}
