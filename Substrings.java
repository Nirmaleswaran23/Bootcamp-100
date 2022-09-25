package bootcamp;

import java.util.Scanner;

public class Substrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(specialsubStr(s));
		sc.close();
	}
	static int specialsubStr(String str) {
		int ans = str.length();
		for(int i=0; i<str.length(); i++) {
			int repeat = 0;
			while(i+1<str.length() && str.charAt(i) == str.charAt(i+1)) {
				repeat++;
				i++;
			}
			ans += (repeat*(repeat+1))/2;
			int poller = 1;
			while(i-poller >= 0 && i+poller < str.length() && str.charAt(i+poller) == str.charAt(i-1) && str.charAt(i-poller) == str.charAt(i-1)) {
				ans++;
				poller++;
			}
		}
		return ans;
	}
}
