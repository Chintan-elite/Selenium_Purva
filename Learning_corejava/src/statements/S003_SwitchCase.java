package statements;

import java.util.Scanner;

public class S003_SwitchCase {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your chioce : ");
		int num =sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("You have choese gujarati");
			break;
		case 2:
			System.out.println("You have choese Hindi");
			break;
		case 3:
			System.out.println("You have choese English");
			break;
		default :
			System.out.println("Invalid input");
			
		}
		
		
		
		
	}
	
	
	
}
