package bootcamp;

import java.util.Scanner;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print(minSubArrayLen(target, nums));
		sc.close();
	}
    public static int minSubArrayLen(int target, int[] nums) {
    	int result = Integer.MAX_VALUE;
    	int left = 0, val_sum = 0;
    	for(int i=0; i<nums.length; i++) {
    		val_sum += nums[i];
    		while(val_sum >=target) {
    			result = Math.min(result, i+1 - left);
    			val_sum -= nums[left];
    			left++;
    		}
    	}
    	return (result != Integer.MAX_VALUE) ? result : 0;
    }
}
