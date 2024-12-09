package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set <String> set=new TreeSet<>();
		//add elem
		set.add("apple");
		set.add("banana");
		set.add("strawberrry");
		set.add("cherry");
		set.add("mango");
		set.add("apple");
		System.out.println("Tree set "+set);
	}

} 
