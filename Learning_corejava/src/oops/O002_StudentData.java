package oops;

import java.util.Scanner;

class Student
{
	
	
	
	int id;
	String name;
	static String clg;
	
	Student(int a, String b)
	{
		id = a;
		name=b;
	}
	
	Student(String b)
	{
		name=b;
	}
	
	Student(int a)
	{
		id = a;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+clg);
	}
}



public class O002_StudentData {

	
	
	public static void main(String[] args) {
		
		Student.clg="sanv";
		
//		Student std = new Student();
//		std.id=10;
//		std.name="purva";
//		std.display();
//		
//		Student std1 = new Student();
//		std1.id=11;
//		std1.name="test";
//		std1.display();
		
		
		Student s = new Student(10,"Purva");
		s.display();
		Student s1 = new Student(20, "Kinjal");
		s1.display();
		
		Student s2 = new Student("purva");
		s2.display();
		
		Student s3 = new Student(10);
		s3.display();
		
		
	}
}
