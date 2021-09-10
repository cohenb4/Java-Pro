package payroll;
import java.util.Scanner;

public class Hourly extends Employee {

	double payRate;
	double hoursWorked;
	
	public Hourly()
	{
		Scanner b = new Scanner(System.in);
		System.out.println("Enter your pay rate: ");
		payRate = b.nextDouble();
		
		System.out.println("Enter number of hours worked: ");
		hoursWorked = b.nextDouble();
	}
	
	public Hourly(double rate, double hours)
	{
		super(); //calls employee class
		payRate = rate;
		hoursWorked = hours;
	}
	
	public void setRate(double rate)
	{
		payRate = rate;
	}
	
	public void setHours(double hours)
	{
		hoursWorked = hours;
	}
	
	public double getRate()
	{
		return payRate;
	}
	
	public double getHours()
	{
		return hoursWorked;
	}
	
	public double getPay()
	{
		return payRate * hoursWorked;
	}
	
	public String toString()
	{
		return (super.toString() + "$" + getPay());
	}
	
}
