//Static	 method	 and	 non-static	 method	 call	 from	 same	 and	 different	 class	 with	
//parameter,	without	parameter	.
public class assignment1 {
// addition 
	public static  void addtion ( int a,int b) {
		 int c;
		 
		 c=a+b;
		 System.out.println("addtion od two number =" +c);
		
	}
	public static void sub() {
		int num1 =500;
		int num2= 400;
		
		int   sub =  num1- num2;
		{System.out.println("substriction of two number = " +sub);}
	}
	
	// non static =="bank account"
	public void  bank( int acount , String name,int pin, int age)
	{
		System.out.println("acount number is  ="+ acount);
		System.out.println("  acount name is  ="+ name);
		System.out.println("pin is ="+ pin );
		System.out.println(" age is = " +age );
		
	}	
	// non static without parameter== 
	 // Addtion and division 
	public void add()
	{
		 int num5=500;
		 int num6 =600;
		int  num7=num6+num5;      //  
		int  num8=num6/num5;
		
		System.out.println(" addtion of two number and division ="+num7);
		System.out.println(" addtion of two number and division ="+num8);
	}	
	
public static void main(String[]args) {
	addtion(200,600);
	sub();
	
	assignment1 acount= new assignment1 ();
	acount.bank(15001020, "anuj", 440010, 95);
	assignment1 add =new assignment1();
	add.add();

	
	
	
}	
	
}
