package oops;

class Opration
{
	public void display()
	{
		System.out.println("Running display");
	}
	
	public void add(int a, int b)
	{
		System.out.println("Addition is : "+(a+b));
	}
	
	public void sample(String name)
	{
		System.out.println("My name is : "+name);
	}
	
	public int square(int a)
	{
		int sq = a*a;
		return sq;
	}
	
	public void cube(int a)
	{
		System.out.println(a*a*a);
	}
	
	public void arraySum(int a[])
	{
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of array : "+sum);
	}
	
	public int[] revArray(int a[])
	{
		int c[] = new int[a.length];
		
		int count = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			c[count] = a[i];
			count++;
		}
		
		return c;
	}
	
}

public class O004_MethodManipulation {
	public static void main(String[] args) {
		
		Opration op = new Opration();
		op.display();
		op.add(10, 20);
		op.add(20, 30);
		op.sample("Test");
		
		int i =  op.square(9);
		System.out.println(i);
		op.cube(i);
		
		int marks[] = {36,89,77,45,88,45,56};
		int marks1[] = {10,20,30,40,50,60};
		op.arraySum(marks);
		op.arraySum(marks1);
		
		
		int ch[] = {2,5,6,9,7,8};
		int rev[] =  op.revArray(marks);
		
		for(int k=0;k<rev.length;k++)
		{
			System.out.println(rev[k]);
		}
		
		
		
		
	}
}
