package MethodOverriding;

public class Demo {
	
	public static void main(String args[])
	{
		Car c=new Car();
		c.startCar();
		
		Benz b=new Benz();
		b.startCar();
		b.startCar(5);
	}

}
