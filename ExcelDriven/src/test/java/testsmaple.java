import java.io.IOException;
import java.util.ArrayList;

public class testsmaple {

	public static void main(String[] args) throws IOException {
		
		
		dataDriven dk= new dataDriven ();
		
		 ArrayList dat= dk.getData("Add Profile");
		 
		 System.out.println(dat.get(0));
		 System.out.println(dat.get(1));
		 System.out.println(dat.get(2));
		 System.out.println(dat.get(3));
	}
}
