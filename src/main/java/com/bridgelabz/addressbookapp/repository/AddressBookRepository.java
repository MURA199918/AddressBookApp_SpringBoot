package com.bridgelabz.addressbookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
	
	@Query(value="select * from address_book where contact_id = id and city = :city", nativeQuery = true)
	List<AddressBookData> findContactByCity(String city);
	
	@Query(value="select * from address_book where contact_id = id and state = :state", nativeQuery = true)
	List<AddressBookData> findContactByState(String state);
}
