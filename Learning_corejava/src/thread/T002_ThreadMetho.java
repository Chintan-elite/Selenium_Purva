package thread;

class Demo extends Thread
{
	
	public void run() {
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class T002_ThreadMetho {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.start();
		
		
		
	}
}
