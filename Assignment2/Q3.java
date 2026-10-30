import java.util.Scanner;

public class Q3 {
	private int[] arr;
	private int front,rear;
	private int count;
	private final int SIZE;
	
	Q3(int size){
		arr = new int[size];
		SIZE = size;
		front=rear=-1;
		count=0;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public boolean isFull() {
		return count==SIZE;
	}
	public void push(int val) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		rear = (rear+1)%SIZE;
		arr[rear] = val;
		count++;	
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		front = (front+1)%SIZE;
		count--;
		return arr[front];
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		return arr[(front+1)%SIZE];
	}
	public static void main(String[] args) {
		Q3 obj = new Q3(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("0. EXIT\n1. OFFER\n2. POLL\n3. PEEK");
			System.out.println("Enter the choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element to be added : ");
				int ele = sc.nextInt();
				obj.push(ele);
				break;
			case 2:
				System.out.println("Removed Element : "+obj.pop());
				break;
			case 3:
				System.out.println("Peeked Element : "+obj.peek());
				break;
			}
		}while(choice!=0);
	}

}
