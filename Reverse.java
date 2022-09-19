package bootcamp;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int answer;
		//initializing two integers arrays for storing the input
		int[] a = new int[t];
		int[] b = new int[t];
		//getting inputs
		for(int i=0; i<t; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		for(int j=0; j<t; j++) {
			a[j] = reverse(a[j]);
			b[j] = reverse(b[j]);
			//adding the two reversed numbers and reversing the output
			answer = reverse(add(a[j],b[j]));
			System.out.println(answer);
		}
		scan.close();
	}
	//method to reverse a given number
	public static int reverse(int number) {
		int sum=0;
		int rem;
		while(number > 0) {
			rem = number %10;
			sum = sum*10 + rem;
			number /= 10;
		}
		return sum;
	}
	//method to add two numbers
	public static int add(int x, int y) {
		return(x+y);
	}
}
