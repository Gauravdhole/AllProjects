package polymorphsm;
/*when a method in a subclass has the same name and type
signature as a method in its superclass, then the method in the subclass is said
to override the method in the superclass. When an overridden method is called
from within its subclass, it will always refer to the version of that method
defined by the subclass. The version of the method defined by the superclass
will be hidden.*/
public class prog1_66 {

	  int i,j;
	  prog1_66( int a,int b){
		  i=a;
		  j=b;
	  }
	  // display i and j
	  void show() {
		  
		  System.out.println("i and j  :  "+i +"  "+ j);
	  }
}
