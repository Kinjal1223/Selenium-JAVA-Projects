package ConditionalStatments;

public class switchdemo1 {

	public static void main(String[] args) {
		
		String a="Nice";
		
		switch(a)
		{
		case "One" :
			System.out.println("The value of a is One");
			break;
			
		case "Two" :
			System.out.println("The value of a is Two");
			break;
			
		case "Three" :
			System.out.println("The value of a is Three");
			break;
			
		case "Four" :
			System.out.println("The value of a is Four");
			break;
			
		default :
			System.out.println("None of the above cases are matched");
			break;
		}

	}

}
