package bootcamp;

import java.util.Scanner;

public class rotatedSortedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}
		int target = scan.nextInt();
		System.out.print(search(nums, target));
		scan.close();
	}
    public static int search(int[] nums, int target) { 
        if(nums == null || nums.length == 0)return -1;
        int left = 0, right = nums.length-1;
        //finding out the position of smallest element
        while(left < right) {
        	int midpoint = left + (right - left)/2;
        	if(nums[midpoint] > nums[right]) {
        		left = midpoint+1;
        	}else {
        		right = midpoint;
        	}
        }
        int start = left;
        left = 0;
        right = nums.length-1;
        if(target >= nums[start] && target<= nums[right]) {
        	left = start;
        }else {
        	right = start;
        }
        //modified binary search
        while(left <= right) {
        	int midpoint = left + (right - left)/2;
        	if(nums[midpoint] == target) {
        		return midpoint;
        	}else if(nums[midpoint] < target){
        		left = midpoint+1;
        	}else {
        		right = midpoint-1;
        	}
        }
        return -1;
    }
}
