package bootcamp;
import java.util.Scanner;
public class missingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print(missingNumber(nums));
		sc.close();
	}
	public static int missingNumber(int[] nums) {
		//sm finds the smallest number in the array
		//gr finds the biggest number in the array
		//sum1 gets the sum between elements in the array
		//sum2 gets the sum of all elements in the array
		int sum1=0, sum2=0, sm=nums[0], gr=nums[0];
		//looping through the array to find sum2, sm and gr
    	for(int i=0; i<nums.length; i++) {
    		sum2 += nums[i];
    		if(nums[i] < sm) {
    			sm = nums[i];
    		}
    		if(nums[i] > gr) {
    			gr = nums[i];
    		}
    	}
    	//looping between the sm and gr to find sum1
    	for(int i=sm; i<=gr; i++) {
    		sum1 += i;
    	}
    	//finding the answer using above data
    	if(sum1-sum2 != 0) {
    		return sum1-sum2;
    	}
    	else {
    		if(sm ==0){
                return gr+1;
            }else{
                return sm-1;
            }
    	}
    }
}
