package com.bridgelabz.codinclub.services;
/**
 *@author Amrut
 *creating an interface to define methods which are going to implement in the corresponding implementation class.
 */
public interface AddressBookService {
	void addPerson();
	void editPerson();
	void deletePerson();
	void display();
	void saveChange();
	void sort();
	void readData();
}
