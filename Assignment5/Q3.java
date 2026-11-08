import java.util.Arrays;
import java.util.HashSet;

public class Q3 {
	public static boolean containsDuplicate(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		for(int a : arr) {
			hs.add(a);
		}
		return hs.size() != arr.length;
	}
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,1,1,3,3,4,3,2,4,2};
		int[] arr2 = new int[] {1,2,3,4};
		
		boolean ans1 = containsDuplicate(arr1);
		System.out.println(ans1);
		boolean ans2 = containsDuplicate(arr2);
		System.out.println(ans2);
	}

}
