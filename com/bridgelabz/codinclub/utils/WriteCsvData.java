package com.bridgelabz.codinclub.utils;
import com.bridgelabz.codinclub.models.Person;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;
/**
 *creating a class to write the perdon data into csv file.
 * @author:Amrut
 *
 */
public class WriteCsvData {
	 public static PrintWriter printWriter;
	 public static void write(List<Person> personList){
	        try{
	            printWriter = new PrintWriter("AddressBook.csv");
						for(Person person : personList){
	                String csv = person.getFirstName()+","+person.getLastName()+","+person.getAddress()+","+person.getCity()+","+person.getState()+","+person.getZipCode()+","+person.getPhone()+";";
	                printWriter.append(csv);
						}
						 System.out.println("write CSV successfully!");

						 printWriter.flush();
                   printWriter.close();

					}catch (IOException ioe){
                        System.out.println("Error");
                        ioe.printStackTrace();

               }
			}
	}
