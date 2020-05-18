package WhileStatments;

public class fordemo {

	public static void main(String[] args) {

		for (int i=0;i<6;i++)
		{
			if(i==3)
			{
				// break; // break will come out of all loops. will not continue 
				continue; // continue will skip specified condition in if statement and continue further  
			}
			System.out.println("The value of i is: "+i);
		}
		
	}

}
