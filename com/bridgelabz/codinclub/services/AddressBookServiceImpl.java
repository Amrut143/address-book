package com.bridgelabz.codinclub.services;
import com.bridgelabz.codinclub.utils.AddressBookRepo;
import com.bridgelabz.codinclub.utils.AddressBookUtil;
import com.bridgelabz.codinclub.models.Person;

/**
*Creating implementation class for AddressBookService interface
*@author:Amrut
*/
public class AddressBookServiceImpl implements AddressBookService {
    final AddressBookRepo repo;

    public AddressBookServiceImpl(final AddressBookRepo repo){
        this.repo = repo;
    }

    @Override
    public void addPerson() {

        System.out.println("Enter First name: ");
        final String firstName = AddressBookUtil.getUserString();

        System.out.println("Enter Last name: ");
        final String lastName = AddressBookUtil.getUserString();

        System.out.println("Enter Address: ");
        final String address = AddressBookUtil.getUserString();

        System.out.println("Enter City: ");
        final String city =  AddressBookUtil.getUserString();

        System.out.println("Enter State: ");
        final String state = AddressBookUtil.getUserString();

        System.out.println("Enter Phone number: ");
        final String phone = AddressBookUtil.getUserString();

        System.out.println("Enter Zip code: ");
        final String zipCode = AddressBookUtil.getUserString();

        final Person person = new Person(firstName,lastName, address, city, state, phone, zipCode);
        repo.addToAddressBook(person);
    }

    @Override
    public void editPerson() {

    }

    @Override
    public void deletePerson() {

    }

    @Override
    public void display(){
        repo.displayContacts();
    }
}
