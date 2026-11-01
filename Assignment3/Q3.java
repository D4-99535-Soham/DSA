
public class Q3 {
	static class Node{
		private int data;
		private Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
	}
	private Node head,tail;
	Q3(){
		head=tail=null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	public void addFirst(int val) {
		Node newNode = new Node(val);
		
		if(head==null) {
			head = tail =  newNode;
			newNode.next = newNode;
		}else {
			newNode.next = head;
			head = newNode;
			tail.next = newNode;
		}
	}
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(head==null) {
			head=tail=newNode;
			newNode.next = newNode;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	public void deleteFirst() {
		if(head==null) {
			return;
		}else if(head==tail) {
			head=tail=null;
		}else {
			head = head.next;
			tail.next = head;
		}
	}
	public void deleteLast() {
		if(head==null) {
			return;
		}else if(head==tail) {
			head=tail=null;
		}else {
			Node temp = head;
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			temp.next = head;
			tail = temp;
		}
	}
	public void display() {
		if(head==null) {
			return;
		}
		Node temp = head;
		do {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}while(temp!=head);
		System.out.println();
	}
	public void addPosition(int pos, int data) {
		Node node = new Node(data);
		if(head==null) {
			head = tail = node;
			node.next = node;
			
		}else if(pos<=1) {
			node.next = head;
			head = node;
			tail.next = head;
		}else {
			Node temp = head;
			for(int i=1; i<pos-1 && temp.next!=null; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
			if(node.next==null) {
				tail = node;
				tail.next = head;
			}
		}
	}
	public void deletePosition(int pos) {
		if(head==null) {
			return;
		}else if(pos==1) {
			head = head.next;
			tail.next = head;
		}else {
			Node temp = head;
			for(int i=1; i<pos-1; i++) {
				temp = temp.next;
				if(temp.next==null) {
					return;
				}
			}
			temp.next = temp.next.next;
		}
	}
	public static void main(String[] args) {
		Q3 obj = new Q3();
		obj.addFirst(40);
		obj.addFirst(30);
		obj.addFirst(20);
		obj.addFirst(10);
		obj.display();
		System.out.print("After adding data in 3rd pos : ");
		obj.addPosition(3, 35);
		obj.display();
		
		System.out.print("After deleting data in 5th pos : ");
		obj.deletePosition(5);
		obj.display();		
	}
}
