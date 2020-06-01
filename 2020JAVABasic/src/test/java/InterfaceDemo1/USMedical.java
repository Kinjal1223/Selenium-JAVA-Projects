package InterfaceDemo1;

public interface USMedical extends WHO

{
	//interface var are static and final by default
	int min=10;
	
	public void USphysioServices();
	public void USoncologyServices();
	public void USorthopedicServices();
	
	//We can have same methods in more than one Interfaes
	public void USRadioLogyService();
	
	/*
	
	 *We Can't create the object of interfaces
	  USMedical usMedical = new USMedical(); //This will give an error
			
	 *Static method are not allowed in Interface: because we can't override static methods
      public static void USphysioServices(); 

	 *Only method declaration -- Method Prototype -- No Method Body -- Also called Abstract Method
	 
	 *interface var are static and final by default
	 
	*/
	
	/*
	
	*Can can't have method body in Interface
	public void USService_911()
	{
		
	}
	*/
				
	//From JDK1.8 , we can have static method in interface
	//We can't override this method
	public static void USService911()
	{
		System.out.println("US - 911 services");
	}
	
	//Here default method can't be Static: Like default static void internship(){}
	//We can't override thid method
	default void internship()
	{
		System.out.println("US - internship");
	}

}
