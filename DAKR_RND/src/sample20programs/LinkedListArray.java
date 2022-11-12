package sample20programs;

         ///////////17. Java Program for Reverse a Linked List////////////////////

import java.util.*;  

public class LinkedListArray {

	// important import statement  
	  
	// first node or head of the list  
	static LinkedListNode head;   
	  
	static class LinkedListNode   
	{  
	// for containing the value of the node  
	int val;  
	  
	// the next pointer points to the other node of the list or null  
	LinkedListNode next;  
	  
	// constructor of the class  
	LinkedListNode(int d)  
	{  
	// assigning the values  
	val = d;  
	next = null;  
	}  
	}  
	  
	// method for count the total number of nodes   
	// present in the linked list  
	public int countNodes(LinkedListNode head)  
	{  
	// cnt stores the total number of nodes  
	// present in the linked list  
	int cnt = 0;  
	while(head != null)  
	{  
	// incrementing the count by 1  
	cnt = cnt + 1;  
	  
	// moving the head one step further  
	head = head.next;  
	}  
	  
	return cnt;  
	}  
	  
	// method where actual reversing of the list takes place  
	public LinkedListNode reverseList(LinkedListNode head, int size)  
	{  
	// array for storing the values of nodes of the linked list  
	int arr[] = new int[size];  
	  
	// loop for filling the array  
	for(int i = 0; i < size; i++)  
	{  
	arr[i] = head.val;  
	head = head.next;  
	}  
	  
	// i stores the last index of the array arr  
	int i = size - 1;  
	  
	// head1 refers to the first node of the linked list  
	LinkedListNode head1 = null;  
	  
	  
	while(i >= 0)  
	{  
	      
	if(head1 == null)  
	{  
	// creating the first node of the reversed linked list  
	head1 = new LinkedListNode(arr[i]);  
	head = head1;  
	}  
	else  
	{  
	// creating and appending the remaining nodes   
	// of the reversed linked list to the head1  
	head.next = new LinkedListNode(arr[i]);  
	head = head.next;  
	}  
	// iterating from end to beginning   
	// therefore, decreasing the i by 1  
	i = i - 1;  
	  
	}  
	  
	// returning the first node   
	// of the reversed linked list  
	return head1;  
	  
	  
	}  
	  
	  
	/* Method to display the linked list */  
	public void printList(LinkedListNode h)  
	{  
	LinkedListNode t = h;  
	while (t != null)   
	{  
	System.out.print(t.val + " ");  
	  
	// moving to the next node  
	t = t.next;  
	}  
	  
	System.out.println();  
	}  
	  
	  
	// main method  
	public static void main(String argvs[])  
	{  
	// creating an object of the class LinkedListArray  
	LinkedListArray listObj = new LinkedListArray();  
	  
	// 4 -> NULL  
	listObj.head = new LinkedListNode(4);  
	  
	// 4 -> 6 -> NULL  
	listObj.head.next = new LinkedListNode(6);  
	  
	// 4 -> 6 -> 7 -> NULL  
	listObj.head.next.next = new LinkedListNode(7);  
	  
	// 4 -> 6 -> 7 -> 1-> NULL  
	listObj.head.next.next.next = new LinkedListNode(1);  
	  
	// 4 -> 6 -> 7 -> 1-> 5 -> NULL  
	listObj.head.next.next.next.next = new LinkedListNode(5);  
	  
	// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> NULL  
	listObj.head.next.next.next.next.next = new LinkedListNode(8);  
	  
	// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> 3 -> NULL  
	listObj.head.next.next.next.next.next.next = new LinkedListNode(3);  
	  
	// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> 3 -> 2 -> NULL  
	listObj.head.next.next.next.next.next.next.next = new LinkedListNode(2);  
	  
	  
	System.out.println("The Linked list before reversal is: ");  
	listObj.printList(head);  
	  
	// size is the total number of nodes  
	// present in the linked list  
	int size = listObj.countNodes(head);  
	  
	head = listObj.reverseList(head, size);  
	System.out.println(" ");  
	System.out.println("After reversal, the linked list is: ");  
	listObj.printList(head);  
	  
	}  
	}  

