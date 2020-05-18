package ExceptionHandling;

public class Demo {

	public static void main(String args[])
	{
		// int a="xyz"; //compile time error
		
		System.out.println("Before Exception");
		
		try
		{
			int a =10/0;
			System.out.println("Inside try block");

		}
		catch(Exception e)
		{
			System.out.println("Exception is handled here");
		}
		
		System.out.println("After Exception");
	}
	
}
