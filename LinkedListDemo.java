package LinkedList;
/*Programmer: Brendan Cohen
 * Date: 8/5/20
 * 
 * This program is designed to test the 
 * linkedlist to turn the list into an alphabetical order
 */

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList IS4010 = new LinkedList();
		
		//Load names into the linked list
		IS4010 = IS4010.insert(IS4010, "Lally");
		IS4010 = IS4010.insert(IS4010, "Aviles");
		IS4010 = IS4010.insert(IS4010, "Saito");
		IS4010 = IS4010.insert(IS4010, "Day");
		IS4010 = IS4010.insert(IS4010, "Able");
		
		//print out the linked list
		IS4010.printList(IS4010);
	}

}
