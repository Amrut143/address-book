package com.bridgelabz.codinclub.main;

import com.bridgelabz.codinclub.utils.ReadCsvData;
import com.bridgelabz.codinclub.utils.AddressBookUtil;
import com.bridgelabz.codinclub.services.AddressBookService;
import com.bridgelabz.codinclub.services.AddressBookServiceImpl;
import com.bridgelabz.codinclub.utils.AddressBookRepo;

/**
*This is the main class contains main method and handles allother packages and classes.
*@author:Amrut
*/
public class Main {
    public static void main(String[] args){
    	/*creating the implementation class object*/
        final AddressBookService addressBookService = new AddressBookServiceImpl(new AddressBookRepo());
        System.out.println("Welcome to my address book");
        while(true){
            System.out.print("View the options and choose\n1. Add contact \n2. View contact \n3. Edit contact \n4. Sort contacts \n5. Delete contact\n6. Quit \nEnter your choice: ");

            final int choice = AddressBookUtil.getUserNumber();
            switch(choice){
                case 1:
                    addressBookService.addPerson();
                    System.out.println("contact added::");
                break;
                case 2:
                    System.out.println("Displaying Contacts::");
                    addressBookService.display();
                break;
                case 3:
                    System.out.println("Edit contact: ");
                    addressBookService.editPerson();
                break;
                case 4:
                    System.out.println("Sort contact: ");
                break;
                case 5:
                    System.out.println("Delete contact: ");
                    addressBookService.deletePerson();
                break;
                case 6:
                    System.out.println("Quit...");
                    System.exit(0);
                case 7:
                    System.out.println("Reading data from csv file");
                    ReadCsvData.read();
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }

    }
}
