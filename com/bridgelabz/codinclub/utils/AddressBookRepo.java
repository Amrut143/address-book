package com.bridgelabz.codinclub.utils;

import com.bridgelabz.codinclub.models.Person;
import com.bridgelabz.codinclub.utils.WriteCsvData;
import com.bridgelabz.codinclub.services.AddressBookServiceImpl;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
*this class add the data into csv file and display the data.
*@author:Amrut
*/
public class AddressBookRepo{
	/*creating arraylist object to store the data*/
    public final List<Person> addressBook = new ArrayList<>();

    public void addToAddressBook(final Person person){
        addressBook.add(person);
        WriteCsvData.write(addressBook);
        System.out.println("Contact added into file");
    }

    public void displayContacts(){
        for(Person obj : addressBook){
            System.out.println("*****************");
            System.out.println("FirstName: "+obj.getFirstName());
            System.out.println("LastName: "+obj.getLastName());
            System.out.println("Address: "+obj.getAddress());
            System.out.println("City: "+obj.getCity());
            System.out.println("State: "+obj.getState());
            System.out.println("ZipCode: "+obj.getZipCode());
            System.out.println("Phone: "+obj.getPhone());
        }
    }
}
