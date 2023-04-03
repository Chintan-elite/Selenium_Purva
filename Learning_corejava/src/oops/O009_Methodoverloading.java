package oops;

class Calc
{
	public void add(int a, int b)
	{
		int result = a+b;
		System.out.println("Addioon is 1: "+result);
	}
	
	public void add(int a, int b, int c)
	{
		int result = a+b+c;
		System.out.println("Addioon is 2: "+result);
	}
	
	public void add(int a, double b)
	{
		double result = a+b;
		System.out.println("Addioon is 3: "+result);
	}
}

public class O009_Methodoverloading {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.add(102, 10);
		c.add(10, 20);
		c.add(10, 20,56);
		c.add(10, 50.00);
		
	}
}
