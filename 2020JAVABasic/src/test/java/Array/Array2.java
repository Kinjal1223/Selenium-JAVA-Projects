package Array;

public class Array2 {

	public static void main(String[] args) {

		 //Declaration, Creation, Assigning or Initialization
		int[] a= {5,6,7};
		
		System.out.println("The first value strored in array is: "+a[0]);
		System.out.println("The second value strored in array is: "+a[1]);
		System.out.println("The third value strored in array is: "+a[2]);
		
		int[] b= {2,3,4,5,6,7,10,11,12,13,123,178,938,37,56,23};
		System.out.println("Size of array: "+b.length); //output:16
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Value of b = "+b[i]);
		}

			
	}

}
