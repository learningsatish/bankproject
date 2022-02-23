package com.meghana.bankaccount;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;


public class Customer {
	
	
	@NotBlank
	@NotNull
	@Length(max=25)
	@Pattern(regexp="^[a-zA-Z][a-zA-Z]*$")
	private String name;
	@NotNull
	@Pattern(regexp="male|female")
	private String Gender;
	@NotNull
	@Pattern(regexp="^[0-9]{2}|[0-9{2}|[0-9{4}")
	private Date DOB;
	@NotNull
	@NotBlank
	@Length(max=25)
	@Pattern(regexp="^[a-zA-Z][a-zA-Z ]*$")
	private String address;
	@NotNull
	@NotBlank
	@Length(max=25)
	@Pattern(regexp="^[a-zA-Z][a-zA-Z]*$")
	private String city;
	@NotNull
	@NotBlank
	@Length(max=25)
	private String state;
	@NotNull
	@NotBlank
	@Length(max=7)
	@Pattern(regexp="^[a-zA-Z][a-zA-Z]*$")
	private String pin;
	@NotBlank
	@Length(max=15)
	@Pattern(regexp="^[0-9 ]*$")
	private Integer telephoneno;
	@NotBlank
	@Length(max=15)
	private String fax;
	@Email
	@Length(max=30)
	@Pattern(regexp="[@] && [.]+")
	@Pattern(regexp="^[a-zA-Z][a-zA-Z]*$")
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Integer getTelephoneno() {
		return telephoneno;
	}
	public void setTelephoneno(Integer telephoneno) {
		this.telephoneno = telephoneno;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
