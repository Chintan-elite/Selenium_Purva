package collection;

import java.util.HashMap;

public class C006_HashmapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(10, "Java");
		map.put(20, "Android");
		map.put(30, "Ios");
		map.put(10, "Php");
		
		System.out.println(map.get(10));
		
		//System.out.println(map);
		
		
		
	}
}
