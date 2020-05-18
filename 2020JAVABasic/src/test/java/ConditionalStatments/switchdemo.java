package ConditionalStatments;

public class switchdemo {

	public static void main(String[] args) {
		
		int a=1;
		
		switch(a)
		{
		case 0 :
			System.out.println("The value of a is 0");
			break;
			
		case 1 :
			System.out.println("The value of a is 1");
			break;
			
		case 2 :
			System.out.println("The value of a is 2");
			break;
			
		case 3 :
			System.out.println("The value of a is 3");
			break;
			
		default :
			System.out.println("None of the above cases are matched");
			break;
		}

	}

}
