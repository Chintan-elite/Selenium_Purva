package collection;

import java.util.ArrayList;

public class C005_StudentCollection {
	public static void main(String[] args) {
		
		
		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student(10, "purva", "purva@gmail.com"));
		st.add(new Student(20, "PArth", "parth2gmail.com"));
		st.add(new Student(30, "Dhiren", "dhiren@gmail.com"));
		
		
		for(Student s : st)
		{
			s.display();
		}
		
		
		
		
		
	}
}
