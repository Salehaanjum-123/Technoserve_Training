package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo {


	public static void main(String[] args) {
		Set <String> set=new HashSet<>();
		//add elem
		set.add("apple");
		set.add("banana");
		set.add("strawberrry");
		set.add("cherry");
		set.add("mango");
		//display
		System.out.println("Initial set "+set);
		//remove
		set.remove("banana");
		System.out.println("set after removing banana "+set);
		//check if elem is present
		boolean containapple =set.contains("apple");
		System.out.println("set contains apple "+containapple);
		//size of set
		int size=set.size();
		System.out.println("set size is "+size);
		//check if set is empty
		boolean empty=set.isEmpty();
		System.out.println("set is empty? "+empty);
		//iterate
		System.out.println("iterating over the elements ");
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		//clear
		set.clear();
		System.out.println("after clear operation "+set);
	}

}
