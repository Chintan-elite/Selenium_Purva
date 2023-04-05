package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F002_fileInputStream {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("D:\\\\test\\\\test.txt");
		
			int i=fis.read();
			
			while(i!=-1)
			{
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
			}
			fis.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
