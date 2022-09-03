package polymorphsm;

public class prog2_2 extends prog2_1 {
 int k;
  prog2_2( int a,  int b,  int c){
	 
	 super(a,b);
	 k=c;
	 
	 
 }
  // overload show()
  void show(String[] msg ) {
	  
	  System.out.println("mes"+k);
  }
}
