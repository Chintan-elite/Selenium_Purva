package basic;

import java.util.Scanner;

public class A003_Sacnner {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.next();
		
		
		System.out.println(a+" "+b+" "+name);
		
		
		sc.close();
		
		
	}
}
