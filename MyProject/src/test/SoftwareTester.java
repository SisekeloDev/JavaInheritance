package test;

public class SoftwareTester extends Employee implements EmploymentStatus, HireDate{
	private String role;
	private String language;
	private boolean status;
	private String hireDate;
	
	public SoftwareTester(String name, String surname, int age, String role, String language, boolean status, String hireDate) {
		super(name, surname, age);
		this.role = role;
		this.language = language;
		this.status = status;
		this.hireDate = hireDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public void Print() {
		super.Print();
		System.out.println("Role: " + getRole());
		System.out.println("Language: " + getLanguage());
		System.out.println("Full Time: " + isStatus());
		System.out.println("Hire Date: " + getHireDate()+ "\n");
	}
	
	@Override
	public boolean fullTime() {
		return status;
	}
	@Override
	public String employmentDate() {
		return hireDate;
	}
}
