package com.bridgelabz.addressbookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.bridgelabz.addressbookapp.services.IAddressBookService;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		List<AddressBookData> addBookList = null;
		addBookList = addressBookService.getAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", addBookList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("contactId") int contactId) {
		AddressBookData addBookData = null;
		addBookData = addressBookService.getAddressBookDataById(contactId);
		ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful", addBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addBookDTO) {	
		AddressBookData addBookData = null;
		addBookData = addressBookService.createAddressBookData(addBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully", addBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{contactId}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("contactId") int contactId, @RequestBody AddressBookDTO addBookDTO) {
		AddressBookData addBookData = null;
		addBookData = addressBookService.updateAddressBookData(contactId, addBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated AddressBook Data Successfully", addBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("contactId") int contactId) {
		addressBookService.deleteAddressBookData(contactId);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id: "+contactId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
