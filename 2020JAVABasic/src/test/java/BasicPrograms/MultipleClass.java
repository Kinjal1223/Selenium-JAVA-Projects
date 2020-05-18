package BasicPrograms;

//import multipleClass.Car;
//import multipleClass.String;

class Car
{
	String model;
	int cost;
	String Color;
	public void startCar()
	{
		System.out.println(model + "Started");

	}
	public void StopCar()
	{
		System.out.println(model + "Stopped");

	}
	public void CarDetails()
	{
	 System.out.println("The model of car is: "+ model);
	 System.out.println("The cost of car is: "+ cost);
	 System.out.println("The color of car is: "+ Color);
	}
}


public class MultipleClass {

	public static void main(String[] args) {

		Car Maruti = new Car();
		Car Benz = new Car();
		Car Audi = new Car();
		
		Maruti.Color="White";
		Maruti.cost=50000;
		Maruti.model="ABC";
		
		Maruti.startCar();
		Maruti.CarDetails();
		Maruti.StopCar();
		
		// Benz Car details: 
		/*
		Benz.Color="Red";
		Benz.cost=60000;
		Benz.model="PQR";
		Benz.startCar();
		Benz.StopCar();
		Benz.CarDetails();
		*/ 
		
		// Benz Car details: 
		/*
		Audi.Color="Grey";
		Audi.cost=70000;
		Audi.model="XYZ"; 
		Audi.startCar();
		Audi.StopCar();
		Audi.CarDetails();
		*/
		
	}

}


