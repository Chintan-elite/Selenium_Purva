package exception;

public class E001_ExceptionDemo {
	public static void main(String[] args) {
		
		System.out.println("program started.");
		
		try
		{
//			int a = 10;
//			int b = a/0;
//			System.out.println(b);
			
//			int a[] = new int[5];
//			a[6] = 50;
			
			
			String str = "1234s";
			Integer i = Integer.parseInt(str);
			System.out.println(i+2);
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			//e.printStackTrace();
			System.out.println("invalid string");
			
		}
		
		System.out.println("program ended.");
		
		
		
		
	}
}
