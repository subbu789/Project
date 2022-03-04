package com.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("first", "Abdevilliers");
		linkedHashMap.put("second", "Cristiano");
		linkedHashMap.put("third", "Chrisgayle");

		//Ctrl + Shift + O
		Set<String> keys = linkedHashMap.keySet();
		for(String key : keys) {
			System.out.println(key);

	}

}
}
