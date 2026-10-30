import java.util.Scanner;

public class Q2 {
	public static int linearSearch(int[] arr, int key) {
		for(int i=arr.length-1; i>0; i--) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Enter key to be searched : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int[] arr = {1,2,4,5,6,7,7,8,9};
		
		int res = linearSearch(arr,key);
		if(res!=-1) {
			System.out.println("Last occurece of element "+key+" at "+res);
		}else {
			System.out.println("Element Not Found");
		}
	}

}
