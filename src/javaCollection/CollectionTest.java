package javaCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {		
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(8,76,65,34,434,535,43535,34,2323,4342,4,3244,23);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		Set <Integer> set = Set.of(2,8,434,54,2334,23,3123,34,4);
		System.out.println(set);
		
		Map<String, Integer> hmap = Map.of("a",1,"b",2,"c",3);
		System.out.println(hmap);
		
	}

}
