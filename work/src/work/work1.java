package work;

public class work1 {
     public static void main (String[] args) {
    	 
    	 // WAP	to	check	payment	is	allowed	on	POS	machine	by	using	nested	if
    	 int pin;               
    	 String atmpin;          
    	 pin= 001;                
    	 atmpin="mastercards";
    	 
    	 if( atmpin  =="maharaj" ) {
    		 
    		 if(pin==001) {
    			 
    			 System.out.println("collect your cash");
    			 
    			 
    		 }
    		 
    		 else{ 
    			 
    			 System.out.println("enter youre correct pin");
    		 }
    		 
    	 }
    		 else
    		 { System.out.println("card is not support");
    		 }
    	 
     }
}
