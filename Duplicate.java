package bootcamp;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print(containsDuplicate(nums));
		sc.close();
	}
    public static boolean containsDuplicate(int[] nums) {
    	HashSet<Integer> num = new HashSet<>();
    	for(int i=0; i<nums.length; i++) {
    		if(num.contains(nums[i]))return true;
    		num.add(nums[i]);
    	}
    	return false;
    }
}
