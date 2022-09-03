package inhirtance;

public class reverceArray {
	public static void main(String[] args) {
		int [] abc = {11,22,33,44,55,66,77,88,99};
		for( int i =0;i<abc.length;i++) {
			System.out.println(abc[i]+ " ");
		}
		//n-1= index
		//index=8;
		//abc.length=index;
		
		System.out.println("__________________");
		
		
		for( int i= abc.length-1;i>=0;i--) {
		System.out.println(abc[i]);
		}
	}
}
