package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class C003_LinkedHashsetDemo {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Java");
		set.add("Php");
		set.add("Android");
		set.add("Ios");
		set.add("Selenium");
		set.add("Java");
		set.add("Php");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}
