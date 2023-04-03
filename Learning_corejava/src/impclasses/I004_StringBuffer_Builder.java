package impclasses;

public class I004_StringBuffer_Builder {
	public static void main(String[] args) {
		
		//syncronized
		double startTime = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer("hello");
		for(int i=1;i<=100000;i++) {
			sb1.append("java");
		}
		double endTime = System.currentTimeMillis();
		
		
		//asycronysed
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("hello");
		for(int i=1;i<=100000;i++) {
			sb2.append("java");
		}
		double endTime1 = System.currentTimeMillis();
		
		
		System.out.println("Timetaken by buffer : "+(endTime-startTime));
		System.out.println("Timetaken by builder : "+(endTime1-startTime1));
		
		
		
	}
}
