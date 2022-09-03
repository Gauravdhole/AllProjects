package polymorphsm;

public class prog1_2 {
 
	public void sub()
	{
		int a,b,c,d,e;
		a=44;b=96;c=93;d=5;
		e=a+b+c+d;
		System.out.println(" addtion of  four  number" +e);
		
	}
	public void addtion ()
	{
		int a,b,c,d,e;
		a=4;b=6;c=93;d=85;
		e=a-b-c+d;
		System.out.println(" addtion of  four  number" +e);
		
	}
	
	public static void main (String[] args) {
		prog1_2 a =new prog1_2();
		a.sub();
		
	}
	public static void main1 (String[] args) {
		int a;
		a=88;
		prog1_2 v =new prog1_2();
		v.addtion ();
		
	}
}
