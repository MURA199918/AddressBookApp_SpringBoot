package com.bridgelabz.addressbookapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<String> getAddressBookData() {
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<String> getAddressBookData(@PathVariable("contactId") int contactId) {
		return new ResponseEntity<String>("Get Call Success for id: "+contactId, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addBookDTO) {
		return new ResponseEntity<String>("Created AddressBook Data for: "+addBookDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addBookDTO) {
		return new ResponseEntity<String>("Updated AddressBook Data for: "+addBookDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<String> deleteAddressBookData(@PathVariable("contactId") int contactId) {
		return new ResponseEntity<String>("Delete Call Success for id: "+contactId, HttpStatus.OK);
	}
}
