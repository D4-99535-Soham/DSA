public class Q2 {
	static class Node{
		private int data;
		private Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
	}
	private Node head;
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	public void sort(int data) {
		Node node = new Node(data);
		if(head==null) {
			addFirst(data);
			return;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				if(temp.next.data>=data) {
					node.next = temp.next;
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
			if(temp.next==null) {
				temp.next = node;
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
	public static void main(String[] ags) {
		Q2 obj = new Q2();
		obj.addFirst(50);
		obj.addFirst(20);
		obj.addFirst(10);
		System.out.print("Before Sorting :");
		obj.display();
		System.out.println("After Adding Data into sorted list :");
		obj.sort(30);
		obj.sort(40);
		obj.sort(60);
		obj.display();
	}
}
