package java8;

import java.util.ArrayList;

public class stram1 {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Gaurav");
		name.add("Giridhar");
		name.add("jyoti");
		name.add("Ram");
		name.add("Shame");
		int count = 0;
		for (int i = 0; i < name.size(); i++) {
			String actual = name.get(i);
			if (actual.startsWith("G")) {
				count++;

			}
		}

		System.out.println(count);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
