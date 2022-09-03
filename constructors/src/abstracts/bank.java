package abstracts;

public abstract  class bank {

	
	 int amt =100;
	  final int rate = 10;
	   static  int LoanRate =5;
	   
	
	
	
	public abstract void loan ();
	//  abstact method .. no method body.
	 public void creadit  () {
		 System.out.println(" bank---- credit");
	 }
	 public void debit  () {
		 System.out.println(" bank---- debit");
	 }
}
