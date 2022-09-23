package bootcamp;

import java.util.*;

public class LongestSubstringWithoutRepetition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(lengthOfLongestSubstring(s));
		sc.close();
	}
    public static int lengthOfLongestSubstring(String s) {
    	int a = 0, b=0;
    	int max = 0;
    	HashSet<Character> hash_set = new HashSet();
    	while(b <s.length()) {
    		if(!hash_set.contains(s.charAt(b))) {
    			hash_set.add(s.charAt(b));
    			b++;
    			max = Math.max(hash_set.size(), max);
    		}else {
    			hash_set.remove(s.charAt(a));
    			a++;
    		}
    	}
    	return max;
    }
}
