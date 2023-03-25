package oops;

class Employee
{
	int id;
	String name;
	String email;
	
	Employee(int id, String name, String email)
	{
		this.id = id;
		this.name=name;
		this.email=email;
	}
	
	public void dislpay()
	{
		System.out.println(id+" "+name+" "+email);
	}
}

public class O003_EmployeeData {
	public static void main(String[] args) {
		
		Employee emp = new Employee(10, "Purva", "purva@gmail.com");
		emp.dislpay();
		
		Employee emp1 = new Employee(20, "Hardik", "hardik@gmail.com");
		emp1.dislpay();
		
	}
	
	
}
