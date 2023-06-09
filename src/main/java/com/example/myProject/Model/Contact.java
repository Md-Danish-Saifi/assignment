package com.example.myProject.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "contacts", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String email;
    private String phone;
    private String lastName;
	public Contact() {
	}
	public Contact(long id, String firstName, String email, String phone, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.email = email;
		this.phone = phone;
		this.lastName = lastName;
	}
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

    

}
