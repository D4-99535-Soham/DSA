import java.util.Scanner;

public class Q3 {
	public static int linearSearch(int[] arr, int key, int nth) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				--nth;
				if(nth==0) {
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();
		
		System.out.println("Enter nth occurence of key : ");
		int nth = sc.nextInt();
				
		int res = linearSearch(arr,key,nth);
		if(res!=-1) {
			System.out.println("Element Found at index "+res);
		}else {
			System.out.println("Element Not Found at nth occurence");
		}
	}
}
