package com.bridgelabz.codinclub.services;
import com.bridgelabz.codinclub.utils.AddressBookRepo;
import com.bridgelabz.codinclub.utils.AddressBookUtil;
import com.bridgelabz.codinclub.models.Person;
import com.bridgelabz.codinclub.utils.WriteCsvData;
import com.bridgelabz.codinclub.utils.ReadCsvData;
import java.util.*;

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
	/*override addPerson method to add the person details*/
    public void addPerson() {
		  AddressBookUtil.getUserString();
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
	/*override editPerson method to edit the person details*/
    @Override
    public void editPerson() {
		 Person p = getPersonName();
        if(p != null ){
            System.out.print("Enter Address: ");
            final String address = AddressBookUtil.getUserString();
            p.setAddress(address);

            System.out.print("Enter City: ");
            final String city =  AddressBookUtil.getUserString();
            p.setCity(city);

            System.out.print("Enter State: ");
            final String state = AddressBookUtil.getUserString();
            p.setState(state);

            System.out.print("Enter Zip code: ");
            final String zipCode = AddressBookUtil.getUserString();
            p.setZipCode(zipCode);

            System.out.print("Enter Phone number: ");
            final String phone = AddressBookUtil.getUserString();
            p.setPhone(phone);
            saveChange();

        }else{
            System.out.println("data not found.");
        }

    }
	/*override delete method to delete the person details*/
    @Override
    public void deletePerson() {
		Person p = getPersonName();
        if(p != null ){
            repo.addressBook.remove(p);
            System.out.println("contact deleted");
            saveChange();
        }else{
            System.out.println("contact not found.");
        }

    }

	 @Override
    public void readData(){
        List<Person> list = ReadCsvData.read();
        if(list.isEmpty()){
            System.out.println("Nothing to load from file.");
        }else{
            for(Person obj : list){
                repo.addressBook.add(obj);
            }
            System.out.println("Data read from file");
        }
    }
		@Override
    public void sort(){
        System.out.println("1. Sort by name");
		  System.out.println("2. Sort by zip");
        System.out.print("Enter your choice: ");
        int choice = AddressBookUtil.getUserNumber();
        switch(choice){
            case 1:
                Collections.sort(repo.addressBook, Person.sortByName);
                display();
            break;
            case 2:
                Collections.sort(repo.addressBook, Person.sortByZip);
                display();
            break;
            default:
                System.out.println("Invalid input.");
        }
    }

    @Override
    public void display(){
        repo.displayContacts();
    }
	/*override method to save the changes made*/
	 @Override
	 public void saveChange() {
		WriteCsvData.write(repo.addressBook);
	 }
	  private Person getPersonName(){
        AddressBookUtil.getUserString();
        display();
        System.out.print("Enter first name of person you want to delete or edit: ");
        String firstName = AddressBookUtil.getUserString();
        Person p = findPerson(firstName);
        return p;
    }
		private Person findPerson(String firstName){
        Person returnPerson = null;
        for(Person p : repo.addressBook){
            if(firstName.equals(p.getFirstName())){
                returnPerson = p;
                break;
            }
        }
        return returnPerson;
		}
}
