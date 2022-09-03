package gaurav;

public class reverseString {

	public static void main(String[] args) {
		
	//1) by using loop 	
		String s = "selenium";
		String rev = "";
		int len = s.length();
		for ( int i=len-1;i>=0;i--)
		{
			 rev = rev +s.charAt(i);
			
		}
		System.out.println(rev);
	}

	//2) byusing string bufferclasss;
	 StringBuffer sf = new StringBuffer(s);
	 System.out.println(sf.reverse());
	
}
// reverce is not functoion; why? string is immutable object.
// s.string isnot avaible 