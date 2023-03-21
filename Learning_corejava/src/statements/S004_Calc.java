package statements;

import java.util.Scanner;

public class S004_Calc {
	public static void main(String[] args) {
		
		String choice;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Enter choice : add,sub,mul,div,exit");
		choice = sc.next();
		
		
		switch(choice)
		{
		case "add" : System.out.println("Addition "+a+" of and "+b+" is : "+(a+b));
		break;
		case "sub" : System.out.println("Substraction "+a+" of and "+b+" is : "+(a-b));
		break;
		case "mul" : System.out.println("Multiplication "+a+" of and "+b+" is : "+(a*b));
		break;
		case "div" : System.out.println("Division "+a+" of and "+b+" is : "+(a/b));
		break;
		case "exit":
			System.out.println("Exit");
			break;
		default : System.out.println("Invalid choice");
		}
		
		}while(!choice.equals("exit"));
		
		
	}
}
