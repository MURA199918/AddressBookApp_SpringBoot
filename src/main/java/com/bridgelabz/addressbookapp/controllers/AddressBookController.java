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
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(1, new AddressBookDTO("Vijay", "Shankar", "1st-cross", "Mumbai", "Maharashtra", 40076, 9897347, "vijay@abc.com"));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", addBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("contactId") int contactId) {
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(1, new AddressBookDTO("Vijay", "Shankar", "1st-cross", "Mumbai", "Maharashtra", 40076, 9897347, "vijay@abc.com"));
		ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful", addBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addBookDTO) {	
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(1, addBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully", addBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addBookDTO) {
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(1, addBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated AddressBook Data Successfully", addBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("contactId") int contactId) {
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id: "+contactId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
