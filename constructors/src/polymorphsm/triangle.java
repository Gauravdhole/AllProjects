package polymorphsm;

public class triangle  extends figure {

	triangle( double a, double b){
		
		super(a,b);
		
	}
	double area() {
		
		System.out.println(" inside area of triangle .");
		return dim1*dim2/2;
		
	}
}
