package bootcamp;

import java.util.Scanner;

public class LargestBalancedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] str = new String[num];
		for(int i=0; i<num; i++) {
			str[i] = sc.nextLine();
		}
		for(int i=0; i<num; i++) {
			System.out.println(lbs(str[i]));
		}
		sc.close();
	}
	static int lbs(String str) {
		int[] temp = {0,0,0,0,0,0};
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(')temp[0]++;
			else if(str.charAt(i) == ')')temp[1]++;
			else if(str.charAt(i) == '[')temp[2]++;
			else if(str.charAt(i) == ']')temp[3]++;
			else if(str.charAt(i) == '{')temp[4]++;
			else if(str.charAt(i) == '}')temp[5]++;
		}
		int large = 0;
		for(int i=0; i<6; i+=2) {
			
			large += (Math.min(temp[i], temp[i+1])*2);
		}
		return large;
	}
}
/*5
0
(){}()[]
4
))[]]((
3
{{{{{{{}
2
[]{}]
2*/
