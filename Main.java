public class Main {

	public static void main(String[] args) {
		Person[] persons = new Person[10];
		persons[0] = new Student("Masa", 19, "Female", 202211397, "Computer Engineering", 95.5);
		persons[1] = new Teacher("Rafiq", 55, "Male", 102236290, "Arabic", 1000.0);
		persons[2] = new Student("Lana", 22, "Female", 202211397, "Computer Engineering", 93.7);
		persons[3] = new Administrative("Salameh", 45, "Male", 102236235, "ِِAccounts", 2500.0);
		persons[4] = new Student("Ahmad", 21, "Male", 192312400, "English", 87.9);
		persons[5] = new Teacher("Saleh", 35, "Male", 148365448, "Computer Engineering", 1900.0);
		persons[6] = new Student("Khaled", 18, "Male", 216236458, "Electrical Engineering", 91.3);
		persons[7] = new Administrative("Dima", 32, "Female", 10152350, "Business Management", 2000.0);
		persons[8] = new Student("Ruba", 23, "Female", 175216537, "Computer Engineering", 93.6);
		persons[9] = new Teacher("Magda", 45, "Female", 1025635458, "Religion", 1700.0);
		
		sortPersons(persons);
		
		System.out.println("");
		System.out.println("");
		
		Paid[] paids = new Paid[6];
		paids[0] = new Teacher("Rafiq", 55, "Male", 102236290, "Arabic", 1000.0);
		paids[1] = new Administrative("Salameh", 45, "Male", 102236235, "ِِAccounts", 2500.0);
		paids[2] = new Teacher("Saleh", 35, "Male", 148365448, "Computer Engineering", 1900.0);
		paids[3] = new Administrative("Dima", 32, "Female", 10152350, "Business Management", 2000.0);
		paids[4] = new Teacher("Magda", 45, "Female", 1025635458, "Religion", 1700.0);
		paids[5] = new Teacher("Tasneem", 38, "Female", 1026825472, "Religion", 1450.0);
		
		displaysPaid(paids);
		
		System.out.println("");
		System.out.println("");
		
		Academic[] academics = new Academic[10];
		academics[0] = new Student("Masa", 19, "Female", 202211397, "Computer Engineering", 95.5);
		academics[1] = new Teacher("Rafiq", 55, "Male", 102236290, "Arabic", 1000.0);
		academics[2] = new Student("Lana", 22, "Female", 202211397, "Medicine", 93.7);
		academics[3] = new Teacher("Salameh", 45, "Male", 102236235, "Accounts", 2500.0);
		academics[4] = new Student("Ahmad", 21, "Male", 192312400, "English", 87.9);
		academics[5] = new Teacher("Saleh", 35, "Male", 148365448, "History", 1900.0);
		academics[6] = new Student("Khaled", 18, "Male", 216236458, "Electrical Engineering", 91.3);
		academics[7] = new Teacher("Dima", 32, "Female", 10152350, "Business Management", 2000.0);
		academics[8] = new Student("Ruba", 23, "Female", 175216537, "Designer", 93.6);
		academics[9] = new Teacher("Magda", 45, "Female", 1025635458, "Religion", 1700.0);
		
		sortSpeciality(academics);
	}
	
	public static void sortPersons(Person[] persons) {
		for (int i = 0; i < persons.length; i++) {  
			for (int j = i + 1; j < persons.length; j++) {  
				Person tmp;	
				if (persons[i].getAge() > persons[j].getAge()) {  
					tmp = persons[i];  
					persons[i] = persons[j];  
					persons[j] = tmp;  
				}  
			}  
		}
		
		System.out.println("1 - Sort Persons");
		
		System.out.printf("--------------------------------------%n");
		System.out.printf("| %-10s | %-15s | %2s |%n", "Name", "Class Name", "Age");
		System.out.printf("--------------------------------------%n");

		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getName() != "" && persons[i].getClass().getName() != "Student") {
				System.out.printf("| %-10s ", persons[i].getName());
				System.out.printf("| %-15s ", persons[i].getClass().getName());
				System.out.printf("| %3d |%n", persons[i].getAge());
			}
		}
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getName() != "" && persons[i].getClass().getName() == "Student") {
				System.out.printf("| %-10s ", persons[i].getName());
				System.out.printf("| %-15s ", persons[i].getClass().getName());
				System.out.printf("| %3d |%n", persons[i].getAge());
			}
		}
		
		System.out.printf("--------------------------------------%n");
	}

	public static void displaysPaid(Paid[] paids) {
		System.out.println("2 - Displays paid");
		
		System.out.printf("-----------------------------------------%n");
		System.out.printf("| %-10s | %-15s | %2s |%n", "Name", "Class Name", "Salary");
		System.out.printf("-----------------------------------------%n");

		for (int i = 0; i < paids.length; i++) {
			System.out.printf("| %-10s ", paids[i].name());
			System.out.printf("| %-15s ", paids[i].getClass().getName());
			System.out.printf("| %1.1f |%n", paids[i].salary());
		}
		
		System.out.printf("-----------------------------------------%n");
	}	

	public static void sortSpeciality(Academic[] academics) {
		for (int i = 0; i < academics.length; i++) {  
			for (int j = i + 1; j < academics.length; j++) {  
				if (academics[i].academySpeciality().compareTo(academics[j].academySpeciality()) > 0) {  
					Academic tmp = academics[i];  
					academics[i] = academics[j];  
					academics[j] = tmp;  
				}  
			}  
		}
		
		System.out.println("3 - Sort acadimic speciality");
		
		System.out.printf("-------------------------------------------------------%n");
		System.out.printf("| %-10s | %-10s | %-25s |%n", "Name", "Class Name", "Speciality");
		System.out.printf("-------------------------------------------------------%n");

		for (int i = 0; i < academics.length; i++) {
			System.out.printf("| %-10s ", academics[i].myName());
			System.out.printf("| %-10s ", academics[i].getClass().getName());
			System.out.printf("| %-25s |%n", academics[i].academySpeciality());
		}
		
		System.out.printf("-------------------------------------------------------%n");
	}
}
