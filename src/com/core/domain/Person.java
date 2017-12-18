package com.core.domain;

public class Person {
	private String identify;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String phone;
	private String job;
	private String company;
	private double salary;

	public Person() {
		super();
	}

	public Person(String identify, String firstName, String lastName, int age, String email, String phone, String job,
			String company, double salary) {
		super();
		this.identify = identify;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.job = job;
		this.company = company;
		this.salary = salary;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [identify=" + identify + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", email=" + email + ", phone=" + phone + ", job=" + job + ", company=" + company + ", salary="
				+ salary + "]";
	}

}
