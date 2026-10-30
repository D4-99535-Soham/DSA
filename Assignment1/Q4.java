import java.util.Scanner;

public class Q4 {
	public static int binarySearch(int[] arr, int key) {
		int s = 0;
		int e = arr.length-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]>key) {
				s = mid+1;
			}else {
				e = mid-1;
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
		
		int res = binarySearch(arr,key);
		
		if(res!=-1) {
			System.out.println("Element Found at index "+res);
		}else {
			System.out.println("Element Not Found");
		}
	}

}
