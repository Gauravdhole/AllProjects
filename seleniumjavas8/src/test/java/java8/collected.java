package java8;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSException;

public class collected {
public static void main(String[] args) {
	//list //new list // new list 
	ArrayList<String> name = new ArrayList<String>();
	name.add("Gaurav");
	name.add("Giridhar");
	name.add("jyoti");
	name.add("Ram");
	name.add("Sham");
	
	name.stream().filter(s -> s.startsWith("G")).sorted().map(s -> s.toUpperCase())
	.collect(Collectors.toList());
	  System.out.println(ls.get(0));
	   
	
}
}
