
public class work11 {

	  int ab;
	  int cd;
	   int gc;
	   work11()        // without argument 
	  {
		   ab =77;
		   cd=99;
		   
		  gc = ab+ cd;	  
		  
	  }	
	 
	   work11( int qq)  // with argument
	 {
		 
		 System.out.println( "print value of qq"+qq);
		 
		 
	 }
	   work11( int qq,int ww)  // with argument
		 {
			 
			 System.out.println( "print value of qq"+qq);
			 System.out.println( "print value of qq"+ww); 
			 
		 }
	   work11( int qq,int ww, int rr)  // with argument
		 {
			 
			 System.out.println( "print value of qq"+qq);
			 System.out.println( "print value of qq"+ww); 
			 System.out.println( "print value of qq"+rr); 
		 }
	 public void addition() {
		 
		  System.out.println( gc);
		  
	 }
	
	
	 public static void main (String[] args ) {
		 
		 work11 gaurav = new work11(1000,596,99687);
		
		 work11 ga = new work11(); 
	
		 ga.addition();
	 }
	
	
}
