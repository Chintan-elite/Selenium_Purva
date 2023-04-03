package impclasses;

public class I006_Wrapper {
	public static void main(String[] args) {
		
		
		//boxing
		int a = 10;
		Integer i = new Integer(a);
		//autoboxing
		Integer i1 = a;
		
		//unboxing
		Integer k = 10;
		int b = k.intValue();
		//autounboxing
		int c = k;
		
		
		
		int x = 456654;
		Integer y = x;
		String z =  y.toString();
		System.out.println(z.length());
		
		
	}
}
