package java8;

import java.util.ArrayList;

public class Stream4 {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Gaurav");
		name.add("Giridhar");
		name.add("jyoti");
		name.add("Ram");
		name.add("Sham");
		// print all the name of array list (present stream) name converted into stream
		// i want to print the lenth is greater than four
		// action is lenght of stream is greater than four (s->s.length()>4)
		// forEach== grap each every item( extracted ) 
		name.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        //name .stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
}
