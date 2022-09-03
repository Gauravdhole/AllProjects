package polymorphsm;

public class prog1_67 extends  prog1_66 {

	 int k;
	 prog1_67 ( int a, int b, int c)
	 {
		super(a, b);
		k=c;
		 
	 }	
	 //display k_ this  overrides show() in prog1_66
	 public void show () {
		super.show();
		 System.out.println("k = "+k);
	 }
}
