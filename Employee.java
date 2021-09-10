package payroll;

import java.util.Scanner;

public class Employee {
	
	String firstName; //creates firstName
	String lastName; //creates lastName
	String address; //creates address
	String phone; //creates phone
	String ssn; //creates ssn
	
	public Employee()
	{
		Scanner f = new Scanner(System.in); //user input 
		System.out.println("Enter your ssn: "); //enters ssn
		ssn = f.nextLine(); //reads input
		
		System.out.println("Enter your first name: "); //enters first name
		firstName = f.nextLine(); //reads input
		
		System.out.println("Enter your last name: "); //enters last name
		lastName = f.nextLine(); //reads input
		
		System.out.println("Enter your address: "); //enters address
		address = f.nextLine(); //reads input
		
		System.out.println("Enter your phone number: "); //enters phone number
		phone = f.nextLine(); //reads input
	}
	
	public Employee(String f, String l, String a, String p, String s)
	{
		super(); //allows for the super constructor
		firstName = f;
		lastName = l;
		address = a;
		phone = p;
		ssn = s;
	}
	
	public void setFirstName(String name) //set firstName
	{
		firstName = name;
	}
	
	public void setLastName(String name) //set lastName
	{
		lastName = name;
	}
	
	public void setSSN(String social) //set SSN
	{
		ssn = social;
	}
	
	public String getLastName() //gets lastName
	{
		return lastName;
	}
	
	public String getFirstName() //gets firstName
	{
		return firstName;
	}
	
	public String getSSN() //gets SSN
	{
		return ssn;
	}
	
	public String getAddress() //gets address
	{
		return address;
	}
	
	public String getPhone() //gets phone
	{
		return phone;
	}
	
	public String toString() //sets toString() to firstName lastName
	{
		return (firstName + " " + lastName + " " + ssn + " Gross Pay ");
	}
	
	public boolean equals(Object a) //creates a class object
	{
		if (a == null)
			return false;
		if (this == a)
			return true;
		if (getClass() != a.getClass())
			return false;
		if (address == null)
			return false;
		if (firstName == null)
			return false;
		if (lastName == null)
			return false;
		if (phone == null)
			return false;
		if (ssn == null)
			return false;
		else
			return true;
	}

}
