public abstract class Employee extends Person implements Paid {
	private int id;
	private String speciality;
	private double salary;
	
	public Employee(String name, int age, String gender, int id, String speciality, double salary) {
		super(name, age, gender);
		this.id = id;
		this.speciality= speciality;
		this.salary = salary;
	}

	public abstract void employeePhoneNumer();
	
	public abstract void employeeWork();
	
	@Override
	public String name() {
		return this.getName();
	}
		
	@Override
	public double salary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
