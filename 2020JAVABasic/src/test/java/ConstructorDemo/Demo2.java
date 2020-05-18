package ConstructorDemo;

class Car1
{
	String carModel; 
	double milage;
	int cost;
	public void carDetails()
	{
		System.out.println("Car model: "+carModel);
		System.out.println("Car cost: "+cost);
		System.out.println("Car milage: "+milage);
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		
		Car1 maruti=new Car1();
		Car1 audi=new Car1();

		
		maruti.carModel="Swift VDI";
		maruti.cost=800000;
		maruti.milage=25;
		maruti.carDetails();
		System.out.println("-----------------------");
		
		maruti.carModel="Benz A Class";
		maruti.cost=900000;
		maruti.milage=10;
		maruti.carDetails();
		System.out.println("-----------------------");
	}

}
