package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class mapStram {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Gaurav");
		name.add("Giridhar");
		name.add("jyoti");
		name.add("Ram");
		name.add("Sham");
		// print the length is greater than four.with UPPER case which hase last leter i
		// a
		// if you are manupulate stream ther is method manupulated
		Stream.of("Gaurav", "Giridhar", "jyoti", "Ram", "Shame").filter(l -> l.endsWith("v")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// print name which have furst letter as a with uppercase and sorted
		List<String> name1 = Arrays.asList("Gaurav", "Giridhar", "Jyoti", "Ram", "Shame");

		name1.stream().filter(s -> s.startsWith("G")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}
}
