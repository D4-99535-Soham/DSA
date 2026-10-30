import java.util.Scanner;

public class Q1 {
	private final int SIZE;
	private int[] arr;
	private int front;
	private int rear;
	
	Q1(){
		SIZE = 5;
		front=rear=0;
		arr = new int[SIZE];
	}
	
	public boolean isFull() {
		return rear==SIZE;
	}
	public boolean isEmpty() {
		return front==rear;
	}
	public void offer(int value) {
		if(rear==SIZE) {
			System.out.println("Queue is Full");
			return;
		}
		arr[rear] = value;
		rear++;
	}
	
	public int poll() {
		if(rear==front) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int ele = arr[front];
		front++;
		return ele;
	}
	
	public int peek() {
		if(front==rear) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}
	
	public static void main(String[] args) {
		Q1 q = new Q1();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("0. EXIT\n1. PUSH\n2. POP\n3. PEEK");
			System.out.println("Enter the choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element to be push : ");
				int ele = sc.nextInt();
				q.offer(ele);
				break;
			case 2:
				System.out.println("Removed element : "+q.poll());
				break;
			case 3:
				System.out.println("Peeked Element : "+q.peek());
				break;
			}
			
		}while(choice!=0);
		sc.close();
	}

}
