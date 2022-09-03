package java8;

import java.util.ArrayList;

public class Stream2 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Gaurav");
		name.add("Giridhar");
		name.add("jyoti");
		name.add("Ram");
		name.add("Shame");
		// assigne here arraylist into the strem;
		// Strem is nothing but collection of String;
		// it is quick;
		// ther is method is filter .
		// .filter is intermidate operation and count is termional operation;

		// lamdha experssion
		Long c = name.stream().filter(s -> s.startsWith("E")).count();
		System.out.println(c);
		
		

	}
}
