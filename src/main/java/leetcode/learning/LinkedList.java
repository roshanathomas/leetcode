package leetcode.learning;

public class LinkedList {

	private class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		
	}
	
	private Node head = null;
	private int size = 0;
	
	public Node addBack(int value)
	{
		Node node = new Node(value);
		
		if(head == null)
		{
			head = node;
			size++;
			return head;
		}
		else
		{
			Node root = head;
			while(root.next != null)
			{
				root = root.next;
			}
			
			root.next = node;
			size++;
			return root;
		}
	}
	
	public Node addFront(int value)
	{
		Node node = new Node(value);
		
		node.next = head;
		head = node;
		size++;
		
		return head;
	}
	
	
	public void print()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		
		System.out.println();
	}

	public int getFirst() {

		Node current = head;
		return current.data;
	}

	public int getLast() {
		
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		return current.data;
	}

	public int size() {
		return size;
	}

	public void deleteValue(int value) {

		Node current = head;
		
		if(current.data == value)
		{
			current = current.next;
			head = current;
			size--;
			return; 
		}
		
		while(current.next != null)
		{
			if(current.next.data == value)
			{
				current.next = current.next.next;
				size--;
				return;
			}
			current = current.next;
		}
		
	}

	public void clear() {

		head = null;
		size = 0;
	}
	
}
