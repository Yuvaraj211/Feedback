package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String feedback;
 
    public Employee() {
  
    }
 
    public Employee(String firstName, String lastName, String emailId, String feedback) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.emailId = emailId;
         this.feedback = feedback;
    }
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    @Column(name = "feedback", nullable = false)
    public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
       +", feedback=" + feedback + "]";
    }
 
}
