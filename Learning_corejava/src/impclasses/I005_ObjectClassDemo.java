package impclasses;

//object class : parent class of all all class in java

class Demo
{
	public void display()
	{
		
	}
	
	@Override
	public String toString() {
		
		//return super.toString();
		return "purva";
	}
}

class Sample extends Demo
{
	
}

public class I005_ObjectClassDemo {
	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		System.out.println(d.getClass());
		System.out.println(d);
		
		Sample s = new Sample();
		System.out.println(s);
		
		
	}
}
