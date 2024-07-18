public class Student extends Person implements Academic {
	private int id;
	private String speciality;
	private double average;
	
	public Student(String name, int age, String gender, int id, String speciality, double average) {
		super(name, age, gender);
		this.id = id;
		this.speciality = speciality;
		this.average = average;
	}
	
	@Override
	public String myName() {
		return super.getName();
	}
	
	@Override
	public String academySpeciality() {
		return speciality;
	}
	
	@Override
	public void academyId() {
		System.out.println("Student academy id");
	}
	
	@Override
	public void personAddress() {
		System.out.println("Student person address");
		
	}
	
	@Override
	public void personEmail() {
		System.out.println("Student person email");
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
	

	public double getAverage() {
		return average;
	}
	

	public void setAverage(double average) {
		this.average = average;
	}
}