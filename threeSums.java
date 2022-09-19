package bootcamp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class threeSums {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//checking constraint 1
		if(n <3 || n>3001) {
			scan.close();
			return;
		}
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
			//checking constraint 2
			if(nums[i]<-100000 || nums[i]>100000) {
				scan.close();
				return;
			}
		}
		List<List<Integer>> ans = threeSum(nums);
		System.out.print(ans);
		scan.close();
	}
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new LinkedList<>();
		for(int i=0; i<nums.length-2; i++) {
			if(i==0 | (i>0 && nums[i] != nums[i-1])) {
				int low = i+1;
				int high = nums.length-1;
				int sum = 0-nums[i];
				while(low < high) {
					if(nums[low] + nums[high] == sum) {
						ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
						while(low < high && nums[low] == nums[low+1]) low++;
						while(low < high && nums[high] == nums[high-1]) high--;
						low++;
						high--;
					}else if(nums[low] + nums[high] > sum) {
						high--;
					}else {
						low++;
					}
				}
			}
		}
		return ans;
    }
}
