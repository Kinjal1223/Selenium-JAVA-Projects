package StaticMethods;

public class Car {
	
	int cost; //instance variable
	double milage; //instance variable
	static int wheels=4; //static variable , variable sharing common value is kept in static variable so here, benz & audi has common wheels=4

	//static methods
	public static void startCar()
	{
		Car c1 = new Car(); //to access non-static, create object of the class & access them 
		c1.cost=43242424;
		c1.milage=10;
		c1.methodX();
		
		System.out.println(wheels);
		methodY();
			
	}
	
	//Non-static mathod
	public void methodX()
	{
		System.out.println(cost);
		System.out.println(milage);
		System.out.println(wheels);
		
		startCar();
		methodX();
	}
	
	//static method
	public static void methodY()
	{
		
	}
	
	
}

