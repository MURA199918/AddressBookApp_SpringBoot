package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{

	@Override
	public List<AddressBookData> getAddressBookData() {
		// TODO Auto-generated method stub
		List<AddressBookData> addBookList = new ArrayList<>();
		addBookList.add(new AddressBookData(1, new AddressBookDTO("Vijay", "Shankar", "1st-cross", "Mumbai", "Maharashtra", 400076, 9897346, "vijay@abc.com")));
		return addBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int contactId) {
		// TODO Auto-generated method stub
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(1, new AddressBookDTO("Vijay", "Shankar", "1st-cross", "Mumbai", "Maharashtra", 400076, 9897346, "vijay@abc.com"));
		return addBookData;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(1, addBookDTO);
		return addBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(AddressBookDTO addBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addBookData = null;
		addBookData = new AddressBookData(1, addBookDTO);
		return addBookData;
	}

	@Override
	public void deleteAddressBookData(int contactId) {
		// TODO Auto-generated method stub
		
	}
	

}
