package fileio;

import java.io.File;
import java.io.IOException;

public class F004_File {
	public static void main(String[] args) {
		
		
		File file = new File("D://test//practice");
	
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
		
		
		file.mkdir();
		System.out.println("Folder created");
		
		
//		if(file.exists())
//		{
//			System.out.println("File available");
//			file.delete();
//			System.out.println("File deleted");
//		}
//		else
//		{
//			System.out.println("File not found");
//			try {
//				file.createNewFile();
//				System.out.println("File created");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
		
		
	}
}
