package oops;

class Animal
{
	String name;
	
	public void voice()
	{
		System.out.println("Animal voice...");
	}
}

class Dog extends Animal
{
	
	@Override
	public void voice() {
		name="tommy";
		System.out.println(name+" : wow..wow");
	}
}

class Cat extends Animal
{
	@Override
	public void voice() {
		name="tom";
		System.out.println(name+" : miaw..miaw");
	}
}

public class O007_InheritanceDemo {
	public static void main(String[] args) {
		
		
		Dog d = new Dog();
		d.voice();
		
		Cat c = new Cat();
		c.voice();
		
	}
}
