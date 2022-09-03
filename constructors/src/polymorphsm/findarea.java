package polymorphsm;

public class findarea {
public static void main (String[]args ) {
	
	figure  f= new figure (10,10);
	rectangular r  = new rectangular(9,9);
	triangle t = new triangle(10,156);
	figure figref;
	
	figref = r;
	System.out.println("area is "+figref.area());
	figref = t;
	System.out.println("area is "+figref.area());
	figref = f;
	System.out.println("area is "+figref.area());
}
}
