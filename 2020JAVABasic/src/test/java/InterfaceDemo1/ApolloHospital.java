package InterfaceDemo1;

public class ApolloHospital extends GlobalPatientData implements USMedical, UKMedical, IndiaMedical 
{

	//Overriden methods from interfaces
	@Override
	public void USphysioServices()
	{
		System.out.println("AP - Physio");
	}
	
	@Override
	public void USoncologyServices()
	{
		System.out.println("AP - Oncology");
	}
	
	@Override
	public void USorthopedicServices()
	{
		System.out.println("AP - USorthopedicServices");
	}
	
	@Override
	public void USRadioLogyService()
	{
		System.out.println("AP - USRadioLogyService"); //This method in USMedical,UKMedical, INDMedical
	}
	
	@Override
	public void WHOpolioServices() 
	{
		System.out.println("AP - WHOpolioServices");
	}

	@Override
	public void UKENTServices()
	{
		System.out.println("AP - ENT");
	}

	@Override
	public void UKambulanceServices() 
	{
		System.out.println("AP - Ambulance");
	}

	@Override
	public void INDemergencyServices() 
	{
		System.out.println("AP - Emergency");
	}

	@Override
	public void INDneuroServices() 
	{
		System.out.println("AP - Neuro");
	}
	
	@Override
	public void INDorthopedicServices() 
	{
		
	}
	
	//Non-Overriden Method from this class ApolloHospital
	
	public void ApolloOPTServices()
	{
		System.out.println("AP - OPTServices");
	}
	
	public void ApollomedicalInsurance()
	{
		System.out.println("AP - medicalInsurance");
	}
	
	public void ApollopathalogyServices()
	{
		System.out.println("AP - pathalogyServices");
	}

	

	
}
