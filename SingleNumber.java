package bootcamp;

import java.util.Scanner;

public class SingleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print(Number(nums));
		sc.close();
	}
    public static int Number(int[] nums) {
    	int ans=0;
    	/*while looping through the array, XOR 
    	operator will find out the answer */
    	for(int i=0; i<nums.length; i++) {
    		ans ^= nums[i];
    	}
        return ans;
    }
}
