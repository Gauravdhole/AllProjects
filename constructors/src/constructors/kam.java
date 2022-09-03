package constructors;

public class kam {

	
	double l;
	double h;
	double w;
	
	kam() {
		
	this.l=1;
	this.h=1;
	this.w=1;
	
	}
	//cub
	kam( double side){
		this.l=side;
		
		this.h=side;
		this.w=side;
		
	}
	
	kam( double l,double h,double w){
		this.l=l;
		
		this.h=h;
		this.w=w;
		
	}
	public void kam()
{       h= l*h*w;
		System.out.println(+l);
		System.out.println(+h);
		System.out.println(+w);

}}
