package bootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int[] ans = productExceptSelf(nums);
		System.out.print(Arrays.toString(ans));
		sc.close();
	}
	public static int[] productExceptSelf(int[] nums) {
		int l = nums.length;
		int[] ans = new int[l];
		ans[0] = 1;
		for(int i=1; i<l; i++) {
			ans[i] = nums[i-1]*ans[i-1]; 
		}
		int R = 1;
		for(int j=l-1; j>=0; j--) {
			ans[j] = ans[j] * R;
			R *= nums[j];
		}
		return ans;
    }
}
