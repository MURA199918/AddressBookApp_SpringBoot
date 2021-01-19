package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public long zip;
	public long phone;
	public String email;
	
	public AddressBookDTO(String firstName, String lastName, String address, String city, String state, long zip, long phone, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString() {
		return "firstName=" + firstName + ":lastName=" + lastName + ":Address=" + address + ":City=" + city + ":State=" + state + ":Zip=" + zip + ":Phone=" + phone + ":Email=" + email;
	}
	
}