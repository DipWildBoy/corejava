package javaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<String> hset = new HashSet<>();
//		Set<String> hset = new TreeSet<>();
//		Set<String> hset = new LinkedHashSet<>();
		hset.add("Ram");
		hset.add("Hari");
		hset.add("Rama");
		hset.add("Ram");
		hset.add("pawan");
		hset.add("Aaron");
		hset.add("Bishnu");
		hset.add("Hari");
		for (String s : hset) {
			System.out.println(s);
		}
		
	}

}
