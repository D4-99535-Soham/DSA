import java.util.HashMap;
import java.util.Map;

public class Q1 {
	public static void countOccurence(String line) {
		HashMap<String,Integer> hm = new HashMap<>();
		String[] arr = line.toLowerCase().split(" ");
		int n = arr.length;
		for(int i =0; i<n; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		
		for(String key : hm.keySet()) {
			System.out.print(key +" : ");
			System.out.println(hm.get(key));
		}
	}
	public static void main(String[] args) {
		String line = "The quick brown fox jumps over the lazy dog The fox is quick";
		countOccurence(line);
	}

}
