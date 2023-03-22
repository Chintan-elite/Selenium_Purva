package array;

public class A002_Basicpractice {
	
		public static void main(String[] args) {
			
			int a[] = {10,20,300,4,50,6,70,80};
			
			int sum =0;
			for(int i=0;i<a.length;i++)
			{
				sum = sum + a[i];
			}
			
			System.out.println("sum : "+sum);
			System.out.println("Avg : "+(sum/a.length));
			
			
			System.out.println("****************************************");
			
			int max = a[0]; //500
			int min = a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>max)
				{
					max = a[i];
				}
				
				if(a[i]<min)
				{
					min = a[i];
				}
			}
			
			System.out.println("max  : "+max);
			System.out.println("min : "+min);
			
			
			
			
			
			
			
			
		}
	
	
}
