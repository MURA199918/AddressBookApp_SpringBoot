package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	
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
	    this.updateAddressBookData(addBookDTO);
	}
	
	public void updateAddressBookData(AddressBookDTO addBookDTO) {
		this.firstName = addBookDTO.firstName;
		this.lastName = addBookDTO.lastName;
		this.address = addBookDTO.address;
		this.city = addBookDTO.city;
		this.state = addBookDTO.state;
		this.zip = addBookDTO.zip;
		this.phone = addBookDTO.phone;
		this.email = addBookDTO.email;
	}
}
