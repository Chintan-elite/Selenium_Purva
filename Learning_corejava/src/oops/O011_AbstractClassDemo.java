package oops;

abstract class Abs
{
	public abstract void sample();
	
	public void display()
	{
		System.out.println("running display");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void sample() {
		System.out.println("Running Sample");
	}
	
}


public class O011_AbstractClassDemo {
	public static void main(String[] args) {
		
		
		//Abs abs = new Abs();
		
		AbsImpl impl = new AbsImpl();
		impl.display();
		impl.sample();
		
	}
}
