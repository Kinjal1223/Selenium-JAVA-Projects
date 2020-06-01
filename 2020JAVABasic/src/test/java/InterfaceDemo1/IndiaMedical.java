package InterfaceDemo1;

public interface IndiaMedical {

	public void INDemergencyServices();
	public void INDneuroServices();
	public void INDorthopedicServices();
	
	//We can have same methods in more than one Interfaes
	public void USRadioLogyService();

	
	public static void dengueServices()
	{
		System.out.println("Indian --- dengueServices");
	}
}
