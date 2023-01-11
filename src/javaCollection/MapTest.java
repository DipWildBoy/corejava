package javaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
//		Map<String, Integer> hmap= new HashMap<>();
//		Map<String, Integer> hmap= new TreeMap<>();
		Map<String, Integer> hmap= new LinkedHashMap<>();
		
		hmap.put("Kamal", 29);
		hmap.put("Pawan", 22);
		hmap.put("Suman", 18);
		hmap.put("Anup", 27);
		hmap.put("Radha", 30);
		hmap.put("Raja", 19);
		for (String key: hmap.keySet()) {
			System.out.println(key + "=" +hmap.get(key));
		}
	}

}
