package test;

public abstract class Employee {
	
	private String name; //fields/variables
	private String surname;
	private int age;	
	
	public Employee(String name, String surname, int age) { //constructor
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String getName() { //getters
		return name;
	}
	public void setName(String name) { //setters
		this.name = name;
	}
	public String getSurname() { //getters
		return surname;
	}
	public void setSurname(String surname) { //setters
		this.surname = surname;
	}
	public int getAge() { //getters
		return age;
	}
	public void setAge(int age) { //setters
		this.age = age;
	}
	
	public void Print() {
		System.out.println("Name: " + getName());
		System.out.println("Surname: " + getSurname());
		System.out.println("Age: " + getAge());
	}
	
//	public abstract void Print();
	
}
