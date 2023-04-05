package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_FileWriter {
	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("D://test//demo.txt");
			
			String data = "java is secure programming lang.";
			fw.write(data);
			fw.flush();
			System.out.println("Content written");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
