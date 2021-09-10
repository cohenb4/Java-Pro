package payroll;
import java.util.Scanner;

public class Piece extends Employee {

	int quantity; //declares quantity
	double pieceRate; //declares pieceRate
	
	public Piece()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter quantity: ");
		quantity = c.nextInt();
		
		System.out.println("Enter piece rate: ");
		pieceRate = c.nextDouble();
	}
	
	public Piece(String ssn, String firstName, String lastName, String address, String phone, int quan, double rate)
	{
		super();
		quantity = quan;
		pieceRate = rate;		
	}
	
	public void setQuantity(int quan)
	{
		quantity = quan;
	}
	
	public void setRate(double rate)
	{
		pieceRate = rate;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getRate()
	{
		return pieceRate;
	}
	
	public double getPay()
	{
		return quantity * pieceRate;
	}
	
	public String toString()
	{
		return (super.toString() + "$" + getPay());
	}
}
