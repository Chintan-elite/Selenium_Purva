package oops;

interface Intr
{
	public static final int a = 10;
	public void sample();
	
}

interface Inter1
{
	public void run();
}

class InterImpl implements Intr, Inter1
{

	@Override
	public void sample() {
		System.out.println("Running sample");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class O012_InterfaceDemo {
	public static void main(String[] args) {
		
		//Intr itr = new Intr();
		
	}
}
