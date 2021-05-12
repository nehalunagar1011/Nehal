package src;

public class RemoveEleLL {
	
	static class Node {
        int data;
        Node next;
        Node(int tmp) {data = tmp;}
    }
	
	static void display(Node head) {
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
	
	static void deletenode(Node head) {
        Node curr = head;

        while(curr != null) {

            Node temp = curr;
            while(temp != null && temp.data == curr.data) {
                temp = temp.next;
            }

            curr.next = temp;
            curr = curr.next;
        }
    }

	public static void main(String[] args) {
	
		Node n1 = new Node(11);
        Node n2 = new Node(22);
        Node n3 = new Node(33);
        Node n4 = new Node(33);
        Node n5 = new Node(44);
        Node n6 = new Node(55);
        Node n7 = new Node(55);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        
        System.out.print("Before : ");
        display(n1);
        deletenode(n1);
        System.out.println();
        System.out.print("\nAfter : ");
        display(n1);
	}

}
