package array;

public class A004_MDArray {
	public static void main(String[] args) {
		
		
//		String login[][] = new String[4][2];
//		
//		login[0][0] = "test@gmail.com";
//		login[0][1] = "test";
//		
//		login[1][0] = "tech@gmail.com";
//		login[1][1] = "tech";
//		
//		login[2][0] = "abc@gmail.com";
//		login[2][1] = "abc";
//		
//		login[3][0] = "xyz@gmail.com";
//		login[3][1] = "xyz";
		
		
		String login[][] = {{"test@gmail.com","test"},
							{"tech@gmail.com","tech"},
							{"abc@gmail.com","abc"},
							{"xyz@gmail.com","xyz"}};
		
		
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<2;j++)
			{
				System.out.println(login[i][j]);
			}
		}
		
		
		
	}
	
	
	
}
