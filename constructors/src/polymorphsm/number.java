package polymorphsm;

public class number {
 void sum( int a,int b) {
	 
	 System.out.println("value of a and b ="+a);
	 System.out.println("value of a and b ="+b);
	
 }
 void sum( int a,int b,int c) {
	 
	 System.out.println("value of a and a ="+a);
	 System.out.println("value of a and b ="+b);
	 System.out.println("value of a and c ="+c);
 }
 public static void main (String[] args ) {
	 
	  number obj = new number();
	  obj.sum(555 ,669);
	  obj.sum(55,996,66);
	  
 
 
 
 }
}
