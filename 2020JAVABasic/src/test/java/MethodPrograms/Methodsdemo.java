package MethodPrograms;

public class Methodsdemo {

	public static void main(String[] args) {

		int a=20, b=10;
		int c= a+b;
		System.out.println("Sum= "+c);
		System.out.println("\n");

		
		methodA();
		System.out.println("\n");
		
		methodB(10);
		System.out.println("\n");

		methodC(50,50.55,'$',"Hello",true);
		System.out.println("\n");

		//methodC(10);
		
		int v = methodD();
		System.out.println("Value witten by methodD is: "+v);
		System.out.println("\n");

		
		String k = methodE();
		System.out.println("Value witten by methodE is: "+k);
		
	}
	
	public static void methodA()
	{
		System.out.println("Inside methodA");
	}
	
	public static void methodB(int x)
	{
		System.out.println("Value of x is "+x);
	}
	
	public static void methodC(int i,double p,char q,String r,boolean z)
	{
		System.out.println("Value of x is:"+i+", Value of p is: "+p+", Value of q is: "+q+", Value of r is: "+r+", Value of z is: "+z);
	}
	
	public static int methodD()
	{
		System.out.println("Inside methodD");
		
		return 5;
	}

	public static String methodE()
	{
		System.out.println("Inside methodE");
		
		return "Hello..!! It's methodE";
	}
}
