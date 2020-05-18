package WrapperClass;


class Car1
{
	String carModel; 
	double milage;
	int cost;
	
	public Car1(String a, int b, double c)
	{
		carModel=a;
		cost=b;
		milage=c;
	}
	
	public void carDetails()
	{
		System.out.println("Car model: "+carModel);
		System.out.println("Car cost: "+cost);
		System.out.println("Car milage: "+milage);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
		Car1 maruti=new Car1("Swift VDI",800000,25);
		
		Car1 audi=new Car1("Benz A Class", 900000, 10);
		
		maruti.carDetails();
		System.out.println("-----------------");
		maruti.carDetails();

	}

}
