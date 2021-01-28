package com.bridgelabz.addressbookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name = "address_book")
public @Data class AddressBookData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "contact_id")
	private int contactId;
	
	@Column(name = "firstname")
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private long zip;
	private String phone;
	private String email;
	
	public AddressBookData(AddressBookDTO addBookDTO) {
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
