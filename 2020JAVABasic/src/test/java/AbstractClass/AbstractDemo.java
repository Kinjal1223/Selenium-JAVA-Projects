package AbstractClass;

public abstract class AbstractDemo {
	
	public abstract void startCar();
	
	public void stopCar()
	{
		System.out.println("Stop Car in abstractdemo1");
	}

}

abstract class sub extends AbstractDemo
{
	
}

class XYZ extends sub
{
	
	public void startCar() {
		
		System.out.println("Start car in XYZ");
		
	}
	
}
