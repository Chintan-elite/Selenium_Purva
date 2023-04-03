package exception;


class Election
{
	public void ageValidation(int age) throws AgeInvalidException
	{
		if(age<18)
		{
			throw new AgeInvalidException();
		}
		else
		{
			System.out.println("Valid");
		}
	}
}

public class E003_CustomeException {
	public static void main(String[] args) {
		
		
		
		Election el = new Election();
		
		try {
			el.ageValidation(5);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Hello");
		
	}
}
