package InterfaceDemo1;

public class TestHospital {

	public static void main(String[] args)
	{

		//By creating object of ApolloHospital, we can access all the methods of all interfaces
		
		ApolloHospital ap = new ApolloHospital();
		
		ap.UKambulanceServices();
		ap.UKENTServices();

		ap.INDemergencyServices();
		ap.INDneuroServices();
		ap.INDorthopedicServices();

		
		ap.USoncologyServices();
		ap.USphysioServices();
		ap.USorthopedicServices();
		
		System.out.println("Static var value= " +	ap.min); //It's giving warning
		System.out.println(USMedical.min); // It's not giving warning
		//USMedical.min=30; Here we can't change value of this variable as it is final


		ap.ApollomedicalInsurance();
		ap.ApolloOPTServices();
		ap.ApollopathalogyServices();
		
		//Calling default method from USMedical Interface
		ap.internship();
		
		//Calling method from GlobalPatientData Class 
		ap.getPatientsHistory();
						
		//Top Casting: We can create a reference of an Interface USMedical
		//Here we can access only USMedical interface's methods
		
		USMedical usMedical = new ApolloHospital();	//Chid class objects refrered by parent interface ref variable
		usMedical.USphysioServices();
		usMedical.USorthopedicServices();
		usMedical.USoncologyServices();
		
		//Calling default method from USMedical Interface using USMedical reference
		usMedical.internship();
		
		//Calling static method from USMedical Interface
		USMedical.USService911();
		
		//Top Casting: We can create a reference of an Interface UKMedical
		UKMedical ukMedical = new ApolloHospital();	
		ukMedical.UKambulanceServices();
		ukMedical.UKENTServices();
		
		//We can't achieve downcasting in Interface: new usMEdical()
		
	}

}
