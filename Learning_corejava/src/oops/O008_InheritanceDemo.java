package oops;

class A
{
	int a =10;
	public void display()
	{
		System.out.println("Running class A display...");
	}
}

class B extends A
{
	int a = 100;
	@Override
	public void display() {
		
		System.out.println("A : "+super.a);
		System.out.println("A : "+a);
		System.out.println("running class b display");
		super.display();
	}
}

class C extends A
{
	
}

public class O008_InheritanceDemo {
	public static void main(String[] args) {
		
//		A a= new A();
//		a.display();
				
		
		B b = new B();
		b.display();
		
		
	}
}
