package oops;

class Pen
{
	int price=10;
	String color = "red";
	static String company="cello";
	
	void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	static void sample()
	{
		System.out.println("running sample");
	}
	
}

public class O001_ObjectDemo {

	public static void main(String[] args) {
		
		Pen.company="ss";
		Pen.sample();
		
		Pen p = new Pen();
		p.price=500;
		p.toWrite();
		
		Pen p1 = new Pen();
		p1.color="Blue";
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.toWrite();
		
		
		
		
	}
	
}
