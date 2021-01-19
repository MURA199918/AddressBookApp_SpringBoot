package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
	
	private int contactId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private long zip;
	private long phone;
	private String email;
	
	public AddressBookData(int contactId, AddressBookDTO addBookDTO) {
		this.contactId = contactId;
		this.firstName = addBookDTO.firstName;
		this.lastName = addBookDTO.lastName;
		this.address = addBookDTO.address;
		this.city = addBookDTO.city;
		this.state = addBookDTO.state;
		this.zip = addBookDTO.zip;
		this.phone = addBookDTO.phone;
		this.email = addBookDTO.email;
	}
	
	public int getContactId() {
		return contactId;
	}
	
	public void setContactId(int contactId) {
		this.contactId = contactId;
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
	
	public long getZip() {
		return zip;
	}
	
	public void setZip(long zip) {
		this.zip = zip;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
