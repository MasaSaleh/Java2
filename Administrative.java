public class Administrative extends Employee {
	private String title;
	private String email;
	private String level;
	
 	public Administrative(String name, int age, String gender, int id, String department, double salary) {
		super(name, age, gender, id, department, salary);
		this.title = "";
		this.email = "";
		this.level = "";
	}
	
	@Override
	public void paymentDate() {
		System.out.println("Administrative payment date");
	}
	
	@Override
	public void paymentMethod() {
		System.out.println("Administrative payment method");
	}
	
	@Override
	public void employeePhoneNumer() {
		System.out.println("Administrative employee phone numer");
	}
	
	@Override
	public void employeeWork() {
		System.out.println("Administrative employee work");
	}
	
	@Override
	public void personAddress() {
		System.out.println("Administrative person address");
	}
	
	@Override
	public void personEmail() {
		System.out.println("Administrative person email");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}
