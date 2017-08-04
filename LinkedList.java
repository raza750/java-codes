public class LinkedList {
	
	Node current = null;
	Node current1 = null;
	public Node insert_end(Node n, int x)
	{
		
		Node p;
		if(n == null)
		{
			p = new Node(x);  
			n = p;
			current = p;
			return n;
		}
		p = new Node(x);
		current.next = p;
		current = p;
		return n;
	}
	public Node insert_beg(Node n, int x)
	{
		Node p;
		if(n == null)
		{
			p = new Node(x);
			n = p;
			return n;
		}
		p = new Node(x);
		p.next = n;
		n = p;
		return n;
	}
	
	public void print(Node n)
	{
		for(Node i = n; i != null; i = i.next)
		{
			System.out.println(i.data);
		}
	}
	
	
	public static void main(String []args) 
	{
		
			LinkedList l = new LinkedList();
			Node start = null;
			Node start1 = null;
			start = l.insert_end(start, 10);
			start = l.insert_end(start, 7);
			start = l.insert_end(start, 44);
			l.print(start);
			start1 = l.insert_beg(start1, 2);
			start1 = l.insert_beg(start1, 4);
			start1 = l.insert_beg(start1, 6);
			l.print(start1);
			
	}
}
class Node{
	int data;
	Node next;
	Node(int d)
	{
		this.data = d;
	}	
}
