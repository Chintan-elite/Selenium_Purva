package basic;

public class A002_Datatypes {
	public static void main(String[] args) {
		
//		byte b = -128;
//		short s = -32768;
//		int a = 265465650;
//		long l = 5656566565655l;
//		
//		float f = 45.66f;
//		double d = 45.666;
//		
//		char c = 'A';
//		boolean bool = false;
		
		
		//widening  implicite casting
		int a = 10;  //4  
		long b = a;  //8
		
		//nerrowing  explicite casting
		long k = 8989898; //8 
		int l = (int) k;   //4
		
		//System.out.println(l);
		
		int s = 'A';
		System.out.println(s);
		
		char ch = 60;
		System.out.println(ch);
		
		
	}
}
