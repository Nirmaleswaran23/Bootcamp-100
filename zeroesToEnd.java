package bootcamp;
import java.util.*;
public class zeroesToEnd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}
		moveZeroes(nums);
		scan.close();
	}
	public static void moveZeroes(int[] nums) {
	     int n=nums.length;
	     if(n<2)
	         return;
	     int L=0,R=1;
	     while(R<n){
	    	 if(nums[L]!=0)
	            {
	                L++;
	                R++;
	            }
	            else if(nums[R]==0){
	                  R++;
	            }
	            else{
	                int temp=nums[R];
	                nums[R]=nums[L];
	                nums[L]=temp;
	            }
	     }
	     System.out.print(Arrays.toString(nums));
    }
}
