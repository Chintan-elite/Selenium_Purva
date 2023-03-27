package oops;


class Std
{
	//variable, data member, field, 
	private int id;
	private String name;
	private String email;
	
	//methos, function member
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

public class O006_Encaptulation {
	public static void main(String[] args) {
		
		Std s = new Std();
		s.setId(10);
		s.setName("test");
		s.setEmail("test@gmail.com");
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getEmail());
	}
}
