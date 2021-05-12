package src;

public class InsertNodeLL {
	
	static Node head;

	static class Node {
        int data;
        Node next;
        
        Node(int d) {
            data = d;
            next = null;
        }
	}
	
	static void insertAtMid(int x) {
        if (head == null)
            head = new Node(x);
        else {

            Node newNode = new Node(x);
 
            Node ptr = head;
            int len = 0;
 
            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }
 
            int count = ((len % 2) == 0) ? (len / 2) : (len + 1) / 2;
            ptr = head;
 
            while (count-- > 1)
                ptr = ptr.next;

            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }
	
	static void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

	public static void main(String[] args) {
		
		head = null;
        head = new Node(11);
        head.next = new Node(22);
        head.next.next = new Node(44);
        head.next.next.next = new Node(55);
        
        System.out.println("Before : ");
        display();
        
        insertAtMid(33);
        System.out.println("\nAfter : ");
        display();

	}

}
