import java.util.Scanner;

public class Q2 {
	private int[] arr;
	private int top;
	private final int SIZE;
	
	Q2(int size){
		top = size;
		SIZE = size;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}
	
	public boolean isFull() {
		return top == 0;
	}
	
	public void push(int val) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		top--;
		arr[top] = val;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int ele = arr[top];
		top++;
		return ele;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return arr[top];
	}
	
	public static void main(String[] args) {
		Q2 st = new Q2(5);
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
				st.push(ele);
				break;
			case 2:
				System.out.println("Removed element : "+st.pop());
				break;
			case 3:
				System.out.println("Peeked Element : "+st.peek());
				break;
			}
			
		}while(choice!=0);
		sc.close();
	}

}
