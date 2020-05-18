package StringDemo;

public class Demo2 {

	public static void main(String[] args) {

		String s1="Good morning..!!";
		String s2="Hello";
		String s3="     How are you?";
		String s4="Ashish";
		String s5="Good morning..!!";
		String s6="My name is Kinjal Patel";
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s5)); //true
		
		System.out.println(s4.length()); //6
		
		System.out.println(s1.substring(5)); //morning..!!
		
		System.out.println(s3);
		System.out.println(s3.trim()); //space removed from starting od string & ending of string
		
		System.out.println("Index of My: " + s6.indexOf("My")); //0
		System.out.println("Index of name: " +s6.indexOf("name")); //3
		System.out.println("Index of is: " +s6.indexOf("is")); //8
		System.out.println("Index of Kinjal: " +s6.indexOf("Kinjal")); //11
		System.out.println("Index of ashish: " +s6.indexOf("ashish")); //-1
		
		if(s6.indexOf("ashish")==-1)
		{
			System.out.println("This string is not exist");
		}
		
		//Split() Funcion
		
		String s7="My name is ashish";
		String[] s8 = s7.split(" ");
		for(String temp: s8)
		{
			System.out.println(temp);
		}
		
	}

}
