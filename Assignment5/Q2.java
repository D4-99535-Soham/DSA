import java.util.HashMap;

public class Q2 {
	public static int findMode(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int a : arr) {
			hm.put(a, hm.getOrDefault(a, 0)+1);
		}
		int mode = 0;
		int key = -1;
		for(int a : hm.keySet()) {
			if(hm.get(a)>mode) {
				mode = hm.get(a);
				key = a;
			}
		}
		return key;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {10,20,10,30,30,10,50,30,10};
		int mode = findMode(arr);
		System.out.println("Mode = "+mode);
	}

}
