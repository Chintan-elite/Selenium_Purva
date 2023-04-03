package exception;

public class E002_CompileTimeDemo {
	public static void main(String[] args) {
		
		
		
		try
		{
			Class.forName("oops.Demo12");
		} 
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
}
