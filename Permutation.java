package bootcamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}
		List<List<Integer>> ans = permute(nums);
		System.out.print(ans);
		scan.close();
	}
	//function to produce permutation of the array
	public static void backTrack(List<List<Integer>> ans , List<Integer> temp , int[] nums){
	        if(temp.size() == nums.length){
	            ans.add(new ArrayList<>(temp));
	        }
	        else{
	            for(int i = 0 ; i < nums.length ; i++){
	                if(temp.contains(nums[i])) continue;
	                temp.add(nums[i]);
	                //recursive call to add subsequent arrays in the list
	                backTrack(ans , temp , nums);
	                temp.remove(temp.size() - 1);
	            }
	        }
	    }
	public static List<List<Integer>> permute(int[] nums) {
		    //checking constraint 1
		    if(nums.length < 1 || nums.length >6) {
		    	return null;
		    }
		    //checking constraint 2
		    for(int i=0; i<nums.length; i++) {
		    	if(nums[i] < -11 || nums[i] > 11) {
		    		return null;
		    	}
		    }
		    //checking constraint 3
		    int i, j;
		    for(i=0; i<nums.length-1; i++) {
		    	for(j=i+1; j<nums.length; j++) {
		    		if(nums[i] == nums[j]) {
		    			return null;
		    		}
		    	}
		    }
	        List<List<Integer>> ans = new ArrayList<>();
	        backTrack(ans , new ArrayList<>() , nums);
	        return ans;
	    }

}
