package BasicPractice;

public class B002_PrimeNo {
	public static void main(String[] args) {
		
		
		int a = 27;
		int flag = 0;
	
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
			
		}
		
		
		if(flag==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
		
	}
}
