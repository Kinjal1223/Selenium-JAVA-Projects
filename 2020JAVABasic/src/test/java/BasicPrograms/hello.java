package BasicPrograms;

public class hello {
	
    static int a=123;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(a); //output:123
          
           a++;
          System.out.println(a); //output:124
          
          a++;
          System.out.println(a); //output:125
          
          a--; //124
          a--; //123
          a--; //122
          System.out.println(a); //output:122
          
          ++a;
          System.out.println(a); //output:123
          System.out.println(++a); //output:124 pre-increment
          
          System.out.println(a++); //output:124 Print value 'a' & then incremented 
          System.out.println(a++); //output:125 Print value 'a' which is implemented in previous command
          System.out.println(a); //output: 126
          System.out.println(++a); //output:127  post-increment
          System.out.println(++a); //output:128 
          
        	}

}
