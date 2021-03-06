package com.bridgelabz.codinclub.models;
import java.util.Comparator;
/**
*this is the person model class to define the required fields and setter getter methods
*@author:Amrut
*/
public class Person {
	 /*data of a person*/
    private final String firstName;
    private final String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;

    /*constructor to initialize the data of persons*/
    public Person(final String firstName, final String lastName, final String address, final String city, final String state, final String zipCode, final String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
    }
	  /*getter methods to get the data of persons*/
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZipCode(){
        return zipCode;
    }
    public String getPhone(){
        return phone;
    }
    /*setter methods to set the data of persons*/
    public void setAddress(final String address){
        this.address = address;
    }
    public void setCity(final String city){
        this.city = city;
    }
    public void setState(final String state){
        this.state = state;
    }
    public void setZipCode(final String zipCode){
        this.zipCode = zipCode;
    }
    public void setPhone(final String phone){
        this.phone = phone;
    }
	 public static Comparator<Person> sortByName = new Comparator<Person>(){
        public int compare(Person obj1, Person obj2){
            String name1 = obj1.getLastName();
            String name2 = obj2.getLastName();

            return name1.compareTo(name2);
        }
    };

    public static Comparator<Person> sortByZip = new Comparator<Person>(){
        public int compare(Person obj1, Person obj2){
            String zip1 = obj1.getZipCode();
            String zip2 = obj2.getZipCode();

            return zip1.compareTo(zip2);
        }
    };

}
