package com;

public class Test {
	public static void main(String[] args) {
		
		ExcellReader rd = new ExcellReader();
		int rows =  rd.rowCount();
		System.out.println("Rows : "+rows);
		
		int cols = rd.colCount();
		System.out.println("Cols : "+cols);
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = rd.getData(i,j);
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
	}
}
