package InheritDemo1;


public class Demo {
	
	public static void main(String args[])
	{
		Car c=new Car();
		
		c.carModel="Carxyz";
		c.speed=23;
		c.startCar();
		c.stopCar();
		
		Benz b=new Benz();
		b.carModel="pqr";
		b.speed=28; 
		b.noOfGears=5;
		b.startCar();
		b.stopCar();
		b.RoofTop();
	}

}
