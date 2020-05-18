package BasicPrograms;

public class StringImmutableDemo {

	public static void main(String[] args) 
	{

		String str = "JAVA";
		System.out.println(str); //Output: JAVA
		str.toLowerCase();
		System.out.println(str); //Output: JAVA
		
		String str1 = str.toLowerCase();
		System.out.println(str1); //Output: java
	}
}
