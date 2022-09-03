package polymorphsm;

public class prog1_1 {

             public void addition () {
            	 int a,b,c,d;
            	 a=77;b=88;c=669;
            	 d=a+b+c;
            	  System.out.println(" ADDTION OF TWO NUMBER = "+d);
		 
	 }
                  public void addition ( int a) {
                	  System.out.println(" addition of same int number ="+(a+a));
		 
	 }
                        public void addition ( int a,int b) {
                        	System.out.println(" additon of  two  int number ="+(a+b));
	 
}
                            public void addition ( int a, int b, int c) {
                            	System.out.println(" addition of three number ="+(a+b+c));
	 
}
                                 public void addition ( int a, int b,int c,int d) {
                                	 System.out.println("addition of three diddernt number ="+(a+b+c+d));
                               
	 
}
                                   public void addition (String name) {
                                	   System.out.println(" most dangerous man  ="+name);
	 
}
	                                public static void main (String [] args) {
	                                	
	                                	prog1_1 banupratab_sing = new prog1_1();
	                                	banupratab_sing.addition(" rajatakur");
	                            
	                                	banupratab_sing.addition(10);
	                                	banupratab_sing.addition();
	                                	banupratab_sing.addition(10,20);
	                                	banupratab_sing.addition(10,20,66);
	                                	banupratab_sing.addition(10,20,30,40);
	                               
	                                }
}
