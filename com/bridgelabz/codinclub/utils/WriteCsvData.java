package com.bridgelabz.codinclub.utils;
import com.bridgelabz.codinclub.models.Person;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *creating a class to write the perdon data into csv file.
 * @author:Amrut
 *
 */
public class WriteCsvData {
	 public static void write(Person person){
	        try{
	            PrintWriter pw = new PrintWriter("com/bridgelabz/codeinclub/utils/PersonData/AddressBook.csv");
	                String csv = person.getFirstName()+","+person.getLastName()+","+person.getAddress()+","+person.getCity()+","+person.getState()+","+person.getZipCode()+","+person.getPhone()+";";
	                pw.append(csv);
						 pw.close();
	            } catch (IOException ioe){
                        System.out.println("Error");
                        ioe.printStackTrace();
					}

				}
			}
