package StaticMethods;

public class Demo {

	public static void main(String args[])
	{
		
		Car benz=new Car();
		benz.milage=20; //access instance variable with class object
		benz.cost=20111112;
		System.out.println(Car.wheels); //access static variable with class name
		benz.methodX();
		
		Car audi=new Car();
		audi.cost=22249234;
		audi.milage=30;
		System.out.println();
		
	}
	
	
}
