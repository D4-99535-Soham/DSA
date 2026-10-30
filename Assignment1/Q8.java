import java.util.HashMap;

public class Q8 {
	public static int firstOccurence(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		
		for(int i=0; i<arr.length; i++) {
			if(hm.get(arr[i])==1) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,-1,2,1,0,4,-1,7,8};
		
		int res = firstOccurence(arr);
		if(res!=-1) {
			System.out.println("First Non-repeating elements is : "+res);
		}else {
			System.out.println("All elements are repeated");
		}
	}
}
