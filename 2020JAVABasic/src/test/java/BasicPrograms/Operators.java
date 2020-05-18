package BasicPrograms;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12, b=11, c=12, d=10;
		
		System.out.println(a==b); //output: false
		System.out.println(a==d); //output: false
		System.out.println(a=d); //output: a=10
		System.out.println(a==d); //output: true Because here a=10
		System.out.println(a!=b); //output: true
		System.out.println(a!=c); //output: true
		
		 System.out.println("\n");
		
		System.out.println(true&&true); //true
		System.out.println(true&&false); //false
		System.out.println(false&&true); //false
		System.out.println(false&false); //false
		
		System.out.println("\n");
		
		System.out.println(true||true); //true
		System.out.println(true||false); //true
		System.out.println(false||true); //true
		System.out.println(false||false); //false
		
		System.out.println("\n");

		System.out.println(!true); //false
		System.out.println(!false); //true
		
		System.out.println("\n");
		
		int x=4;
		x/=4;
		System.out.println(x); //output: 1
		
		int y=4;
		y+=4;
		System.out.println(y); //output: 8
		
		int z=4;
		z*=4;
		System.out.println(z); //output: 16
		
		int p=5;
		p%=2;
		System.out.println(p); //output: 1 display remainder
		
		System.out.println("\n");

		int l=45, m=15;
		int r = l>m ? 6 : 9; 
		int s = l<m ? 2 :7;
		
		System.out.println(r); //output: 6
		System.out.println(s); //output: 7
	}

}

