package com.gcu.activityCST323.model;

	//This is my object class for employee. This is a simple application using CRUD methods.
	//My name is Daniel Rumfelt and this program was written by me for the purpose for class activities in CST323.
	//Grand Canyon University 11/05/2023
	import jakarta.persistence.*;

	@Entity
	@Table(name = "employees")
	public class Employee {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @Column(name = "first_name")
	    private String firstName;

	    @Column(name = "last_name")
	    private String lastName;

	    @Column(name = "email")
	    private String email;
	    public long getId() {
	        return id;
	    }
	    public void setId(long id) {
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
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }

}
