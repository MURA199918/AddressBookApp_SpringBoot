package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{
	
	private List<AddressBookData> addressBookList = new ArrayList<>();

	@Override
	public List<AddressBookData> getAddressBookData() {
		// TODO Auto-generated method stub
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int contactId) {
		// TODO Auto-generated method stub
		return addressBookList.get(contactId-1);
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(addressBookList.size()+1, addBookDTO);
		return addBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int contactId, AddressBookDTO addBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addBookData = this.getAddressBookDataById(contactId);
		addBookData.setFirstName(addBookDTO.firstName);
		addBookData.setLastName(addBookDTO.lastName);
		addBookData.setAddress(addBookDTO.address);
		addBookData.setCity(addBookDTO.city);
		addBookData.setState(addBookDTO.state);
		addBookData.setZip(addBookDTO.zip);
		addBookData.setPhone(addBookDTO.phone);
		addBookData.setEmail(addBookDTO.email);
		addressBookList.set(contactId-1, addBookData);
		return addBookData;
	}

	@Override
	public void deleteAddressBookData(int contactId) {
		// TODO Auto-generated method stub
		addressBookList.remove(contactId-1);
	}
	

}
