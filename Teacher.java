public class Teacher extends Employee implements Academic {
	private int workingHours;
	private String certificateDegree;
	private String email;
	
	public Teacher(String name, int age, String gender, int id, String speciality, double salary) {
		super(name, age, gender, id, speciality, salary);
		this.workingHours = 0;
		this.certificateDegree = "";
		this.email = "";
	}
	
	@Override
	public void paymentDate() {
		System.out.println("Teacher payment date");
	}
	
	@Override
	public void paymentMethod() {
		System.out.println("Teacher payment method");
	}

	@Override
	public String myName() {
		return super.getName();
	}
	
	@Override
	public String academySpeciality() {
		return super.getSpeciality();
	}
	
	@Override
	public void academyId() {
		System.out.println("Teacher academy id");
	}
	
	@Override
	public void employeePhoneNumer() {
		System.out.println("Teacher phone numer");
	}
	
	@Override
	public void employeeWork() {
		System.out.println("Teacher employee work");
	}
	
	@Override
	public void personAddress() {
		System.out.println("Teacher person address");
	}
	
	@Override
	public void personEmail() {
		System.out.println("Teacher person email");
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public String getCertificateDegree() {
		return certificateDegree;
	}

	public void setCertificateDegree(String certificateDegree) {
		this.certificateDegree = certificateDegree;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}