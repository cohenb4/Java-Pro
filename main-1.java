package payroll;
import java.util.Scanner;
/*Programmer: Brendan Cohen
 * Date: 7/11/20
 * 
 * This program allows the user to input ssn, names, rates and displayes them in a formated payroll
 * as well as calcultes the results
 */
public class main {

	public static void main(String[] args) {
		
		double counts = 0; //creates a count for salaries
		double counth = 0; //creates a count for hourlies
		double countp = 0; //creates a count for pieces
		
		System.out.println("This will run 11 times to get all 11 people"); //lets user know before clutter
		
		Salaried one = new Salaried(); //instance 1
		counts += one.getSalary(); //adds salaries
		Salaried two = new Salaried(); //instance 2
		counts += two.getSalary(); //adds salaries
		Hourly three = new Hourly(); //instance 3
		counth += three.getPay(); //adds hourlies
		Salaried four = new Salaried(); //instance 4
		counts += four.getSalary(); //adds salaries
		Salaried five = new Salaried(); //instance 5
		counts += five.getSalary(); //adds salaries
		Hourly six = new Hourly(); //instance 6
		counth += six.getPay(); //adds hourlies
		Salaried seven = new Salaried(); //instance 7
		counts += seven.getSalary(); //adds salaries
		Piece eight = new Piece(); //instance 8
		countp += eight.getPay(); //adds pieces
		Piece nine = new Piece(); //instance 9
		countp += nine.getPay(); //adds pieces
		Piece ten = new Piece(); //instance 10
		countp += ten.getPay(); //adds pieces
		Hourly eleven = new Hourly(); //instance 11
		counth += eleven.getPay(); //adds hourlies
		
		System.out.println("Dewey, Cheatem, and How Law Firm");
		System.out.println("Payroll Report");
		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
		System.out.println(four.toString());
		System.out.println(five.toString());
		System.out.println(six.toString());
		System.out.println(seven.toString());
		System.out.println(eight.toString());
		System.out.println(nine.toString());
		System.out.println(ten.toString());
		System.out.println(eleven.toString());
		System.out.println("Average salaried employee gross pay: $" + counts / 5);
		System.out.println("Average hourly employee gross pay: $" + counth / 3);
		System.out.println("Average pieces employee gross pay: $" + countp / 3);
		
	}

}