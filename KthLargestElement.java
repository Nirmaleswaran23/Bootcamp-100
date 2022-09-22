package bootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.print(findKthLargest(nums, k));
		sc.close();
		}
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return(nums[nums.length - k]);
    }

}
