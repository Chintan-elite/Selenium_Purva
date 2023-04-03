package oops;

class Sample
{
	public void display()
	{
		System.out.println("Running sample display");
	}
}

class Run extends Sample
{
	@Override
	public void display() {
		System.out.println("Running runclass display");
	}
}

public class O010_Methodoveriding {
	public static void main(String[] args) {
		
		Run run = new Run();
		run.display();
		
	}
}
