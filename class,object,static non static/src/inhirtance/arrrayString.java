package inhirtance;

public class arrrayString {
public static void main(String[] args) {
	
	// decaration
	
	String []abc =  new String [3];
	// initation
	abc[0]= "sachin";
	abc[1]="ramesh";
	abc[2]="tendulkar";
	
	// use
	for( String gaurav:abc) {
		System.out.println(gaurav);
	}
	
	for( int i = 0;  i<=2;i++)
    {
		System.out.println(abc[i]);
     }
	
}


}
