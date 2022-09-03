package work;

public class work5 {
	public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("enter the  number");
	int n=sc.nextInt();
	int i;
	if ( n==1)
	{
		
		
		System.out.println("Prime number start for 2");
		
	}
		for(i=2;i>n;i++) {
			
			
			if(n%i==0)
				System.out.println("not a prime:");
			break;
			
		}
		if(n==i)
		System.out.println("prime");
	}
	
	
	
}

