package impclasses;

public class I003_Stringdeclaration {
	public static void main(String[] args) {
		
		//equals() --content 
		// == --object reference
		
		String s = "java";
		String s1 = "testing";
		String s2 = "java";
		
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s == s2);
		
		System.out.println("**************************");
		
		String str = new String("java");
		String str1 = new String("testing");
		String str2 = new String("java");
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str == str2);
		
		
		
		
	}
}
