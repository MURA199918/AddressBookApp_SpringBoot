package com.bridgelabz.addressbookapp.services;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {
	
	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int contactId);
	
	List<AddressBookData> getAddressBookDataByCity(String city);
	
	List<AddressBookData> getAddressBookDataByState(String state);
	
	AddressBookData createAddressBookData(AddressBookDTO addBookDTO);
	
	AddressBookData updateAddressBookData(int contactId, AddressBookDTO addBookDTO);
	
	void deleteAddressBookData(int contactId);
}
