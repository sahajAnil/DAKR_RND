package sample20programs;

               /////////18. Java Program For Finding Length Of A Linked List/////////////                   

public int lengthOfLinkedList();

//Java program to count number of
//nodes in a linked list
//Linked list Node


	// Find length of linked list using iterative method
	
	{
	   Node temp=head;
	   int count = 0;{
	   while(temp!=null)
	   {
	  temp=temp.next;
	  count++;  
	   }
	    return count;
	}
	// Find length of linked list using recursion
	public int lengthOfLinkedListRec(Node head)
	{
	   Node temp=head;
	   if(temp==null)
	   {
	      return 0;
	    }
	   else
	   {
	      return 1+ lengthOfLinkedListRec(temp.next);
	    }
	}
	// used to delete node from start of linked list
	public Node deleteFirst() {
	  Node temp = head;
	  head = head.next;
	  return temp;
	}

}
