package ConstructorDemo;

class Car
{
	String carModel;
	public Car()
	{
		System.out.println("Inside car class constructor");
	}
	
	public void startCar()
	{
		System.out.println("Car Started");
	}
	
}

public class Demo1 {

	public static void main(String[] args) {

			Car c1 = new Car();
			c1.startCar();
	}
	
}
