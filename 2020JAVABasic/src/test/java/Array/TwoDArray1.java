package Array;

public class TwoDArray1 {

	public static void main(String[] args) {

		int[][] a = {{6,7,8},{1,2,3}};
		
		System.out.println("a[0][0]="+a[0][0]);
		System.out.println("a[0][1]="+a[0][1]);
		System.out.println("a[0][2]="+a[0][2]);
		System.out.println("a[1][0]="+a[1][0]);
		System.out.println("a[1][1]="+a[1][1]);
		System.out.println("a[1][2]="+a[1][2]);

		int[][] b = {{11,12,13},{14,15,16,17}};
		System.out.println("Length of array: "+b.length);
		System.out.println("Length of b[0]: "+b[0].length); //display first bracket total values
		System.out.println("Length of b[1]: "+b[1].length); //display second bracket total values
		
		for(int i=0;i<b.length;i++) //b.length is 2
		{
			for (int j=0;j<b[0].length;j++) //b[0] length is 3
					{
				      System.out.print(b[i][j]+ " "); 
				    //  System.out.println(b[i][j]);  
					}
			System.out.println();
		}
		
	}
	

}
