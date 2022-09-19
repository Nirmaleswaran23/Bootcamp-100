package bootcamp;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] arr = new int[t];
		for(int i=0; i<t; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<t; i++) {
			perfect(arr[i]);
		}
		scan.close();
	}
	public static void perfect(int x) {
		int i=1, sum=0;
		while(i <= x/2) {
			if(x%i == 0) {
				sum += i;
			}
			i++;
		}
		if(sum == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
