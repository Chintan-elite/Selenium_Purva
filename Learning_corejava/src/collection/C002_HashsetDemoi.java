package collection;

import java.util.HashSet;
import java.util.Iterator;

public class C002_HashsetDemoi {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>();
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
