package com.bridgelabz.codinclub.utils;
import com.bridgelabz.codinclub.models.Person;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * this class read data from csv file
 * @author:Amrut
 *
 */
public class ReadCsvData {
	 final private static List<Person> persons = new ArrayList<>();
	 	/*split the fetching data into arraylist format*/
	    private static void split(String data){

	    }
	    public static void read(){
	        try{
	            File data = new File("com/bridgelabz/codeinclub/utils/PersonData/AddressBook.csv");
	            Scanner fileReader = new Scanner(data);
	            while(fileReader.hasNextLine()){
	                System.out.println(fileReader.nextLine());
	            }
	        }catch(FileNotFoundException fnf){
	            System.out.println("File not found");
	            fnf.printStackTrace();
	        }
	    }
}
