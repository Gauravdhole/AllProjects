package polymorphsm;

public class prog2_10 {

	 
	private  String adharnumber;
	 
	 
	 public void  GAURAV (  String raju) {
		 adharnumber = raju ;
		  
	 }
	 public void display() {
		 
		 System.out.println(" raju ka adharnumber kya h   ="+adharnumber);
	 }
	
	 public static void main (String [] args) {
		 
		 prog2_10 a = new prog2_10();
		
		a.GAURAV("4545544");
		 a .display();
		 
	 }
}
