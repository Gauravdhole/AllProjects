package superkeyword;

public class prog1_19 {
	public static  class Main {
		  int x;

		  // Constructor with a parameter
		  public Main(int x) {
		    this.x = x;
		  }

		  // Call the constructor
		  public  static void main (String[] args) {
		    Main myObj = new Main(5);
		    System.out.println("Value of x = " + myObj.x);
		  }
		}
}
