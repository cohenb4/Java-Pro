package LinkedList;

public class LinkedList 
{
	Node head; //head of list
	
	//Method to insert a new node
	public LinkedList insert(LinkedList list, String data)
	{
		//Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;
		
		if (list.head == null)
		{
			list.head = new_node;
		}
		
		else
		{
			Node current = list.head;
			Node back = null;
			while (current.next != null && current.name.compareTo(new_node.name)< 0)
			{
				back = current;
				current = current.next;
			}
			if((current.next == null && current == list.head) || current == list.head)
			{
				new_node.next = list.head;
				list.head = new_node;
			}
			else
				if(current.next == null && current.name.compareTo(new_node.name)< 0)
				{
					new_node.next = current.next;
					current.next = new_node;
				}
				else
				{
					new_node.next = current;
					back.next = new_node;
				}
		}
		
		return list;
	}
	
	public void printList(LinkedList list)
	{
		Node currNode = list.head;
		
		System.out.println("LinkedList: ");
		
		while (currNode != null)
		{
			System.out.println(currNode.name + " ");
			
			currNode = currNode.next;
		}
	}
	
}
