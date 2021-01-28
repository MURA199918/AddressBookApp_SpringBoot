package com.bridgelabz.addressbookapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{
	
	@Autowired
	private AddressBookRepository addBookRepository;

	public List<AddressBookData> getAddressBookData() {
		// TODO Auto-generated method stub
		return addBookRepository.findAll();
	}

	public AddressBookData getAddressBookDataById(int contactId) {
		// TODO Auto-generated method stub
		return addBookRepository
				.findById(contactId)
				.orElseThrow( () -> new AddressBookException("Contact with contactId "+
				                          contactId + " does not exists..!!"));
	}
	
	public List<AddressBookData> getAddressBookDataByCity(String city) {
		// TODO Auto-generated method stub
		return addBookRepository.findContactByCity(city);
	}

	public List<AddressBookData> getAddressBookDataByState(String state) {
		// TODO Auto-generated method stub
		return addBookRepository.findContactByState(state);
	}

	public AddressBookData createAddressBookData(AddressBookDTO addBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(addBookDTO);
		log.debug("Contact Data: "+addBookData.toString());
		return addBookRepository.save(addBookData);
	}

	public AddressBookData updateAddressBookData(int contactId, AddressBookDTO addBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addBookData = this.getAddressBookDataById(contactId);
		addBookData.updateAddressBookData(addBookDTO);
		return addBookRepository.save(addBookData);
	}

	public void deleteAddressBookData(int contactId) {
		// TODO Auto-generated method stub
		AddressBookData addBookData = this.getAddressBookDataById(contactId);
		addBookRepository.delete(addBookData);
	}
	

}
