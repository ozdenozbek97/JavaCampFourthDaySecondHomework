package Entities;

import java.time.LocalDate;


import Abstract.Entity;

public class Customer implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	private String nationalityId;
	
	public Customer(int id, String firstName, String lastName, String nationalityId, LocalDate birthDay) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay=birthDay;
		this.nationalityId=nationalityId;
	}
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public String getNationalityId() {
		return nationalityId;
	}

	

}