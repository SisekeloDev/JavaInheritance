package test;

public class SoftwareEngineer extends Employee implements EmploymentStatus, HireDate {
	
	private Gender gender;
	private String role;
	private String techStack;
	private boolean status;
	private String hireDate;
	
	public SoftwareEngineer(String name, String surname, Gender gender, int age, String role, String techStack, boolean status, String hireDate) {
		super(name, surname, age);
		this.gender = gender;
		this.role = role;
		this.techStack = techStack;
		this.status = status;
		this.hireDate = hireDate;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getTechStack() {
		return techStack;
	}
	public void setTechStack(String techStack) {
		this.techStack = techStack;
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
		System.out.println("Gender: " + getGender());
		System.out.println("Role: " + getRole());
		System.out.println("Tech Stack: " + getTechStack());
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