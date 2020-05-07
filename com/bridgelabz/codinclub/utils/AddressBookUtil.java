package com.bridgelabz.codinclub.utils;
import java.util.Scanner;

	public final class AddressBookUtil {
	    private final static Scanner scanner = new Scanner(System.in);
		/*define default constructor and make is as private so that object cannot be created outside the class*/
	    private AddressBookUtil(){

	    }
	    public static int getUserNumber(){
	        return scanner.nextInt();
	    }
	    public static String getUserString(){
	        return scanner.nextLine();
	    }
	}


