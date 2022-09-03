package java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream3 {
public static void main(String[] args) {
	ArrayList<String> name = new ArrayList<String>();
	name.add("Gaurav");
	name.add("Giridhar");
	name.add("jyoti");
	name.add("Ram");
	name.add(",");
	 //option:;
	// ther is no life for   intertmidate opertion if ther is no ternianal op
	// terminal opertion  will  excuted  only if  internal opertion is returm true(filter)
	// hoiw to used filter in stream api;
	Stream.of("Gaurav","Giridhar","jyoti","Ram","Shame").filter(l->l.startsWith("G")).count();
	
	
	
	
	
	
}
}
