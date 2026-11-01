
public class Q1 {
	static class Node{
		private int data;
		private Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
	}
	
	private Node head;
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfterNode(int data, int value) {
		Node node = new Node(value);
		if(head==null) {
			addFirst(data);
		}else {
			Node temp = head;
			while(temp!=null) {
				if(temp.data == data) {
					node.next = temp.next;
					temp.next = node;
					return;
				}
				temp = temp.next;
			}
			if(temp==null) {
				System.out.println("Data is not Present");
				return;
			}
		}
	}
	
	public void insertBeforeNode(int data, int value) {
		Node node = new Node(value);
		if(head==null) {
			System.out.println("List is empty");
			return;
		}else if(head.data==data) {
			node.next = head;
			head = node;
		}else {
			Node temp = head;
			while(temp.next!=null && temp.next.data!=data) {
				temp = temp.next;
			}
			if(temp.next!=null) {
				node.next = temp.next;
				temp.next = node;
			}else {
				System.out.println("Data is not present");
			}
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Q1 obj = new Q1();
		obj.addFirst(40);
		obj.addFirst(30);
		obj.addFirst(20);
		obj.addFirst(10);
		obj.display();
		System.out.println("Insert data after 20 :");
		obj.insertAfterNode(20,25);
		obj.display();
		System.out.println("Insert data after 60 : ");
		obj.insertAfterNode(60,1000);
		obj.display();
		System.out.println("Insert Data before 40 : ");
		obj.insertBeforeNode(40, 2000);
		obj.display();
	}
	
	
}
