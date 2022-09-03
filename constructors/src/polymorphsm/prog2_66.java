package polymorphsm;

public class prog2_66 {
 
	public static  int addition ()
	{
		 int a = 45;
		 int b = 99;
		 int c1;
		  c1=a+b;
		  return  c1 ;		
	}	
	
	
	public  static double  salary () {
		
		double saloEmp  = 556965;
		return saloEmp;
	}
	
	 public static  String  name () {
		  
		  String name = "gaurav";
		
		return  name ;
		  }
	 public static void main (String [] args ) {
		 
		 
		  System.out.println(" kya name he ="+ name ());
		 
		  double res = salary();
		  System.out.println(" output of salary is ="+ res);
		 
		 
		 
		 
		  
		 int  result ;
		  result = addition ();
		  System.out.println(" output of value of c is ="+ result);
		  addition ();
		 
		 
		 
		 
	    
	    
	 }
}
