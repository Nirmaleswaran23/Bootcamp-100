package bootcamp;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class DisappearedNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		List<Integer> res = findDisappearedNumbers(nums);
		System.out.print(res);
		sc.close();
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length, index = 0;
        for(int i=0; i<len; i++){
            index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                // This index visited already
                continue;
            }
            nums[index] = -1*nums[index];
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<len; i++){
            if(nums[i] > 0)
                res.add(i+1);
        }
        return res;
    }
}
