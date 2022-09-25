package bootcamp;
import java.util.Scanner;
public class CheapestPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j=0; j<n; j++) {
			sc.nextLine();
			String s = sc.nextLine();
			int l = s.length();
			int aCost = sc.nextInt();
			int bCost = sc.nextInt();
			if(l<1 || l>10000 || l%2 != 0 || aCost > 100 || aCost < 1 || bCost < 1 || bCost > 100) {
				return;
			}
			for(int i=0; i<l; i++) {
				if(s.charAt(i) != 'a' && s.charAt(i) != 'b' && s.charAt(i) != '/') {
					return;
				}
			}
			int ans = Palindrome(s, l, aCost, bCost);
			System.out.println(ans);
		}
		sc.close();
		
	}
	public static int Palindrome(String s, int l, int aCost, int bCost) {
		int ans = 0, a=0, b=l-1;
		int cheapest = Math.min(aCost, bCost);
		while(b>a) {
			if(s.charAt(a) == s.charAt(b) && s.charAt(a) != '/') {
				a++;
				b--;
			}
			else {
				if(s.charAt(a) == '/' && s.charAt(b) == '/'){
					ans = ans+(cheapest*2);
					a++;
					b--;
				}
				else if(s.charAt(a) == '/') {
					if(s.charAt(b) == 'a') {
						ans += aCost;
						a++;
						b--;
					}else if(s.charAt(b) == 'b'){
						ans += bCost;
						a++;
						b--;
					}	
				}
				else if(s.charAt(b) == '/') {
					if(s.charAt(a) == 'a') {
						ans += aCost;
						a++;
						b--;
					}else if(s.charAt(a) == 'b'){
						ans += bCost;
						a++;
						b--;
					}
				}
				else {
					return -1;
				}
			}
		}
		return ans;
	}
}
