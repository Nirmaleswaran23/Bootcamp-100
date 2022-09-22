package bootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class SubsequenceOfLengthK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int[] ans = maxSubsequence(nums, k);
		System.out.print(Arrays.toString(ans));
		sc.close();
	}
    public static int[] maxSubsequence(int[] nums, int k) {
    	int[] ans = new int[k];
        int l = nums.length,j=0;
        Arrays.sort(nums);
        for(int i=l-k; i<l; i++) {
        	ans[j] = nums[i];
        	j++;
        }
        return ans;
    }
}
