package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Contact name Invalid")
	public String firstName;
	
	@NotBlank(message = "LastName cannot be Empty")
	public String lastName;
	
	@NotBlank(message = "Address cannot be Empty")
	public String address;
	
	@NotBlank(message = "City cannot be Empty")
	public String city;
	
	@NotBlank(message = "State cannot be Empty")
	public String state;
	
	@NotBlank(message = "Zip Code cannot be Empty")
	public long zip;
	
	@Pattern(regexp = "((^\\\\+?)(([0-9]{2,3})(\\\\s))?)' + '[0-9]{10}$", message = "Phone Number Invalid")
	public long phone;
	
	@NotBlank(message = "Email cannot be Empty")
	public String email;
	
}
