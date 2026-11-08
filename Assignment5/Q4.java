import java.util.HashMap;

public class Q4 {
	public static boolean validAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		int[] freq = new int[26];
		int n = s.length();
		for(int i=0; i<n; i++) {
			freq[s.charAt(i)-'a']++;
		}
		
		int m = t.length();
		for(int i=0; i<m; i++) {
			freq[t.charAt(i)-'a']--;
		}
		
		for(int a : freq) {
			if(a!=0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		boolean ans = validAnagram(s,t);
		System.out.println(ans);
	}

}
