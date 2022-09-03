package constructors;

public class wrk22 {
public static void    addtion (int a, int b) {
	int add;
add= a+b;
System.out.println("ADDTION OF TWO NUMBER = "+ add);
}
	
public static void substriction( int a,int b, int c) {
	
	 int sub;
	 sub= a-b-c;
	 System.out.println(     "SUB  NUMBER =" + sub);
		 
	 
}
	
public static void  employmenti(int employmentidcard,String name,char grade,double saylary) {
	
	System.out.println("employment id=  "+employmentidcard);
	
	System.out.println("name ="+name);
	
	System.out.println("grade ="+grade);
	System.out.println("saylay ="+saylary);
	
}
	














public static void main (String[]args) {
		
		addtion(300, 36900);
		substriction(400,300,200);
		employmenti(135,"av",'A',35000);
			
	}
	
}

