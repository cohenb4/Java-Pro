package payroll;
import java.util.Scanner;

public class Salaried extends Employee {

	double salary; //declares salary
	
	public Salaried()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		salary = s.nextDouble();
	}
	
	public Salaried(double salary)
	{
		super(); //refers to the parent class of Employee
		this.salary = salary; //sets instance salary to salary
	}
	
	public void setSalary(double s)
	{
		salary = s;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public double pay()
	{
		return salary;
	}
	
	public String toString()
	{
		return (super.toString() + "$" + pay());
	}
}
