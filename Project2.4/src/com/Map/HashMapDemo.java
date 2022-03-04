package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

			HashMap<Integer, String> map = new HashMap<>();

			map.put(1, "Subhani");
			map.put(2, "Abdevilliers");
			map.put(3, "Chrisgayle");
			map.put(3, "Cristiano");
			map.put(null, "BHeemlanayak");
			map.put(null, "Lionelmessi");

			System.out.println(map.get(1));
			System.out.println(map.get(3));

			Set<Integer> keys = map.keySet();
			for(Integer d: keys) {
				System.out.println(d);
	}
			Collection<String> values = map.values();
	for(String d: values) {
		System.out.println(d);
	}

	}

}
