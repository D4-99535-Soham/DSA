import java.util.Scanner;

public class Q5 {
	public static int fibo(int n) {
		if(n==2 || n==1) {
			return 1;
		}
		return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println(fibo(n));
	}

}
