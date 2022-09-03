package polymorphsm;

public class rectangular  extends figure {
 
	rectangular (double a, double b){
		super(a,b);
		
		
	}
	double area ()
	{
	System.out.println("inside area for rectangle .");
	return dim1*dim2;
	
		
	}	
	
}
