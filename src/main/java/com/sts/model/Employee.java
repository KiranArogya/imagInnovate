package com.sts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name ="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;
	@Column(name ="first_name")
	private String firstName;
    @Column(name ="last_name")
	private String lastName;
	@Column(name="email")
	private String email;

	@Column(name="phone_number")
	private String phoneNumber;
	//PhoneNumber(May have multiple phone numbers)
	@Column(name="doj")
	private Date DOJ;
	@Column(name="salary")
	private int Salary;

    @Column(name ="emp_name")
    private String emp_name;

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date DOJ) {
		this.DOJ = DOJ;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"empid=" + empid +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", DOJ=" + DOJ +
				", Salary=" + Salary +
				", emp_name='" + emp_name + '\'' +
				'}';
	}
// Constructors, getters, setters, and toString method...
}
