package bootcamp;
import java.util.Scanner;
import java.util.Arrays;
public class DivideArrayIntoEqualPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print(divideArray(nums));
		sc.close();
	}
    public static boolean divideArray(int[] nums) {
    	int l = nums.length;
    	Arrays.sort(nums);
    	if(l%2 != 0) {
    		return false;
    	}
    	for(int i=0; i<l; i++) {
    		if(nums[i] == nums[i+1]) {
    			i += 1;
    			continue;
    		}else {
    			return false;
    		}
    	}
        return true;
    }
}
