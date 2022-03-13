package com.credentials.model;

public class Employee {
	String firstName ;
	String lastName;
	
	Employee(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	String getFirstName (){
		return this.firstName;
	}
	
	String getLastName() {
		return this.lastName;
	}
}