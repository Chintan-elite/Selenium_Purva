package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> subject = new ArrayList<>();
		subject.add("Java");
		subject.add("Php");
		subject.add("Android");
		subject.add("Ios");
		subject.add("Selenium");
		subject.add(null);
		subject.add("Java");
		
		
		//System.out.println(subject.size());
		
		//System.out.println(subject.get(1));
		
		//subject.add(2,"javascript");
		
		subject.set(1, "javascript");
		
		
		for(String s : subject)
		{
			System.out.println(s);
		}
		
		System.out.println("********************************");
		
		
		ArrayList<Integer> rollno = new ArrayList<>();
		rollno.add(10);
		rollno.add(20);
		rollno.add(30);
		
		for(Integer i : rollno)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println("********************************");
		
		ArrayList all = new ArrayList<>(subject);
		all.add(10);
		all.add(10.33);
		all.add("abcd");
		all.add('a');
		all.addAll(rollno);
		all.addAll(subject);
		
//		for(Object o : all)
//		{
//			System.out.println(o);
//		}
		
		
		Iterator itr = all.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
