package com.bridgelabz.codinclub.utils;
import com.bridgelabz.codinclub.models.Person;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
/**
 * this class read data from csv file
 * @author:Amrut
 *
 */
public class ReadCsvData {
	 final private static List<Person> persons = new ArrayList<>();

	    public static List read(){
					BufferedReader fileReader=null;
	        try{
					String line;
	            fileReader = new BufferedReader(new FileReader("AddressBook.csv"));
	            /*read file in java line by line*/
	            while((line = fileReader.readLine()) != null) {
							String[] splitData = line.split(",");
								if (splitData.length > 0) {
  									Person P = new Person(splitData[0],splitData[1],splitData[2],splitData[3],splitData[4],splitData[5],splitData[6]);
  									persons.add(P);
								}
							}
	        }catch(Exception e){
	            e.printStackTrace();
	        }finally{
						try{
							fileReader.close();
						}catch (IOException e) {
							e.printStackTrace();
						}
	    		}
				return persons;
		}
}
