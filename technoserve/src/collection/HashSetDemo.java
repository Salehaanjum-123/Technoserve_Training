package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set <String> set=new HashSet<>();
		//add elem
		set.add("apple");
		set.add("banana");
		set.add("strawberrry");
		set.add("cherry");
		set.add("mango");
		set.add("apple");
		System.out.println("Hash set "+set);
	}

}
;